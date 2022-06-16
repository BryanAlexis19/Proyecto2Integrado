package Modelo;

public class modelo_documentacion {
    private int idDocumentacion,iipoDocumentacion,cip;
    private String ubicacion;

    public modelo_documentacion() {
    }

    public modelo_documentacion(int idDocumentacion, int iipoDocumentacion, int cip, String ubicacion) {
        this.idDocumentacion = idDocumentacion;
        this.iipoDocumentacion = iipoDocumentacion;
        this.cip = cip;
        this.ubicacion = ubicacion;
    }

    public int getIdDocumentacion() {
        return idDocumentacion;
    }

    public void setIdDocumentacion(int idDocumentacion) {
        this.idDocumentacion = idDocumentacion;
    }

    public int getIipoDocumentacion() {
        return iipoDocumentacion;
    }

    public void setIipoDocumentacion(int iipoDocumentacion) {
        this.iipoDocumentacion = iipoDocumentacion;
    }

    public int getCip() {
        return cip;
    }

    public void setCip(int cip) {
        this.cip = cip;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    
}
