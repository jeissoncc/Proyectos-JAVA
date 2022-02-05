/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;
import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jeisson
 */
public class Zoologico extends javax.swing.JFrame {

    public Zoologico() {
        initComponents();
        this.setLocationRelativeTo(null);
        
      
    }
    
    void mostrardatos(String valor){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("IDENTIFICACION");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("NICK");
        modelo.addColumn("TIPO");
        modelo.addColumn("EDAD");
        tbdieta.setModel(modelo);
        
        String sql="";
        if(valor.equals(""))
        {
            sql="";
        }else{
            sql="SELECT * FROM registro WHERE identificacion='"+valor+"'";
        }
           
        
        String []datos = new String[5];
        try {
            Statement st = nm.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                modelo.addRow(datos);
            }
            tbdieta.setModel(modelo);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Zoologico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     void mostrardatos1(String valor){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("IDENTIFICACION");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("NICK");
        modelo.addColumn("TIPO");
        modelo.addColumn("EDAD");        
        tbprev.setModel(modelo);
        
        String sql="";
        if(valor.equals(""))
        {
            sql="";
        }else{
            sql="SELECT * FROM registro WHERE identificacion='"+valor+"'";
        }
           
        
        String []datos = new String[5];
        try {
            Statement st = nm.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                modelo.addRow(datos);
            }
            
            tbprev.setModel(modelo);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Zoologico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
     void mostrardatos2(String valor){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("IDENTIFICACION");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("NICK");
        modelo.addColumn("TIPO");
        modelo.addColumn("EDAD");
        tbmed.setModel(modelo);
       
        String sql="";
        if(valor.equals(""))
        {
            sql="";
        }else{
            sql="SELECT * FROM registro WHERE identificacion='"+valor+"'";
        }
           
        
        String []datos = new String[5];
        try {
            Statement st = nm.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                modelo.addRow(datos);
            }
           
            tbmed.setModel(modelo);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Zoologico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
     void mostrardatos3(String valor){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("IDENTIFICACION");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("NICK");
        modelo.addColumn("TIPO");
        modelo.addColumn("EDAD");
        tbinter.setModel(modelo);
        String sql="";
        if(valor.equals(""))
        {
            sql="";
        }else{
            sql="SELECT * FROM registro WHERE identificacion='"+valor+"'";
        }
           
        
        String []datos = new String[5];
        try {
            Statement st = nm.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                modelo.addRow(datos);
            }
            tbinter.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(Zoologico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtbusq = new javax.swing.JTextField();
        btbuscar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdieta = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtdieta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtvet = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtfec = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btbuscar1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbprev = new javax.swing.JTable();
        txtbusq1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtvac = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtvet1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtexa = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtdesp = new javax.swing.JTextField();
        txtfec1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtbusq2 = new javax.swing.JTextField();
        btbuscar2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbmed = new javax.swing.JTable();
        txtvet2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtfec2 = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        txttipo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtpres = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtdosis = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtbusq3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        btbuscar3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbinter = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        txtvet3 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txttipo1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtmotivo = new javax.swing.JTextField();
        txtfec3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Salirzoo = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        txtbusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusqActionPerformed(evt);
            }
        });
        jPanel1.add(txtbusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, 26));

        btbuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btbuscar.setForeground(new java.awt.Color(255, 255, 255));
        btbuscar.setText("Buscar");
        btbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbuscarMouseClicked(evt);
            }
        });
        jPanel1.add(btbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 50, 20));

        tbdieta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbdieta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 570, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ingrese dieta");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        txtdieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdietaActionPerformed(evt);
            }
        });
        jPanel1.add(txtdieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 260, 100));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Veterinario");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));
        jPanel1.add(txtvet, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 190, 26));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("fecha");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));
        jPanel1.add(txtfec, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 190, 26));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/resize-img.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 270));

        jTabbedPane1.addTab("Dietas", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btbuscar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btbuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btbuscar1.setText("Buscar");
        btbuscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbuscar1MouseClicked(evt);
            }
        });
        jPanel2.add(btbuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 50, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        tbprev.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbprev);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 570, 50));

        txtbusq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusq1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtbusq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, 26));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Vacuna");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        jPanel2.add(txtvac, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 190, 26));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("fecha");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));
        jPanel2.add(txtvet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 190, 26));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Examenes");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Veterinario");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));
        jPanel2.add(txtexa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 190, 26));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Desparacitacion");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        jPanel2.add(txtdesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 190, 26));
        jPanel2.add(txtfec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 190, 26));

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/resize-img.jpg"))); // NOI18N
        jLabel4.setText("jLabel3");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 280));

        jTabbedPane1.addTab("Prevencion", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        txtbusq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusq2ActionPerformed(evt);
            }
        });
        jPanel3.add(txtbusq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, 26));

        btbuscar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btbuscar2.setForeground(new java.awt.Color(255, 255, 255));
        btbuscar2.setText("Buscar");
        btbuscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbuscar2MouseClicked(evt);
            }
        });
        jPanel3.add(btbuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 50, 20));

        tbmed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbmed);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 570, 50));
        jPanel3.add(txtvet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 190, 26));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Veterinario");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("fecha");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));
        jPanel3.add(txtfec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 190, 26));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Tipo");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));
        jPanel3.add(txttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 26));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Presentacion");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 130, 80, -1));
        jPanel3.add(txtpres, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 90, 26));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Dosis");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));
        jPanel3.add(txtdosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 90, 26));

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/resize-img.jpg"))); // NOI18N
        jLabel5.setText("jLabel3");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 280));

        jTabbedPane1.addTab("Medicina", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtbusq3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusq3ActionPerformed(evt);
            }
        });
        jPanel4.add(txtbusq3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, 26));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("ID");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        btbuscar3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btbuscar3.setForeground(new java.awt.Color(255, 255, 255));
        btbuscar3.setText("Buscar");
        btbuscar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbuscar3MouseClicked(evt);
            }
        });
        jPanel4.add(btbuscar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 50, 20));

        tbinter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tbinter);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 570, 50));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Veterinario");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));
        jPanel4.add(txtvet3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 190, 26));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("fecha");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Procedimiento de intevencion");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Tipo");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        jPanel4.add(txttipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 200, 26));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Motivo");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel4.add(txtmotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 200, 70));
        jPanel4.add(txtfec3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 190, 26));

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/resize-img.jpg"))); // NOI18N
        jLabel6.setText("jLabel3");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 280));

        jTabbedPane1.addTab("Intervencion", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 630, 290));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMINISTRADOR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        Salirzoo.setBackground(new java.awt.Color(0, 153, 255));
        Salirzoo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Salirzoo.setForeground(new java.awt.Color(255, 255, 255));
        Salirzoo.setText("Salir");
        Salirzoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirzooActionPerformed(evt);
            }
        });
        getContentPane().add(Salirzoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 80, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/elephant.png"))); // NOI18N
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Leopard.png"))); // NOI18N
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/hipo1.png"))); // NOI18N
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, -1, 170));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/jirafa.png"))); // NOI18N
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("ZOOLOGICO");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 153, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Menu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/resize-img.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbuscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscar2MouseClicked
        mostrardatos2(txtbusq2.getText());
    }//GEN-LAST:event_btbuscar2MouseClicked

    private void txtbusq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusq2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusq2ActionPerformed

    private void txtbusq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusq1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusq1ActionPerformed

    private void btbuscar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscar1MouseClicked
        mostrardatos1(txtbusq1.getText());
    }//GEN-LAST:event_btbuscar1MouseClicked

    private void txtdietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdietaActionPerformed

    private void txtbusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusqActionPerformed

    private void txtbusq3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusq3ActionPerformed
  mostrardatos3(txtbusq3.getText());
    }//GEN-LAST:event_txtbusq3ActionPerformed

    private void btbuscar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscar3MouseClicked
        mostrardatos3(txtbusq3.getText());
        
        
    }//GEN-LAST:event_btbuscar3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            PreparedStatement pst1 = nm.prepareStatement("INSERT INTO dieta(codigoa,Dieta,veterinario,fecha) VALUES(?,?,?,?)");
            
            pst1.setString(1, txtbusq.getText());
            pst1.setString(2, txtdieta.getText());
            pst1.setString(3, txtvet.getText());            
            pst1.setString(4, txtfec.getText());           
            pst1.executeUpdate();            
        } catch (SQLException e) {
        }
         txtbusq.setText("");        
         txtdieta.setText("");
         txtfec.setText("");
         txtvet.setText("");
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        try {
            PreparedStatement pst1= nm.prepareStatement("INSERT INTO preven(codigob,vacu,exam,despa,vetb,fechab) VALUES(?,?,?,?,?,?)");
            pst1.setString(1, txtbusq1.getText());
            pst1.setString(2, txtvac.getText());
            pst1.setString(3, txtexa.getText());
            pst1.setString(4, txtdesp.getText());
            pst1.setString(5, txtvet1.getText());
            pst1.setString(6, txtfec1.getText());
            pst1.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Zoologico.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtbusq1.setText("");
        txtvac.setText("");
        txtexa.setText("");
        txtdesp.setText("");
        txtvet1.setText("");
        txtfec1.setText("");
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try {
            PreparedStatement pst1= nm.prepareStatement("INSERT INTO medicina(codigoc,tipomed,presen,dosis,veterinarioc,fechac) VALUES(?,?,?,?,?,?)");
            pst1.setString(1, txtbusq2.getText());
            pst1.setString(2, txttipo.getText());
            pst1.setString(3, txtpres.getText());
            pst1.setString(4, txtdosis.getText());
            pst1.setString(5, txtvet2.getText());
            pst1.setString(6, txtfec2.getText());
            pst1.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Zoologico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        txtbusq2.setText("");
        txttipo.setText("");
        txtpres.setText("");
        txtdosis.setText("");
        txtvet2.setText("");
        txtfec2.setText("");
        

        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        try {
            PreparedStatement pst1= nm.prepareStatement("INSERT INTO intervencion(codigod,tipod,motivo,veterinariod,fechad) VALUES(?,?,?,?,?)");
            pst1.setString(1, txtbusq3.getText());
            pst1.setString(2, txttipo1.getText());
            pst1.setString(3, txtmotivo.getText());
            pst1.setString(4, txtvet3.getText());
            pst1.setString(5, txtfec3.getText());
            
            pst1.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Zoologico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        txtbusq3.setText("");
        txttipo1.setText("");
        txtmotivo.setText("");        
        txtvet3.setText("");
        txtfec3.setText("");
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscarMouseClicked
        mostrardatos(txtbusq.getText());
    }//GEN-LAST:event_btbuscarMouseClicked

    private void SalirzooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirzooActionPerformed
         dispose();
    }//GEN-LAST:event_SalirzooActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Principal prin=new Principal();
        prin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Zoologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zoologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zoologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zoologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Zoologico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salirzoo;
    private javax.swing.JLabel btbuscar;
    private javax.swing.JLabel btbuscar1;
    private javax.swing.JLabel btbuscar2;
    private javax.swing.JLabel btbuscar3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbdieta;
    private javax.swing.JTable tbinter;
    private javax.swing.JTable tbmed;
    private javax.swing.JTable tbprev;
    private javax.swing.JTextField txtbusq;
    private javax.swing.JTextField txtbusq1;
    private javax.swing.JTextField txtbusq2;
    private javax.swing.JTextField txtbusq3;
    private javax.swing.JTextField txtdesp;
    private javax.swing.JTextField txtdieta;
    private javax.swing.JTextField txtdosis;
    private javax.swing.JTextField txtexa;
    private javax.swing.JTextField txtfec;
    private javax.swing.JTextField txtfec1;
    private javax.swing.JFormattedTextField txtfec2;
    private javax.swing.JTextField txtfec3;
    private javax.swing.JTextField txtmotivo;
    private javax.swing.JTextField txtpres;
    private javax.swing.JTextField txttipo;
    private javax.swing.JTextField txttipo1;
    private javax.swing.JTextField txtvac;
    private javax.swing.JTextField txtvet;
    private javax.swing.JTextField txtvet1;
    private javax.swing.JTextField txtvet2;
    private javax.swing.JTextField txtvet3;
    // End of variables declaration//GEN-END:variables
conectar nom=new conectar();
        Connection nm= nom.conexion(); 
}
