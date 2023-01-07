
package View;


public class Menu_Administrador extends javax.swing.JFrame {

    public Menu_Administrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        background2 = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();
        txtIcon = new javax.swing.JLabel();
        txtMenuInvitados = new javax.swing.JLabel();
        btgProductos = new javax.swing.JButton();
        btgSdProductos = new javax.swing.JButton();
        btgInforme = new javax.swing.JButton();
        btVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de Administrador");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(297, Short.MAX_VALUE))
        );

        txtMenuInvitados.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        txtMenuInvitados.setText("MENÚ DE ADMINISTRADOR");

        btgProductos.setBackground(new java.awt.Color(51, 204, 255));
        btgProductos.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btgProductos.setForeground(new java.awt.Color(255, 255, 255));
        btgProductos.setText("GESTIONAR PRODUCTOS");
        btgProductos.setBorder(null);
        btgProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btgProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgProductosActionPerformed(evt);
            }
        });

        btgSdProductos.setBackground(new java.awt.Color(51, 204, 255));
        btgSdProductos.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btgSdProductos.setForeground(new java.awt.Color(255, 255, 255));
        btgSdProductos.setText("GESTIONAR STOCK DE PRODUCTOS");
        btgSdProductos.setBorder(null);
        btgSdProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btgSdProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgSdProductosActionPerformed(evt);
            }
        });

        btgInforme.setBackground(new java.awt.Color(51, 204, 255));
        btgInforme.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btgInforme.setForeground(new java.awt.Color(255, 255, 255));
        btgInforme.setText("GESTIONAR INFORME");
        btgInforme.setBorder(null);
        btgInforme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btgInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgInformeActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btgInforme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btgProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btgSdProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(txtMenuInvitados)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(txtMenuInvitados)
                .addGap(76, 76, 76)
                .addComponent(btgProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btgSdProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btgInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
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

    private void btgProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgProductosActionPerformed
        Gestion_Productos ventana = new Gestion_Productos();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btgProductosActionPerformed

    private void btgInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgInformeActionPerformed
        Gestion_Informe ventana = new Gestion_Informe();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btgInformeActionPerformed

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        Login ventana = new Login();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_btVolverActionPerformed

    private void btgSdProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgSdProductosActionPerformed
        Gestion_StockProducto ventana = new Gestion_StockProducto();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btgSdProductosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icon;
    private javax.swing.JPanel background2;
    private javax.swing.JButton btVolver;
    private javax.swing.JButton btgInforme;
    private javax.swing.JButton btgProductos;
    private javax.swing.JButton btgSdProductos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtIcon;
    private javax.swing.JLabel txtMenuInvitados;
    // End of variables declaration//GEN-END:variables
}
