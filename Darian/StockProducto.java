package Model;

import java.io.Serializable;

    public class StockProducto implements Serializable{
    
        private String nombre;
        private String ingreso;
        private String egreso;

    public StockProducto(String nombre, String ingreso, String egreso) {
        this.nombre = nombre;
        this.ingreso = ingreso;
        this.egreso = egreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getEgreso() {
        return egreso;
    }

    public void setEgreso(String egreso) {
        this.egreso = egreso;
    }
        
        @Override
        public String toString(){
        return "{"+"nombre: "+nombre+" ingreso: "+ingreso+" egreso: "+egreso+" }";
    }
}
