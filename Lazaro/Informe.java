package Model;

import java.io.Serializable;

    public class Informe implements Serializable{
        
        private String fecha;
        private String InformacionDelDia;

    public Informe(String fecha, String InformacionDelDia) {
        this.fecha = fecha;
        this.InformacionDelDia = InformacionDelDia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getInformacionDelDia() {
        return InformacionDelDia;
    }

    public void setInformacionDelDia(String InformacionDelDia) {
        this.InformacionDelDia = InformacionDelDia;
    }       
    
        @Override
    public String toString(){
        return "{ "+" fecha: "+fecha+" informacion del dia: "+InformacionDelDia+" }";
    }    
    
    
}
