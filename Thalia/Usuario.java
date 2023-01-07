package Model;

import java.io.Serializable;

    public class Usuario implements Serializable{    

        protected String nombreUsuario;
        protected String contraseña;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
        
        @Override
    public String toString(){
        return "{"+"nombreUsuario: "+nombreUsuario+" contraseña: "+contraseña+" }";
    }
}
