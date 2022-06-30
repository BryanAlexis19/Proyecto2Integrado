
package Modelo;
import java.util.*;
import java.time.ZonedDateTime;

public class modelo_detallecrediticio {
    
    private int idCredito;
    private int Reseña;
    private int idUsuario;
    private int idDocumentacion;
    private String fechaDetalle;

    public modelo_detallecrediticio() {
    }

    public modelo_detallecrediticio(int idCredito, int Reseña, int idUsuario, int idDocumentacion, String fechaDetalle) {
        this.idCredito = idCredito;
        this.Reseña = Reseña;
        this.idUsuario = idUsuario;
        this.idDocumentacion = idDocumentacion;
        this.fechaDetalle = fechaDetalle;
    }

    public int getIdCredito() {
        return idCredito;
    }

    public void setIdCredito(int idCredito) {
        this.idCredito = idCredito;
    }

    public int getReseña() {
        return Reseña;
    }

    public void setReseña(int Reseña) {
        this.Reseña = Reseña;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdDocumentacion() {
        return idDocumentacion;
    }

    public void setIdDocumentacion(int idDocumentacion) {
        this.idDocumentacion = idDocumentacion;
    }

    public String getFechaDetalle() {
        return fechaDetalle;
    }

    public void setFechaDetalle(String fechaDetalle) {
        this.fechaDetalle = fechaDetalle;
    }
    
    public String fechaDc (){
        Calendar t = Calendar.getInstance();
        String fe = t.get(Calendar.YEAR)+"-"+(t.get(Calendar.MONTH)+1)+"-"+t.get(Calendar.DAY_OF_MONTH);
        return fe;
    }
    public void setFechaNow(){
          fechaDetalle = fechaDc();
      }
}
