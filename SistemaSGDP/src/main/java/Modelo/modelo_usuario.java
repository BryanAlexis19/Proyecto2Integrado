
package Modelo;

public class modelo_usuario {
    private String usuario;
    private String contraseña;
    private int id_usuario;
    private int tipo;

    public modelo_usuario() {
    }

    public modelo_usuario(String usuario, String contraseña, int id_usuario, int tipo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.id_usuario = id_usuario;
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}
