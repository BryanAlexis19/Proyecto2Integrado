package Modelo;

public class modelo_documentacion {
    private int idDocumentacion,iipoDocumentacion,cip;
    private byte[] ubicacion;

    public modelo_documentacion() {
    }

    public modelo_documentacion(int idDocumentacion, int iipoDocumentacion, int cip, byte[] ubicacion) {
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

    public byte[] getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(byte[] ubicacion) {
        this.ubicacion = ubicacion;
    }


    
    
    
}
