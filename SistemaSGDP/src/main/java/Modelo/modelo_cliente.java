package Modelo;


public class modelo_cliente {

     private String cip;
    private String dni;
    private String apellido;
    private String nombre;
    private String grado;
    private String estado;
    private String dni_c;

    public modelo_cliente(String cip, String dni, String apellido, String nombre, String grado, String estado, String dni_c) {
        this.cip = cip;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.grado = grado;
        this.estado = estado;
        this.dni_c = dni_c;
    }

    public modelo_cliente() {
    }

    
    
    @Override
    public String toString() {
        return "modelo_cliente{" + "cip=" + cip + ", dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", grado=" + grado + ", estado=" + estado + ", dni_c=" + dni_c + '}';
    }

    public String getCip() {
        return cip;
    }

    public void setCip(String cip) {
        this.cip = cip;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDni_c() {
        return dni_c;
    }

    public void setDni_c(String dni_c) {
        this.dni_c = dni_c;
    }
       
    
}
