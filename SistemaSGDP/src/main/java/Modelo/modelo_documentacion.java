package Modelo;

public class modelo_documentacion {
    private int codigo;
    private String t_documento;

    public modelo_documentacion(int codigo, String t_documento) {
        this.codigo = codigo;
        this.t_documento = t_documento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getT_documento() {
        return t_documento;
    }

    public void setT_documento(String t_documento) {
        this.t_documento = t_documento;
    }

    @Override
    public String toString() {
        return "modelo_documentacion{" + "codigo=" + codigo + ", t_documento=" + t_documento + '}';
    }
    
    
    
}
