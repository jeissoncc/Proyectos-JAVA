/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Login.usuarios;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author jeissoncc
 */
public class principal extends javax.swing.JFrame implements ActionListener{
  
    usuarios mod;
    
    
    jpagenda    jpagenda    = new jpagenda();
    jpcancela   jpcancela   = new jpcancela();
    jpfactura   jpfactura   = new jpfactura();
    jpnuser     jpnuser     = new jpnuser();
    jpeuser     jpeuser     = new jpeuser();
    jpncliente  jpncliente  = new jpncliente();
    jpdash      jpdash      = new jpdash();
    
    
    
    public principal() {
        initComponents(); 
        usuarios mod;
        
        jpiniuser.add(jpagenda);
        jpiniuser.add(jpcancela);
        jpiniuser.add(jpfactura);
        jpiniadmin.add(jpagenda);
        jpiniadmin.add(jpcancela);
        jpiniadmin.add(jpfactura); 
        jpiniadmin.add(jpfactura);
        jpiniadmin.add(jpncliente);        
        jpiniadmin.add(jpdash); 
        jpiniadminti.add(jpeuser);
        jpiniadminti.add(jpncliente);
        
        }

    public principal(usuarios mod) {
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;
        
        btagendaruser.addActionListener(this);
        btcancelaruser.addActionListener(this);
        btfacturaruser.addActionListener(this);
        btagendaradmin.addActionListener(this);
        btcancelaradmin.addActionListener(this);    
        btfacturaradmin.addActionListener(this);
        btadminclientes.addActionListener(this);
        btdash.addActionListener(this);
        btdadminusers.addActionListener(this);
        btnewcliente.addActionListener(this);
        
        System.out.println(":"+mod.getNombre_rol());
        System.out.println(":"+mod.getRol());
        
        if(mod.getRol() == 1)
         {
             
         }else if(mod.getRol() == 2)
         {
             this.panelPrincipal.setEnabledAt(1, false);
             
         }else if(mod.getRol() == 3)
         {
             this.panelPrincipal.setEnabledAt(0, false);
             this.panelPrincipal.setEnabledAt(1, false);
             this.panelPrincipal.setEnabledAt(2, false);
         }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object event = e.getSource();
        
        if(event.equals(btagendaruser)){
            jpagenda.setVisible(true);
            jpcancela.setVisible(false);
            jpfactura.setVisible(false);
            jpnuser.setVisible(false);
            jpeuser.setVisible(false);
            jpncliente.setVisible(false);
            jpdash.setVisible(false);
           
            
            jpiniuser.add(jpagenda);
            jpiniuser.validate();
            
        }else if(event.equals(btcancelaruser)){
            jpcancela.setVisible(true);
            jpagenda.setVisible(false);            
            jpfactura.setVisible(false);
            jpnuser.setVisible(false);
            jpeuser.setVisible(false);
            jpncliente.setVisible(false);
            jpdash.setVisible(false);
            
            jpiniuser.add(jpcancela);
            jpiniuser.validate();
            
         }else if(event.equals(btfacturaruser)){             
            jpfactura.setVisible(true);
            jpagenda.setVisible(false);
            jpcancela.setVisible(false);
            jpnuser.setVisible(false);
            jpeuser.setVisible(false);
            jpncliente.setVisible(false);
            jpdash.setVisible(false);
            
            jpiniuser.add(jpfactura);
            jpiniuser.validate();
            
         }else if(event.equals(btagendaradmin)){
            jpagenda.setVisible(true);            
            jpcancela.setVisible(false);
            jpfactura.setVisible(false);
            jpnuser.setVisible(false);
            jpeuser.setVisible(false);
            jpncliente.setVisible(false);
            jpdash.setVisible(false);
            
            jpiniadmin.add(jpagenda);
            jpiniadmin.validate();
            
         }else if(event.equals(btcancelaradmin)){
            jpcancela.setVisible(true);
            jpagenda.setVisible(false);            
            jpfactura.setVisible(false);
            jpnuser.setVisible(false);
            jpeuser.setVisible(false);
            jpncliente.setVisible(false);
            jpdash.setVisible(false);
            
            jpiniadmin.add(jpcancela);
            jpiniadmin.validate();
            
         }else if(event.equals(btfacturaradmin)){
            jpfactura.setVisible(true);
            jpagenda.setVisible(false);
            jpcancela.setVisible(false);            
            jpnuser.setVisible(false);
            jpeuser.setVisible(false);
            jpncliente.setVisible(false);
            jpdash.setVisible(false);
            
            jpiniadmin.add(jpfactura);
            jpiniadmin.validate();
            
         }else if(event.equals(btnewcliente)){
            jpncliente.setVisible(true);
            jpagenda.setVisible(false);
            jpcancela.setVisible(false);
            jpfactura.setVisible(false);
            jpnuser.setVisible(false);
            jpeuser.setVisible(false);            
            jpdash.setVisible(false);
            
            
            jpiniadmin.add(jpncliente);
            jpiniadmin.validate();
            
        }else if(event.equals(btdash)){
            jpdash.setVisible(true);
            jpagenda.setVisible(false);
            jpcancela.setVisible(false);
            jpfactura.setVisible(false);
            jpnuser.setVisible(false);
            jpeuser.setVisible(false);
            jpncliente.setVisible(false);
            
            jpiniadmin.add(jpdash);
            jpiniadmin.validate();
            
        }else if(event.equals(btadminclientes)){
            jpncliente.setVisible(true);
            jpagenda.setVisible(false);
            jpcancela.setVisible(false);
            jpfactura.setVisible(false);            
            jpeuser.setVisible(false);
            jpdash.setVisible(false);
            
            jpiniadminti.add(jpncliente);
            jpiniadminti.validate();
            
        }else if(event.equals(btdadminusers)){
            jpeuser.setVisible(true);
            jpagenda.setVisible(false);
            jpcancela.setVisible(false);
            jpfactura.setVisible(false);
            jpnuser.setVisible(false);            
            jpncliente.setVisible(false);
            jpdash.setVisible(false);
            
            jpiniadminti.add(jpeuser);
            jpiniadminti.validate();
            
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpprincipal = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JTabbedPane();
        Bienvenida = new javax.swing.JPanel();
        jPwelcome = new javax.swing.JPanel();
        jpfondo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbsalirprin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tabadminti = new javax.swing.JPanel();
        menutab1 = new javax.swing.JPanel();
        nameusr1 = new javax.swing.JLabel();
        btadminclientes = new javax.swing.JButton();
        btdadminusers = new javax.swing.JButton();
        jpiniadminti = new javax.swing.JPanel();
        tabadmin = new javax.swing.JPanel();
        menutabadmin = new javax.swing.JPanel();
        btfacturaradmin = new javax.swing.JButton();
        nameusradmin = new javax.swing.JLabel();
        btagendaradmin = new javax.swing.JButton();
        btcancelaradmin = new javax.swing.JButton();
        btdash = new javax.swing.JButton();
        btnewcliente = new javax.swing.JButton();
        jpiniadmin = new javax.swing.JPanel();
        tabusuario = new javax.swing.JPanel();
        menutab = new javax.swing.JPanel();
        btfacturaruser = new javax.swing.JButton();
        nameusr = new javax.swing.JLabel();
        btagendaruser = new javax.swing.JButton();
        btcancelaruser = new javax.swing.JButton();
        jpiniuser = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(856, 527));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(856, 527));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpprincipal.setBackground(new java.awt.Color(255, 255, 255));
        jpprincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpprincipal.setForeground(new java.awt.Color(255, 255, 255));
        jpprincipal.setMaximumSize(new java.awt.Dimension(650, 490));
        jpprincipal.setMinimumSize(new java.awt.Dimension(650, 490));
        jpprincipal.setPreferredSize(new java.awt.Dimension(650, 490));
        jpprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setToolTipText("");
        panelPrincipal.setFont(new java.awt.Font("Hiragino Sans", 0, 13)); // NOI18N
        panelPrincipal.setMinimumSize(new java.awt.Dimension(640, 47));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(650, 490));
        panelPrincipal.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                panelPrincipalComponentResized(evt);
            }
        });

        jPwelcome.setBackground(new java.awt.Color(255, 255, 255));

        jpfondo.setBackground(new java.awt.Color(255, 255, 255));
        jpfondo.setPreferredSize(new java.awt.Dimension(630, 470));
        jpfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Hiragino Sans", 1, 30)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 204, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("FINDEGAS");
        jpfondo.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, -1));

        titulo2.setFont(new java.awt.Font("Hiragino Sans", 1, 30)); // NOI18N
        titulo2.setForeground(new java.awt.Color(51, 204, 255));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("Bienvendido al Sistema de Gestion ");
        jpfondo.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, -1));

        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.jpg"))); // NOI18N
        jpfondo.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 830, 370));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("De Pereira");
        jpfondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 120, -1));

        jbsalirprin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        jbsalirprin.setBorder(null);
        jbsalirprin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirprinActionPerformed(evt);
            }
        });
        jpfondo.add(jbsalirprin, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel6.setText("Laboratorio de Software");
        jpfondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("2020");
        jpfondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 110, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel4.setText("Universidad Tecnologica");
        jpfondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabel1.setText("Licencia MIT");

        javax.swing.GroupLayout jPwelcomeLayout = new javax.swing.GroupLayout(jPwelcome);
        jPwelcome.setLayout(jPwelcomeLayout);
        jPwelcomeLayout.setHorizontalGroup(
            jPwelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPwelcomeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(721, Short.MAX_VALUE))
            .addGroup(jPwelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpfondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 630, Short.MAX_VALUE))
        );
        jPwelcomeLayout.setVerticalGroup(
            jPwelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPwelcomeLayout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(93, 93, 93))
            .addGroup(jPwelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPwelcomeLayout.createSequentialGroup()
                    .addComponent(jpfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout BienvenidaLayout = new javax.swing.GroupLayout(Bienvenida);
        Bienvenida.setLayout(BienvenidaLayout);
        BienvenidaLayout.setHorizontalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPwelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BienvenidaLayout.setVerticalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPwelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelPrincipal.addTab("", Bienvenida);

        tabadminti.setBackground(new java.awt.Color(255, 255, 255));

        menutab1.setBackground(new java.awt.Color(34, 161, 226));
        menutab1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));
        menutab1.setForeground(new java.awt.Color(255, 255, 255));
        menutab1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        menutab1.add(nameusr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 20));

        btadminclientes.setBackground(new java.awt.Color(255, 255, 255));
        btadminclientes.setForeground(new java.awt.Color(51, 182, 215));
        btadminclientes.setText("Clientes"); // NOI18N
        btadminclientes.setToolTipText("");
        btadminclientes.setPreferredSize(new java.awt.Dimension(145, 30));
        btadminclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadminclientesActionPerformed(evt);
            }
        });
        menutab1.add(btadminclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 40));

        btdadminusers.setBackground(new java.awt.Color(255, 255, 255));
        btdadminusers.setForeground(new java.awt.Color(51, 182, 215));
        btdadminusers.setText("Usuarios");
        btdadminusers.setPreferredSize(new java.awt.Dimension(145, 30));
        btdadminusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdadminusersActionPerformed(evt);
            }
        });
        menutab1.add(btdadminusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, 40));

        jpiniadminti.setBackground(new java.awt.Color(255, 255, 255));
        jpiniadminti.setSize(new java.awt.Dimension(630, 470));
        jpiniadminti.setLayout(new javax.swing.BoxLayout(jpiniadminti, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout tabadmintiLayout = new javax.swing.GroupLayout(tabadminti);
        tabadminti.setLayout(tabadmintiLayout);
        tabadmintiLayout.setHorizontalGroup(
            tabadmintiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabadmintiLayout.createSequentialGroup()
                .addComponent(menutab1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpiniadminti, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabadmintiLayout.setVerticalGroup(
            tabadmintiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabadmintiLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(tabadmintiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpiniadminti, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menutab1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(165, 165, 165))
        );

        panelPrincipal.addTab("Administrador TI", tabadminti);

        tabadmin.setBackground(new java.awt.Color(255, 255, 255));

        menutabadmin.setBackground(new java.awt.Color(34, 161, 226));
        menutabadmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));
        menutabadmin.setForeground(new java.awt.Color(255, 255, 255));
        menutabadmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btfacturaradmin.setBackground(new java.awt.Color(255, 255, 255));
        btfacturaradmin.setForeground(new java.awt.Color(51, 182, 215));
        btfacturaradmin.setText("Facturar Visita");
        btfacturaradmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfacturaradminActionPerformed(evt);
            }
        });
        menutabadmin.add(btfacturaradmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 130, 40));
        menutabadmin.add(nameusradmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 20));

        btagendaradmin.setBackground(new java.awt.Color(255, 255, 255));
        btagendaradmin.setForeground(new java.awt.Color(51, 182, 215));
        btagendaradmin.setText("Agendar Visita");
        btagendaradmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagendaradminActionPerformed(evt);
            }
        });
        menutabadmin.add(btagendaradmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 40));

        btcancelaradmin.setBackground(new java.awt.Color(255, 255, 255));
        btcancelaradmin.setForeground(new java.awt.Color(51, 182, 215));
        btcancelaradmin.setText("Cancelar Visita");
        btcancelaradmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelaradminActionPerformed(evt);
            }
        });
        menutabadmin.add(btcancelaradmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, 40));

        btdash.setBackground(new java.awt.Color(255, 255, 255));
        btdash.setForeground(new java.awt.Color(51, 182, 215));
        btdash.setText("DashBoard");
        btdash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdashActionPerformed(evt);
            }
        });
        menutabadmin.add(btdash, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, 40));

        btnewcliente.setBackground(new java.awt.Color(255, 255, 255));
        btnewcliente.setForeground(new java.awt.Color(51, 182, 215));
        btnewcliente.setText("Crear Cliente");
        btnewcliente.setPreferredSize(new java.awt.Dimension(130, 30));
        btnewcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnewclienteMouseClicked(evt);
            }
        });
        btnewcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnewclienteActionPerformed(evt);
            }
        });
        menutabadmin.add(btnewcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 130, 40));

        jpiniadmin.setBackground(new java.awt.Color(255, 255, 255));
        jpiniadmin.setLayout(new javax.swing.BoxLayout(jpiniadmin, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout tabadminLayout = new javax.swing.GroupLayout(tabadmin);
        tabadmin.setLayout(tabadminLayout);
        tabadminLayout.setHorizontalGroup(
            tabadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabadminLayout.createSequentialGroup()
                .addComponent(menutabadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpiniadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabadminLayout.setVerticalGroup(
            tabadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabadminLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(tabadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpiniadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menutabadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelPrincipal.addTab("Administrador", tabadmin);

        tabusuario.setBackground(new java.awt.Color(255, 255, 255));
        tabusuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menutab.setBackground(new java.awt.Color(34, 161, 226));
        menutab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));
        menutab.setForeground(new java.awt.Color(255, 255, 255));
        menutab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btfacturaruser.setBackground(new java.awt.Color(255, 255, 255));
        btfacturaruser.setForeground(new java.awt.Color(51, 182, 215));
        btfacturaruser.setText("Facturar Visita");
        btfacturaruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfacturaruserActionPerformed(evt);
            }
        });
        menutab.add(btfacturaruser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, 40));
        menutab.add(nameusr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 20));

        btagendaruser.setBackground(new java.awt.Color(255, 255, 255));
        btagendaruser.setForeground(new java.awt.Color(51, 182, 215));
        btagendaruser.setText("Agendar Visita");
        btagendaruser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btagendaruserMouseClicked(evt);
            }
        });
        btagendaruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagendaruserActionPerformed(evt);
            }
        });
        menutab.add(btagendaruser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 40));

        btcancelaruser.setBackground(new java.awt.Color(255, 255, 255));
        btcancelaruser.setForeground(new java.awt.Color(51, 182, 215));
        btcancelaruser.setText("Cancelar Visita");
        btcancelaruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelaruserActionPerformed(evt);
            }
        });
        menutab.add(btcancelaruser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 40));

        tabusuario.add(menutab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 187, 470));

        jpiniuser.setBackground(new java.awt.Color(255, 255, 255));
        jpiniuser.setLayout(new javax.swing.BoxLayout(jpiniuser, javax.swing.BoxLayout.LINE_AXIS));
        tabusuario.add(jpiniuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 630, 470));

        panelPrincipal.addTab("Usuario", tabusuario);

        jpprincipal.add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 520));

        getContentPane().add(jpprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelaruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelaruserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btcancelaruserActionPerformed

    private void btagendaruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagendaruserActionPerformed

    }//GEN-LAST:event_btagendaruserActionPerformed

    private void btagendaruserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btagendaruserMouseClicked

    }//GEN-LAST:event_btagendaruserMouseClicked

    private void btfacturaruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfacturaruserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btfacturaruserActionPerformed

    private void btnewclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnewclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnewclienteActionPerformed

    private void btnewclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnewclienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnewclienteMouseClicked

    private void btdashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btdashActionPerformed

    private void btcancelaradminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelaradminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btcancelaradminActionPerformed

    private void btagendaradminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagendaradminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btagendaradminActionPerformed

    private void btfacturaradminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfacturaradminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btfacturaradminActionPerformed

    private void btadminclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadminclientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btadminclientesActionPerformed

    private void panelPrincipalComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelPrincipalComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_panelPrincipalComponentResized

    private void jbsalirprinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirprinActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbsalirprinActionPerformed

    private void btdadminusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdadminusersActionPerformed
       
    }//GEN-LAST:event_btdadminusersActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bienvenida;
    private javax.swing.JButton btadminclientes;
    private javax.swing.JButton btagendaradmin;
    private javax.swing.JButton btagendaruser;
    private javax.swing.JButton btcancelaradmin;
    private javax.swing.JButton btcancelaruser;
    private javax.swing.JButton btdadminusers;
    private javax.swing.JButton btdash;
    private javax.swing.JButton btfacturaradmin;
    private javax.swing.JButton btfacturaruser;
    private javax.swing.JButton btnewcliente;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPwelcome;
    private javax.swing.JButton jbsalirprin;
    private javax.swing.JPanel jpfondo;
    private javax.swing.JPanel jpiniadmin;
    private javax.swing.JPanel jpiniadminti;
    private javax.swing.JPanel jpiniuser;
    private javax.swing.JPanel jpprincipal;
    private javax.swing.JPanel menutab;
    private javax.swing.JPanel menutab1;
    private javax.swing.JPanel menutabadmin;
    private javax.swing.JLabel nameusr;
    private javax.swing.JLabel nameusr1;
    private javax.swing.JLabel nameusradmin;
    private javax.swing.JTabbedPane panelPrincipal;
    private javax.swing.JPanel tabadmin;
    private javax.swing.JPanel tabadminti;
    private javax.swing.JPanel tabusuario;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables

}