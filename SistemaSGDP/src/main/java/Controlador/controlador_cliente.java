
package Controlador;


import Modelo.modelo_cliente;
import Conexion.Conexion;
import java.util.*;
import java.sql.*;
import java.sql.Connection;

public class controlador_cliente implements Interface.interfaz_cliente{
  
    //Sobreescribir el metodo de la interfaz cliente
    @Override
    public List<modelo_cliente> CliLista() {
        //Crear una instancia de la clase cliente a travez de un arrayList
        List<modelo_cliente> Lista = new ArrayList();
        try{
            //Instanciar la clase conexion 
            Connection cn = Conexion.conectar();
            //Cadena de texto de la sentencia sql para consultar todos los clientes
            String sql = "SELECT CIP, DNI, Nombres, Apellidos, Grado, Estado, Dni_C FROM cliente";
            //Usar el Prepared statement pasandole la cadena sql
            PreparedStatement pst = cn.prepareStatement(sql);
            //Guardar el resultado de la sentencia sql en un ResultSet rs
            ResultSet rs = pst.executeQuery();
            //Extraer cada columna del resultSet y pasarlos al modelo cliente
            while(rs.next()){
                //Instanciar un objeto de la clase cliente
                modelo_cliente modCli = new modelo_cliente();
                //Setear los datos obtenidos de la consulta guardada en el rs
                modCli.setCip(rs.getInt(1));
                modCli.setDni(rs.getString(2));
                modCli.setNombre(rs.getString(3));
                modCli.setApellido(rs.getString(4));
                modCli.setGrado(rs.getString(5));
                modCli.setEstado(rs.getInt(6));
                modCli.setDni_c(rs.getString(7));
                //Guardar los datos individuales en la lista
                Lista.add(modCli);
                System.out.print(modCli);
            }
            
        }catch(SQLException x){
            
        }
        return Lista;
    }
    
    //Sobreescribir el metodo Buscarcliente de la interface
    @Override
    public List<modelo_cliente> BuscarCliente(modelo_cliente clie) {
        List<modelo_cliente> Lista = new ArrayList();
        try {
            Connection cn = Conexion.conectar();
            String sql = "SELECT CIP, DNI, Nombres, Apellidos, Grado, Estado, Dni_C FROM cliente where CIP = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, clie.getCip());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                modelo_cliente modCli = new modelo_cliente();
                modCli.setCip(rs.getInt(1));
                modCli.setDni(rs.getString(2));
                modCli.setNombre(rs.getString(3));
                modCli.setApellido(rs.getString(4));
                modCli.setGrado(rs.getString(5));
                modCli.setEstado(rs.getInt(6));
                modCli.setDni_c(rs.getString(7));
                Lista.add(modCli);
                System.out.print(modCli);
            }
            
        }catch(SQLException x){
        
        }
        return Lista;
    }
  
    
}
