
package Modelo;

import java.util.Calendar;


public class modelo_seguimiento {
    
    private int idUsuario;
    private int CIP;
    private String fecha;
    private int accion;

    public modelo_seguimiento(int idUsuario, int CIP, String fecha, int accion) {
        this.idUsuario = idUsuario;
        this.CIP = CIP;
        this.fecha = fecha;
        this.accion = accion;
    }

    public modelo_seguimiento() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getCIP() {
        return CIP;
    }

    public void setCIP(int CIP) {
        this.CIP = CIP;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getAccion() {
        return accion;
    }

    public void setAccion(int accion) {
        this.accion = accion;
    }
    
      public String fechaSe (){
        Calendar t = Calendar.getInstance();
        String fe = t.get(Calendar.DAY_OF_MONTH)+ "-"+(t.get(Calendar.MONTH)+1)+"-"+t.get(Calendar.YEAR);
        return fe;
    }
    
}
