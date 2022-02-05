/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

/**
 *
 * @author jeissoncc
 */
public class jpcancela extends javax.swing.JPanel {
         SqlUsuarios con = new SqlUsuarios();
           conexion conn;
    /**
     * Creates new form jpcancela
     */
    public jpcancela() {
        initComponents();
        
        this.jcboxespecialistacan.setModel(con.Especialistas());
        
        Calendar fecha = new GregorianCalendar();
  
        //Obtenemos el valor del año, mes, día,
        //hora, minuto y segundo del sistema
        //usando el método get y el parámetro correspondiente                                                     
        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        txtfechacancela.setText(""+ano+"-"+(mes+1)+"-"+dia+"");
        
        conexion_consulta.conectar();
    }

    
    public void mostrar(Clientes r){
        txtclientecan.setText(r.getRazon_social());;
        txtcontactocan.setText(r.getResponsable());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpcancelar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtfechacancela = new javax.swing.JLabel();
        txtespecialistacan = new javax.swing.JLabel();
        txtcontactocan = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btbuscar1 = new javax.swing.JButton();
        btagendar2 = new javax.swing.JButton();
        btagendar3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_conse = new javax.swing.JTextField();
        btagendar4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtobservacan = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jcboxespecialistacan = new javax.swing.JComboBox<>();
        txtclientecan = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(630, 470));

        jpcancelar.setBackground(new java.awt.Color(255, 255, 255));
        jpcancelar.setMinimumSize(new java.awt.Dimension(630, 470));
        jpcancelar.setPreferredSize(new java.awt.Dimension(630, 470));
        jpcancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Hiragino Sans", 1, 14)); // NOI18N
        jLabel14.setText("Cliente:");
        jpcancelar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 25));

        txtfechacancela.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txtfechacancela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        txtfechacancela.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jpcancelar.add(txtfechacancela, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 175, 120, 25));

        txtespecialistacan.setFont(new java.awt.Font("Hiragino Sans", 1, 14)); // NOI18N
        txtespecialistacan.setText("Especialista que genera la Cancelación:");
        jpcancelar.add(txtespecialistacan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 25));

        txtcontactocan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jpcancelar.add(txtcontactocan, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 110, 470, 25));
        jpcancelar.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 10));
        jpcancelar.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 200, 10));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Datos del Servicio");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpcancelar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 201, -1));

        jLabel24.setFont(new java.awt.Font("Hiragino Sans", 1, 14)); // NOI18N
        jLabel24.setText("Observaciones:");
        jpcancelar.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        btbuscar1.setBackground(new java.awt.Color(255, 255, 255));
        btbuscar1.setForeground(new java.awt.Color(51, 182, 215));
        btbuscar1.setText("Buscar");
        btbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscar1ActionPerformed(evt);
            }
        });
        jpcancelar.add(btbuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 130, 40));

        btagendar2.setBackground(new java.awt.Color(255, 255, 255));
        btagendar2.setForeground(new java.awt.Color(51, 182, 215));
        btagendar2.setText("Guardar");
        btagendar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagendar2ActionPerformed(evt);
            }
        });
        jpcancelar.add(btagendar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 80, 40));

        btagendar3.setBackground(new java.awt.Color(255, 255, 255));
        btagendar3.setForeground(new java.awt.Color(51, 182, 215));
        btagendar3.setText("Cancelar");
        btagendar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagendar3ActionPerformed(evt);
            }
        });
        jpcancelar.add(btagendar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 80, 40));

        jLabel2.setFont(new java.awt.Font("Hiragino Sans", 1, 14)); // NOI18N
        jLabel2.setText("Consecutivo:");
        jpcancelar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, 25));

        txt_conse.setToolTipText("");
        jpcancelar.add(txt_conse, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 130, 25));

        btagendar4.setBackground(new java.awt.Color(255, 255, 255));
        btagendar4.setForeground(new java.awt.Color(51, 182, 215));
        btagendar4.setText("Salir");
        btagendar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagendar4ActionPerformed(evt);
            }
        });
        jpcancelar.add(btagendar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 60, 40));

        txtobservacan.setColumns(20);
        txtobservacan.setRows(5);
        jScrollPane1.setViewportView(txtobservacan);

        jpcancelar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 560, -1));

        jLabel22.setFont(new java.awt.Font("Hiragino Sans", 1, 14)); // NOI18N
        jLabel22.setText("Contacto:");
        jpcancelar.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 25));

        jLabel25.setFont(new java.awt.Font("Hiragino Sans", 1, 14)); // NOI18N
        jLabel25.setText("Fecha Cancelacion:");
        jpcancelar.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 175, -1, 25));

        jcboxespecialistacan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxespecialistacanActionPerformed(evt);
            }
        });
        jpcancelar.add(jcboxespecialistacan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 270, 25));

        txtclientecan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jpcancelar.add(txtclientecan, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 80, 470, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscar1ActionPerformed
        conexion_consulta modSql  = new conexion_consulta();
          
        
        String id_visita = txt_conse.getText();
        Clientes r;
        r= modSql.existeVisita(id_visita);
        if(r==null){
        
        }else{
            mostrar(r);
        }
    }//GEN-LAST:event_btbuscar1ActionPerformed

    private void btagendar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagendar2ActionPerformed
        SqlUsuarios modSql  = new SqlUsuarios();
            VisitaCancelada   mod     = new VisitaCancelada(); 
            
             String estado = new String("Cancelada"); 
             String fecha = new String(txtfechacancela.getText()); 
             String especialista = new String((String) jcboxespecialistacan.getSelectedItem()); 
             String observaciones = new String(txtobservacan.getText()); 
             
             mod.setEstado(estado);
             mod.setFecha(fecha);
             mod.setEspecialista(especialista);
             mod.setObservaciones(observaciones);
           
            
            modSql.CancelarVisita(mod);
            
            
            JOptionPane.showMessageDialog(null, "se ha atualizado el servicio a: "+estado);
            
    }//GEN-LAST:event_btagendar2ActionPerformed

    private void btagendar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagendar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btagendar3ActionPerformed

    private void btagendar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagendar4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btagendar4ActionPerformed

    private void jcboxespecialistacanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxespecialistacanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcboxespecialistacanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btagendar2;
    private javax.swing.JButton btagendar3;
    private javax.swing.JButton btagendar4;
    private javax.swing.JButton btbuscar1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> jcboxespecialistacan;
    private javax.swing.JPanel jpcancelar;
    private javax.swing.JTextField txt_conse;
    private javax.swing.JLabel txtclientecan;
    private javax.swing.JLabel txtcontactocan;
    private javax.swing.JLabel txtespecialistacan;
    private javax.swing.JLabel txtfechacancela;
    private javax.swing.JTextArea txtobservacan;
    // End of variables declaration//GEN-END:variables
}