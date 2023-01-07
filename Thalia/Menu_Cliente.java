
package View;


public class Menu_Cliente extends javax.swing.JFrame {

    public Menu_Cliente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        background = new javax.swing.JPanel();
        background2 = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();
        txtIcon = new javax.swing.JLabel();
        txtMenuInvitados = new javax.swing.JLabel();
        btgUsuario = new javax.swing.JButton();
        btgProveedores = new javax.swing.JButton();
        btgClientes = new javax.swing.JButton();
        btVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de Clientes");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        background.setBackground(new java.awt.Color(255, 255, 255));

        background2.setBackground(new java.awt.Color(51, 204, 255));
        background2.setForeground(new java.awt.Color(255, 255, 255));
        background2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/istockphoto-1293734400-612x612.jpg"))); // NOI18N
        Icon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconMouseClicked(evt);
            }
        });

        txtIcon.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        txtIcon.setForeground(new java.awt.Color(255, 255, 255));
        txtIcon.setText("FERRETERÍA COINCO");

        javax.swing.GroupLayout background2Layout = new javax.swing.GroupLayout(background2);
        background2.setLayout(background2Layout);
        background2Layout.setHorizontalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Icon)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        background2Layout.setVerticalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtMenuInvitados.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        txtMenuInvitados.setText("MENÚ DE CLIENTE");

        btgUsuario.setBackground(new java.awt.Color(51, 204, 255));
        btgUsuario.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btgUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btgUsuario.setText("VER PRODUCTOS");
        btgUsuario.setBorder(null);
        btgUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btgUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgUsuarioActionPerformed(evt);
            }
        });

        btgProveedores.setBackground(new java.awt.Color(51, 204, 255));
        btgProveedores.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btgProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btgProveedores.setText("OFERTAS");
        btgProveedores.setBorder(null);
        btgProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btgProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgProveedoresActionPerformed(evt);
            }
        });

        btgClientes.setBackground(new java.awt.Color(51, 204, 255));
        btgClientes.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btgClientes.setForeground(new java.awt.Color(255, 255, 255));
        btgClientes.setText("COTIZAR PRODUCTO");
        btgClientes.setBorder(null);
        btgClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btgClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgClientesActionPerformed(evt);
            }
        });

        btVolver.setBackground(new java.awt.Color(51, 204, 255));
        btVolver.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btVolver.setForeground(new java.awt.Color(255, 255, 255));
        btVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/vuelve.PNG"))); // NOI18N
        btVolver.setText("VOLVER");
        btVolver.setBorder(null);
        btVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btgClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btgUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btgProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(txtMenuInvitados)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(txtMenuInvitados)
                .addGap(81, 81, 81)
                .addComponent(btgUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btgProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btgClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconMouseClicked

    }//GEN-LAST:event_IconMouseClicked

    private void btgUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgUsuarioActionPerformed
        Ver_Productos ventana = new Ver_Productos();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btgUsuarioActionPerformed

    private void btgProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgProveedoresActionPerformed
        Ofertas ventana = new Ofertas();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_btgProveedoresActionPerformed

    private void btgClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgClientesActionPerformed
        Menu_Cotizacion ventana = new Menu_Cotizacion();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btgClientesActionPerformed

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        Login ventana = new Login();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_btVolverActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icon;
    private javax.swing.JPanel background;
    private javax.swing.JPanel background2;
    private javax.swing.JButton btVolver;
    private javax.swing.JButton btgClientes;
    private javax.swing.JButton btgProveedores;
    private javax.swing.JButton btgUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtIcon;
    private javax.swing.JLabel txtMenuInvitados;
    // End of variables declaration//GEN-END:variables
}
