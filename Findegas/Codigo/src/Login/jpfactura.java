/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.ResultSet;
import java.sql.*;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.table.*;
import Login.conexion.*;
import javax.swing.JOptionPane;
import Login.usuarios.*;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.*;
import java.awt.print.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class jpfactura extends javax.swing.JPanel implements Printable{
   
   
    SqlUsuarios con = new SqlUsuarios();
    usuarios    usr     = new usuarios();
    conexion conn;
    double total1 = 0;
    
    public jpfactura() {
        initComponents(); 
        btimprimir.setVisible(false);
        this.jcbespecialista.setModel(con.Especialistas());
        Calendar fecha = new GregorianCalendar();
        //Obtenemos el valor del año, mes, día,
        //hora, minuto y segundo del sistema
        //usando el método get y el parámetro correspondiente                                                     
        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        txtfechafac.setText(""+ano+"/"+(mes+1)+"/"+dia+"");
        String ids = con.generarNumeroFactura();
        int id_facturas = Integer.parseInt(ids);
        id_facturas = id_facturas + 1;
        String idv = String.valueOf(id_facturas);
        txtnofactura.setText(idv);
        
        this.jtproductos.getModel().addTableModelListener(new TableModelListener() {
          public void tableChanged(TableModelEvent e) {
          if( e.getColumn()== 3 )
              suma();
          if( e.getColumn()== 0 )
              multiplicar();
          if( e.getColumn()== 2 )
              multiplicar();
      }
    });
        JComboBox jcb = new JComboBox(con.servicios());
        TableColumn tc = jtproductos.getColumnModel().getColumn(1);
        TableCellEditor tce = new DefaultCellEditor(jcb);
        tc.setCellEditor(tce);
    }
    
    public void mostrar(Clientes r){
        txtcliente.setText(r.getRazon_social());;
              
    }
    
     private void suma()
    {
        int vlr_unitario = 0;
        int numero = 0;
        int cantidad = 0;
        int total = 0;
        
        for( int i=0 ; i<jtproductos.getRowCount() ; i++)
        {
           try{
                numero = Integer.valueOf( jtproductos.getValueAt(i, 3).toString() );
            }
            catch (NumberFormatException nfe){ //si existe un error se coloca 0 a la celda
                jtproductos.setValueAt(0, i, 3);
            }
                total += numero;
        }
        this.txttotal.setText( String.valueOf(total) );
    }
    
     public void multiplicar()
    {
        int vlr_unitario = 0;
        int numero = 0;
        int cantidad = 0;
        
        for( int i=0 ; i<jtproductos.getRowCount() ; i++)
        {
            
           try{
                cantidad = Integer.valueOf( jtproductos.getValueAt(i, 0).toString() );
                vlr_unitario = Integer.valueOf( jtproductos.getValueAt(i, 2).toString() );
                numero = vlr_unitario * cantidad;
                this.jtproductos.setValueAt(numero, i, 3);
                
            }
            catch (NumberFormatException nfe){
                numero = 0;
                cantidad = 0;
                vlr_unitario = 0;
                jtproductos.setValueAt(numero, i, 3);
                jtproductos.setValueAt(0, i, 0);
                jtproductos.setValueAt(0, i, 2);
            }
                System.out.println(vlr_unitario);
                System.out.println(numero);
                
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpfacturar1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtidentificacion = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtcliente = new javax.swing.JLabel();
        btbuscar2 = new javax.swing.JButton();
        btimprimir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btsalir = new javax.swing.JButton();
        linea = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnofactura = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtproductos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txttotal = new javax.swing.JLabel();
        btinsertar = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        txtfechafac = new javax.swing.JLabel();
        jcbespecialista = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtobservaciones = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(630, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpfacturar1.setBackground(new java.awt.Color(255, 255, 255));
        jpfacturar1.setPreferredSize(new java.awt.Dimension(690, 650));
        jpfacturar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setText("Cliente:");
        jpfacturar1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jLabel26.setFont(new java.awt.Font("Hiragino Sans", 1, 14)); // NOI18N
        jLabel26.setText("ID:");
        jpfacturar1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, 25));
        jpfacturar1.add(txtidentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 120, 25));
        jpfacturar1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, 10));
        jpfacturar1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 200, 10));

        jLabel34.setFont(new java.awt.Font("Hiragino Sans", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Datos del Servicio");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpfacturar1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 201, 25));

        jLabel35.setFont(new java.awt.Font("Hiragino Sans", 1, 14)); // NOI18N
        jLabel35.setText("Observaciones:");
        jpfacturar1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        txtcliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jpfacturar1.add(txtcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 540, 25));

        btbuscar2.setBackground(new java.awt.Color(255, 255, 255));
        btbuscar2.setForeground(new java.awt.Color(51, 182, 215));
        btbuscar2.setText("Buscar");
        btbuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscar2ActionPerformed(evt);
            }
        });
        jpfacturar1.add(btbuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 90, 40));

        btimprimir.setBackground(new java.awt.Color(255, 255, 255));
        btimprimir.setForeground(new java.awt.Color(51, 182, 215));
        btimprimir.setText("Imprimir");
        btimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btimprimirActionPerformed(evt);
            }
        });
        jpfacturar1.add(btimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 90, 40));

        jLabel3.setFont(new java.awt.Font("Hiragino Sans", 1, 14)); // NOI18N
        jLabel3.setText("No. Factura:");
        jpfacturar1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 25));

        btsalir.setBackground(new java.awt.Color(255, 255, 255));
        btsalir.setForeground(new java.awt.Color(51, 182, 215));
        btsalir.setText("Salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });
        jpfacturar1.add(btsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 60, 40));

        linea.setForeground(new java.awt.Color(0, 0, 0));
        jpfacturar1.add(linea, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 230, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jpfacturar1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 230, -1));

        jLabel6.setFont(new java.awt.Font("Hiragino Sans", 1, 14)); // NOI18N
        jLabel6.setText("Firma Cliente");
        jpfacturar1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Hiragino Sans", 1, 14)); // NOI18N
        jLabel7.setText("Firma Especilista");
        jpfacturar1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));
        jpfacturar1.add(txtnofactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 100, 25));

        jLabel2.setFont(new java.awt.Font("Hiragino Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 182, 215));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FACTURA VENTA");
        jLabel2.setToolTipText("");
        jpfacturar1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 620, -1));

        jLabel8.setFont(new java.awt.Font("Hiragino Sans", 1, 14)); // NOI18N
        jLabel8.setText("Fecha:");
        jpfacturar1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, 25));

        jtproductos.setAutoCreateRowSorter(true);
        jtproductos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 1, true));
        jtproductos.setForeground(new java.awt.Color(51, 182, 215));
        jtproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(0), null,  new Integer(0),  new Integer(0)}
            },
            new String [] {
                "Cant.", "Descripcion", "Vl. Unitario", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtproductos.setSelectionBackground(new java.awt.Color(51, 204, 255));
        jScrollPane1.setViewportView(jtproductos);

        jpfacturar1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 610, 90));

        jLabel4.setFont(new java.awt.Font("Hiragino Sans", 1, 14)); // NOI18N
        jLabel4.setText("Total a Pagar:");
        jpfacturar1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, 25));

        txttotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jpfacturar1.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 120, 25));

        btinsertar.setBackground(new java.awt.Color(255, 255, 255));
        btinsertar.setForeground(new java.awt.Color(51, 182, 215));
        btinsertar.setText("Insertar");
        btinsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinsertarActionPerformed(evt);
            }
        });
        jpfacturar1.add(btinsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, 30));

        btguardar.setBackground(new java.awt.Color(255, 255, 255));
        btguardar.setForeground(new java.awt.Color(51, 182, 215));
        btguardar.setText("Guardar");
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });
        jpfacturar1.add(btguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 90, 40));

        txtfechafac.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtfechafac.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txtfechafac.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jpfacturar1.add(txtfechafac, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 110, 25));

        jcbespecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbespecialistaActionPerformed(evt);
            }
        });
        jpfacturar1.add(jcbespecialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 240, -1));

        txtobservaciones.setColumns(20);
        txtobservaciones.setRows(5);
        jScrollPane2.setViewportView(txtobservaciones);

        jpfacturar1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 610, 70));

        add(jpfacturar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));
    }// </editor-fold>//GEN-END:initComponents

       
    private void btbuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscar2ActionPerformed
        conexion_consulta modSql  = new conexion_consulta();
        
        String id_cliente = txtidentificacion.getText();
        System.out.println(id_cliente);
        Clientes r;
        r= modSql.existeCliente(id_cliente);
        if(r==null){
        }else{
            mostrar(r);
        }
    }//GEN-LAST:event_btbuscar2ActionPerformed

    private void btimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btimprimirActionPerformed
                try{
                    PrinterJob gap = PrinterJob.getPrinterJob();
                    gap.setPrintable(this);
                    boolean top = gap.printDialog();
                    if(top){
                        gap.print();
                    }
                }
                catch(PrinterException pex){
                    JOptionPane.showMessageDialog(null, "Error de Programa","Error\n"+pex, JOptionPane.INFORMATION_MESSAGE );
                    
                }
    }//GEN-LAST:event_btimprimirActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
            System.exit(0);
    }//GEN-LAST:event_btsalirActionPerformed

    private void btinsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinsertarActionPerformed
        DefaultTableModel temp = (DefaultTableModel) jtproductos.getModel();
        Object nuevo[]= {"0","","0","0"};
        temp.addRow(nuevo);
    }//GEN-LAST:event_btinsertarActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        PreparedStatement ps = null;
        SqlUsuarios modSql  = new SqlUsuarios();
        factura mod = new factura(); 
        FacturaDetalle dfact = new FacturaDetalle(); 
        
             for(int i = 0; i<jtproductos.getRowCount();i++){
                 int cantidad =  (int) jtproductos.getValueAt(i, 0);
                 String servicios =  (String) jtproductos.getValueAt(i, 1);
                 int vlr_unitario =   (int) jtproductos.getValueAt(i, 2);
                 int vlr_total =   (int) jtproductos.getValueAt(i, 3);
                 String ids_factura = new String(txtnofactura.getText());
                 
                 int id_factura = Integer.parseInt(ids_factura);
                 
                dfact.setCantidad(cantidad);
                dfact.setDescripcion(servicios);
                dfact.setVlr_unitario(vlr_unitario);
                dfact.setVlr_total(vlr_total);
                dfact.setId_factura(id_factura);
                
                modSql.GuardarDetalleFactura(dfact);
                
             }
        
        
        
            String ids = new String(txtnofactura.getText());
            String fecha = new String(txtfechafac.getText());           
            String id_clientes = new String(txtidentificacion.getText()); 
            String totals = new String(txttotal.getText()); 
            String observaciones = new String(txtobservaciones.getText()); 
            
            int id = Integer.parseInt(ids);
            int id_cliente = Integer.parseInt(id_clientes);
            int total = Integer.parseInt(totals);
            
            mod.setId_factura(id);
            mod.setCliente(id_cliente);
            mod.setFecha(fecha);
            mod.setTotal(total);
            mod.setObservaciones(observaciones);
           
            modSql.GuardarFactura(mod);
            
            
            JOptionPane.showMessageDialog(null, "se ha guardado correctamente la Factura: "+ ids);
            btimprimir.setVisible(true);
            
            
            
        
                   }//GEN-LAST:event_btguardarActionPerformed

            
    
    private void jcbespecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbespecialistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbespecialistaActionPerformed
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar2;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btimprimir;
    private javax.swing.JButton btinsertar;
    private javax.swing.JButton btsalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JComboBox<String> jcbespecialista;
    private javax.swing.JPanel jpfacturar1;
    private javax.swing.JTable jtproductos;
    private javax.swing.JSeparator linea;
    private javax.swing.JLabel txtcliente;
    private javax.swing.JLabel txtfechafac;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JLabel txtnofactura;
    private javax.swing.JTextArea txtobservaciones;
    private javax.swing.JLabel txttotal;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int index) throws PrinterException {
        if(index>0)
        {
            return NO_SUCH_PAGE;
        }
        Graphics2D hub = (Graphics2D) graphics;
        hub.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        hub.scale(pageFormat.getImageableWidth() / this.getWidth(), pageFormat.getImageableHeight() / this.getHeight());
        btimprimir.setVisible(false);
        btbuscar2.setVisible(false);
        btguardar.setVisible(false);
        btsalir.setVisible(false);
        btinsertar.setVisible(false);
        this.printAll(hub);
        btimprimir.setVisible(true);
        btbuscar2.setVisible(true);
        btguardar.setVisible(true);
        btsalir.setVisible(true);
        btinsertar.setVisible(true);
        
        return PAGE_EXISTS;
    }

}
