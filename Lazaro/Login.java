
package View;

import Controller.GuardarDatos;
import javax.swing.JOptionPane;
import Model.Usuario;
import java.util.ArrayList;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        
        this.setTitle("Ferreteria Coinco");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        txtIniciarSesion = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        txtfUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        pssfContraseña = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        btEntrar1 = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        btIniciarInvitado = new javax.swing.JButton();
        background2 = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();
        txtIcon = new javax.swing.JLabel();
        txtContactos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ferretería Coinco");
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

        txtIniciarSesion.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        txtIniciarSesion.setText("INICIAR SESIÓN");

        txtUsuario.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtUsuario.setText("USUARIO");

        txtfUsuario.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        txtfUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtfUsuario.setBorder(null);
        txtfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtfUsuarioMouseClicked(evt);
            }
        });
        txtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfUsuarioActionPerformed(evt);
            }
        });

        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 19));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel1.setText("CONTRASEÑA");

        pssfContraseña.setForeground(new java.awt.Color(153, 153, 153));
        pssfContraseña.setBorder(null);

        btEntrar1.setBackground(new java.awt.Color(51, 204, 255));
        btEntrar1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btEntrar1.setForeground(new java.awt.Color(255, 255, 255));
        btEntrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/acepta.JPG"))); // NOI18N
        btEntrar1.setText("ENTRAR");
        btEntrar1.setBorder(null);
        btEntrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEntrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btEntrar1MouseEntered(evt);
            }
        });
        btEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrar1ActionPerformed(evt);
            }
        });

        btBorrar.setBackground(new java.awt.Color(51, 204, 255));
        btBorrar.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/borra.PNG"))); // NOI18N
        btBorrar.setText("BORRAR");
        btBorrar.setBorder(null);
        btBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrarActionPerformed(evt);
            }
        });

        btIniciarInvitado.setBackground(new java.awt.Color(51, 204, 255));
        btIniciarInvitado.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        btIniciarInvitado.setForeground(new java.awt.Color(255, 255, 255));
        btIniciarInvitado.setText("INICIAR COMO INVITADO");
        btIniciarInvitado.setBorder(null);
        btIniciarInvitado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btIniciarInvitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btIniciarInvitadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btIniciarInvitadoMouseEntered(evt);
            }
        });
        btIniciarInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarInvitadoActionPerformed(evt);
            }
        });

        background2.setBackground(new java.awt.Color(51, 204, 255));
        background2.setForeground(new java.awt.Color(255, 255, 255));
        background2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/istockphoto-1293734400-612x612.jpg"))); // NOI18N
        Icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconMouseClicked(evt);
            }
        });

        txtIcon.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        txtIcon.setForeground(new java.awt.Color(255, 255, 255));
        txtIcon.setText("FERRETERÍA COINCO");

        txtContactos.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        txtContactos.setForeground(new java.awt.Color(255, 255, 255));
        txtContactos.setText("CONTACTOS :");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Local : 45260016");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gerente: +53 54556198");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo: coinco@gmail.com");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/face.PNG"))); // NOI18N
        jLabel7.setToolTipText("");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/whats.PNG"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/twitter.PNG"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/int.PNG"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout background2Layout = new javax.swing.GroupLayout(background2);
        background2.setLayout(background2Layout);
        background2Layout.setHorizontalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Icon))
                    .addGroup(background2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel6)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background2Layout.createSequentialGroup()
                        .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(txtIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(background2Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(txtContactos)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(12, 12, 12))))
        );
        background2Layout.setVerticalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(42, 42, 42)
                .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(txtContactos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/logo.PNG"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        jLabel4.setText("LOGO");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btEntrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(pssfContraseña)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuario)
                                    .addComponent(txtIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4))))))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btIniciarInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel5))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4)))
                .addGap(62, 62, 62)
                .addComponent(txtIniciarSesion)
                .addGap(65, 65, 65)
                .addComponent(txtUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pssfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEntrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btIniciarInvitado)
                .addContainerGap())
            .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void txtfUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfUsuarioMouseClicked

    }//GEN-LAST:event_txtfUsuarioMouseClicked

    private void txtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfUsuarioActionPerformed
        
    }//GEN-LAST:event_txtfUsuarioActionPerformed

    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        txtfUsuario.setText("");
        pssfContraseña.setText("");
    }//GEN-LAST:event_btBorrarActionPerformed

    private void btIniciarInvitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIniciarInvitadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btIniciarInvitadoMouseClicked

    private void btIniciarInvitadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIniciarInvitadoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btIniciarInvitadoMouseEntered

    private void btIniciarInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarInvitadoActionPerformed
        Menu_Invitado ventana = new Menu_Invitado();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_btIniciarInvitadoActionPerformed

    private void IconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconMouseClicked
        JOptionPane.showMessageDialog(rootPane,"Bienvenido/a a la Ferretería Coinco.", "Bienvenida", WIDTH);
    }//GEN-LAST:event_IconMouseClicked

    private void btEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrar1ActionPerformed
              
                if(txtfUsuario.getText().equals("luisalbalat")){
                    if(pssfContraseña.getText().equals("luisalbalat02")){
                        
                        Menu_Gerente ventana = new Menu_Gerente();
                        ventana.setVisible(true);
                        ventana.setLocationRelativeTo(null);
                        
                        this.dispose();
                    }
                    }
                else if (txtfUsuario.getText().equals("lazaroariel")){
                        if (pssfContraseña.getText().equals("lazaroariel02")){
                            
                        Menu_Administrador ventana = new Menu_Administrador();
                        ventana.setVisible(true);
                        ventana.setLocationRelativeTo(null);
                        
                        this.dispose();    
                        }   
                    }
                    else{
                    
                if (txtfUsuario.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Por favor, rellene los campos primero.", "Inicio de Sesión", WIDTH);
                }
                else {
                    ArrayList<Usuario> Usuario = new ArrayList<>();
        
                    try{
                       
                        Usuario = GuardarDatos.readFileTextLogin();
                        
                            
                            for(int i=0; i<Usuario.size(); i++){
                
                                if (Usuario.get(i).getNombreUsuario().equals(txtfUsuario.getText())){
                                    if (Usuario.get(i).getContraseña().equals(pssfContraseña.getText())){
                                
                                        Menu_Cliente ventana = new Menu_Cliente();
                                        ventana.setVisible(true);
                                        ventana.setLocationRelativeTo(null);
                        
                                        this.dispose(); 
                                        }
                                    }
                                 }
                            }
        
                    catch (Exception a){
                        
                    }
                }
            }
    }//GEN-LAST:event_btEntrar1ActionPerformed

    private void btEntrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrar1MouseEntered

    }//GEN-LAST:event_btEntrar1MouseEntered

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        JOptionPane.showMessageDialog(rootPane, "Cuenta oficial: ferreteria.coinco &copy", "Instagram", WIDTH);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        JOptionPane.showMessageDialog(rootPane, "Cuenta oficial: Ferretería Coinco Corporation", "Facebook", WIDTH);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        JOptionPane.showMessageDialog(rootPane, "Número de la empresa: +53 58064615", "Whatsapp", WIDTH);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        JOptionPane.showMessageDialog(rootPane, "Cuenta oficial: FERRETERÍA COINCO", "Twitter", WIDTH);
    }//GEN-LAST:event_jLabel9MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icon;
    private javax.swing.JPanel background;
    private javax.swing.JPanel background2;
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btEntrar1;
    private javax.swing.JButton btIniciarInvitado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField pssfContraseña;
    private javax.swing.JLabel txtContactos;
    private javax.swing.JLabel txtIcon;
    private javax.swing.JLabel txtIniciarSesion;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JTextField txtfUsuario;
    // End of variables declaration//GEN-END:variables
}
