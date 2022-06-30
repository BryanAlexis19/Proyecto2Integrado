
package Modelo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;


public class modelo_ingresodocumentacion {
    
    private int idDocumentacion;
    private int idUsuario;
    private String fechaIngreso;

    public modelo_ingresodocumentacion(int idDocumentacion, int idUsuario, String fechaIngreso) {
        this.idDocumentacion = idDocumentacion;
        this.idUsuario = idUsuario;
        this.fechaIngreso = fechaIngreso;
    }

    
    public modelo_ingresodocumentacion() {
    }

    public int getIdDocumentacion() {
        return idDocumentacion;
    }

    public void setIdDocumentacion(int idDocumentacion) {
        this.idDocumentacion = idDocumentacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }    
    
      public String fechaId (){
        Calendar t = Calendar.getInstance();
        String fe = t.get(Calendar.YEAR)+ "-"+(t.get(Calendar.MONTH)+1)+"-"+t.get(Calendar.DAY_OF_MONTH);
        return fe;
    }
      
      public void fechaInDoc() {
          fechaIngreso =  fechaId();          
    }


    @Override
    public String toString() {
        return "modelo_ingresodocumentacion{" + "idDocumentacion=" + idDocumentacion + ", idUsuario=" + idUsuario + ", fechaIngreso=" + fechaIngreso + '}';
    }
      
    
}
