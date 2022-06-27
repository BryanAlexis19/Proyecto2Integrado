
package Modelo;

import java.util.Calendar;


public class modelo_ingresodocumentacion {
    
    private int idDocumentacion;
    private int idUsuario;
    private int fechaIngreso;

    public modelo_ingresodocumentacion(int idDocumentacion, int idUsuario, int fechaIngreso) {
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

    public int getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
      public String fechaId (){
        Calendar t = Calendar.getInstance();
        String fe = t.get(Calendar.DAY_OF_MONTH)+ "-"+t.get(Calendar.MONTH)+"-"+t.get(Calendar.YEAR);
        return fe;
    }
    
}
