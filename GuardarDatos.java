package Controller;

import Model.Usuario;
import Model.Cliente;
import Model.Informe;
import Model.Producto;
import Model.Proveedor;
import Model.StockProducto;
import java.io.*;
import java.util.ArrayList;

    public class GuardarDatos {
    
        public static ArrayList<Usuario> readFileTextLogin() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("Login.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<Usuario> participantes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                Usuario nuevo = (Usuario)entradaObjetos.readObject();
                participantes.add(nuevo);
                
            }
            
            return participantes;
        }
        
        public static void writeFileTextLogin(ArrayList<Usuario>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("Login.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            try (ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos)) {
                int cantidad = participantes.size();
                
                salidaObjetos.writeInt(cantidad);
                
                for(int i=0;i<cantidad;i++){
                    
                    salidaObjetos.writeObject(participantes.get(i));
                    
                }
                
                salidaObjetos.flush();
            }
            
        }
        
        
        
        
         public static ArrayList<Cliente> readFileTextCliente() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("cliente.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<Cliente> clientes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                Cliente nuevo = (Cliente)entradaObjetos.readObject();
                clientes.add(nuevo);
                
            }
            
            return clientes;
        }
        
        public static void writeFileTextCliente(ArrayList<Cliente>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("cliente.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            try (ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos)) {
                int cantidad = participantes.size();
                
                salidaObjetos.writeInt(cantidad);
                
                for(int i=0;i<cantidad;i++){
                    
                    salidaObjetos.writeObject(participantes.get(i));
                    
                }
                
                salidaObjetos.flush();
            }
            
        }
        
        
        
        
         public static ArrayList<Producto> readFileTextProducto() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("producto.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<Producto> participantes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                Producto nuevo = (Producto)entradaObjetos.readObject();
                participantes.add(nuevo);
                
            }
            
            return participantes;
        }
        
        public static void writeFileTextProducto(ArrayList<Producto>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("producto.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos);
            
            int cantidad = participantes.size();
            
            salidaObjetos.writeInt(cantidad);
            
            for(int i=0;i<cantidad;i++){
                
                salidaObjetos.writeObject(participantes.get(i));
                
            }
            
            salidaObjetos.flush();
            salidaObjetos.close();
            
        }
        
        
        
        
         public static ArrayList<Proveedor> readFileTextProveedor() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("proveedor.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<Proveedor> participantes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                Proveedor nuevo = (Proveedor)entradaObjetos.readObject();
                participantes.add(nuevo);
                
            }
            
            return participantes;
        }
        
        public static void writeFileTextProveedor(ArrayList<Proveedor>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("proveedor.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            try (ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos)) {
                int cantidad = participantes.size();
                
                salidaObjetos.writeInt(cantidad);
                
                for(int i=0;i<cantidad;i++){
                    
                    salidaObjetos.writeObject(participantes.get(i));
                    
                }
                
                salidaObjetos.flush();
            }
            
        }
        
        
        
        
         public static ArrayList<StockProducto> readFileTextStockProducto() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("stockProducto.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<StockProducto> participantes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                StockProducto nuevo = (StockProducto)entradaObjetos.readObject();
                participantes.add(nuevo);
                
            }
            
            return participantes;
        }
        
        public static void writeFileTextStockProducto(ArrayList<StockProducto>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("stockProducto.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            try (ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos)) {
                int cantidad = participantes.size();
                
                salidaObjetos.writeInt(cantidad);
                
                for(int i=0;i<cantidad;i++){
                    
                    salidaObjetos.writeObject(participantes.get(i));
                    
                }
                
                salidaObjetos.flush();
            }
            
        }
        
        

        
                 public static ArrayList<Informe> readFileTextInforme() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("informe.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<Informe> participantes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                Informe nuevo = (Informe)entradaObjetos.readObject();
                participantes.add(nuevo);
                
            }
            
            return participantes;
        }
        
        public static void writeFileTextInforme(ArrayList<Informe>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("informe.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            try (ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos)) {
                int cantidad = participantes.size();
                
                salidaObjetos.writeInt(cantidad);
                
                for(int i=0;i<cantidad;i++){
                    
                    salidaObjetos.writeObject(participantes.get(i));
                    
                }
                
                salidaObjetos.flush();
            }
            
                
        }
          
              
}





