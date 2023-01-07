
package View;

import javax.swing.JOptionPane;


public class Menu_Invitado extends javax.swing.JFrame {

    public Menu_Invitado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btVolver = new javax.swing.JButton();
        background3 = new javax.swing.JPanel();
        Icon1 = new javax.swing.JLabel();
        txtIcon1 = new javax.swing.JLabel();
        btCatalogo = new javax.swing.JButton();
        txtMenuInvitados = new javax.swing.JLabel();
        txtSugerencias = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de Invitado");
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

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

        background3.setBackground(new java.awt.Color(51, 204, 255));
        background3.setForeground(new java.awt.Color(255, 255, 255));
        background3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N

        Icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/istockphoto-1293734400-612x612.jpg"))); // NOI18N
        Icon1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Icon1MouseClicked(evt);
            }
        });

        txtIcon1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        txtIcon1.setForeground(new java.awt.Color(255, 255, 255));
        txtIcon1.setText("FERRETERÍA COINCO");

        javax.swing.GroupLayout background3Layout = new javax.swing.GroupLayout(background3);
        background3.setLayout(background3Layout);
        background3Layout.setHorizontalGroup(
            background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Icon1)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        background3Layout.setVerticalGroup(
            background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(Icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        btCatalogo.setBackground(new java.awt.Color(51, 204, 255));
        btCatalogo.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btCatalogo.setForeground(new java.awt.Color(255, 255, 255));
        btCatalogo.setText("CATÁLOGO DE PRODUCTOS");
        btCatalogo.setBorder(null);
        btCatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCatalogoActionPerformed(evt);
            }
        });

        txtMenuInvitados.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        txtMenuInvitados.setText(" MENÚ DE INVITADO");

        txtSugerencias.setBackground(new java.awt.Color(51, 204, 255));
        txtSugerencias.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txtSugerencias.setForeground(new java.awt.Color(255, 255, 255));
        txtSugerencias.setText("SUGERENCIAS");
        txtSugerencias.setBorder(null);
        txtSugerencias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSugerencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSugerenciasActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INFORMACIÓN");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(txtMenuInvitados))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSugerencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(background3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(txtMenuInvitados)
                .addGap(79, 79, 79)
                .addComponent(btCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(txtSugerencias, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addComponent(background3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        Login ventana = new Login();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_btVolverActionPerformed

    private void Icon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icon1MouseClicked

    }//GEN-LAST:event_Icon1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(rootPane,"Ubicación: Luis Cuní / Pilar & Calzada General Betancourt, #12730", "Información", WIDTH);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSugerenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSugerenciasActionPerformed
        JOptionPane.showMessageDialog(rootPane, "En desarrollo, estará listo para la próxima beta.", "Sugerencias", WIDTH);
    }//GEN-LAST:event_txtSugerenciasActionPerformed

    private void btCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCatalogoActionPerformed
        Catalogo_Productos ventana = new Catalogo_Productos();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btCatalogoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icon1;
    private javax.swing.JPanel background;
    private javax.swing.JPanel background3;
    private javax.swing.JButton btCatalogo;
    private javax.swing.JButton btVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel txtIcon1;
    private javax.swing.JLabel txtMenuInvitados;
    private javax.swing.JButton txtSugerencias;
    // End of variables declaration//GEN-END:variables
}
