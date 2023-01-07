
package View;

import Model.Cliente;
import Controller.GuardarDatos;
import java.io.IOException;
import java.util.ArrayList;


public class Gestion_Cliente extends javax.swing.JFrame{

    Object[][] lista;
    
    public Gestion_Cliente() {
        
        initComponents();
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        try{
            clientes = GuardarDatos.readFileTextCliente();
        
        lista = new Object[clientes.size()][4];
        for(int i=0;i<clientes.size();i++){
            lista[i][0]=clientes.get(i).getNombre();
            lista[i][1]=clientes.get(i).getCI();
            lista[i][2]=clientes.get(i).getDireccion();
            lista[i][3]=clientes.get(i).getNumero();
        }
        
        tabla.setModel(new javax.swing.table.DefaultTableModel(lista, new String [] {"Nombre", "CI", "Dirección", "Número de Teléfono"}));
       
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
        jMenu1 = new javax.swing.JMenu();
        btGuardar = new javax.swing.JMenuItem();
        btVolver = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Cliente");
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setBackground(new java.awt.Color(204, 204, 204));
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
                "Nombre", "CI", "Dirección", "Número de Teléfono"
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
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setBackground(new java.awt.Color(51, 204, 255));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Menú");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        btGuardar.setBackground(new java.awt.Color(51, 204, 255));
        btGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btGuardar.setText("Guardar");
        btGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(btGuardar);

        btVolver.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, 0));
        btVolver.setBackground(new java.awt.Color(51, 204, 255));
        btVolver.setForeground(new java.awt.Color(255, 255, 255));
        btVolver.setText("Volver al Menú de Gerente");
        btVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });
        jMenu1.add(btVolver);

        jMenuBar1.add(jMenu1);

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

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        Menu_Gerente ventana = new Menu_Gerente();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_btVolverActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
       

        ArrayList<Cliente> clientes = new ArrayList<>();
        
        for(int i=0;i<tabla.getRowCount();i++){
            String nombre = (String)tabla.getValueAt(i, 0);
            String CI = (String)tabla.getValueAt(i, 1);
            String direccion = (String)tabla.getValueAt(i, 2);
            String telefono = (String)tabla.getValueAt(i, 3);
            
            clientes.add(new Cliente(nombre,CI,direccion,telefono));
        }
        
        try{
            GuardarDatos.writeFileTextCliente(clientes);
        }
        catch(Exception ex){
            
        }
        

    }//GEN-LAST:event_btGuardarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JMenuItem btGuardar;
    private javax.swing.JMenuItem btVolver;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTable tabla;
    private javax.swing.JScrollPane tablaA;
    // End of variables declaration//GEN-END:variables

}
