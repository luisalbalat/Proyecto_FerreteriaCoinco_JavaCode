package Model;

import java.io.Serializable;

    public class Producto implements Serializable{
    
        private String nombre;
        private String marca;
        private String categoria;
        private String precio;

    public Producto() {
    }

    public Producto(String nombre, String marca, String categoria, String precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
        
        @Override
        public String toString(){
        return "{"+"nombre: "+nombre+" marca: "+marca+" categoria: "+categoria+" precio: "+precio+" }";
    }
}
