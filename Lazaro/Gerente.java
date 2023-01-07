package Model;

    public class Gerente extends Usuario {
    
        private String nombre;
        private String CI;

    public Gerente() {
    }

    public Gerente(String nombre, String CI, String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
        this.nombre = nombre;
        this.CI = CI;
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

    
}
