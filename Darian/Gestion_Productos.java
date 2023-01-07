
package View;

import Controller.GuardarDatos;
import Model.Producto;
import java.io.IOException;
import java.util.ArrayList;

public class Gestion_Productos extends javax.swing.JFrame {

    Object[][] lista;
    
    public Gestion_Productos() {
        
        initComponents();
        ArrayList<Producto> pro = new ArrayList<>();
        
        try{
            pro = GuardarDatos.readFileTextProducto();
        
        lista = new Object[pro.size()][4];
        for(int i=0;i<pro.size();i++){
            lista[i][0]=pro.get(i).getNombre();
            lista[i][1]=pro.get(i).getMarca();
            lista[i][2]=pro.get(i).getCategoria();
            lista[i][3]=pro.get(i).getPrecio();
        }
        
        tabla.setModel(new javax.swing.table.DefaultTableModel(lista, new String [] {"Nombre", "Marca", "Categoría", "Precio"}));
       
    }
    
    catch(IOException | ClassNotFoundException ex){
    
}
    this.setTitle("Ferreteria Coinco");

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        tablaA = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuProducto = new javax.swing.JMenu();
        btIngresarProducto = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Productos");
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setBackground(new java.awt.Color(204, 204, 204));
        tabla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Categoría", "Marca", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaA.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablaA, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablaA, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 204, 255));

        MenuProducto.setForeground(new java.awt.Color(255, 255, 255));
        MenuProducto.setText("Menú");
        MenuProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuProductoMouseClicked(evt);
            }
        });

        btIngresarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        btIngresarProducto.setBackground(new java.awt.Color(51, 204, 255));
        btIngresarProducto.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        btIngresarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btIngresarProducto.setText("Guardar");
        btIngresarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btIngresarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btIngresarProductoMouseClicked(evt);
            }
        });
        btIngresarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarProductoActionPerformed(evt);
            }
        });
        MenuProducto.add(btIngresarProducto);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, 0));
        jMenuItem1.setBackground(new java.awt.Color(51, 204, 255));
        jMenuItem1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("Volver a Menú de Administrador");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuProducto.add(jMenuItem1);

        jMenuBar1.add(MenuProducto);

        setJMenuBar(jMenuBar1);

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

    private void MenuProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuProductoMouseClicked

    }//GEN-LAST:event_MenuProductoMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Menu_Administrador ventana = new Menu_Administrador();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btIngresarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIngresarProductoMouseClicked
        
    }//GEN-LAST:event_btIngresarProductoMouseClicked

    private void btIngresarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarProductoActionPerformed
        ArrayList<Producto> productos = new ArrayList<>();
        
        for(int i=0;i<tabla.getRowCount();i++){
            String nombre = (String)tabla.getValueAt(i, 0);
            String marca = (String)tabla.getValueAt(i, 1);
            String categoria = (String)tabla.getValueAt(i, 2);
            String precio = (String)tabla.getValueAt(i, 3);
            
            productos.add(new Producto(nombre,marca,categoria,precio));
        }
        
        try{
            GuardarDatos.writeFileTextProducto(productos);
        }
        catch(Exception ex){
            
        }
    }//GEN-LAST:event_btIngresarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuProducto;
    private javax.swing.JPanel background;
    private javax.swing.JMenuItem btIngresarProducto;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTable tabla;
    private javax.swing.JScrollPane tablaA;
    // End of variables declaration//GEN-END:variables
}
