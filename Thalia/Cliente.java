package Model;

import java.io.Serializable;
  
    public class Cliente extends Usuario implements Serializable{
        
        private String nombre;
        private String CI;
        private String direccion;
        private String numero;

    public Cliente(String nombre, String CI, String direccion, String numero) {
        this.nombre = nombre;
        this.CI = CI;
        this.direccion = direccion;
        this.numero = numero;
    }

    public Cliente(String nombre, String CI, String direccion) {
        this.nombre = nombre;
        this.CI = CI;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
        @Override
    public String toString(){
        return "{"+"nombre: "+nombre+" ci: "+CI+" direccion: "+direccion+" telefono: "+numero+" }";
    }
    
    
}
