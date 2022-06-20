
package Controlador;

import Conexion.Conexion;
import Modelo.modelo_documentacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class controlador_documentacion implements Interface.interfaz_documentacion {

    @Override
    public List<modelo_documentacion> DLista() {
        List<modelo_documentacion> ListaD = new ArrayList();
       try{
       Connection cn = Conexion.getConnection();
       String sql = "SELECT idDocumentacion, TipoDocumentacion, Ubicacion,CIP Tipo FROM documentacion";
       PreparedStatement st = cn.prepareStatement(sql);
       ResultSet rs= st.executeQuery();
       while (rs.next()){
           modelo_documentacion x = new modelo_documentacion (); 
           x.setIdDocumentacion(rs.getInt(1));
           x.setIipoDocumentacion(rs.getInt(2));
           x.setUbicacion(rs.getString(3));
           x.setCip(rs.getInt(4));
           ListaD.add(x);
           System.out.print(x);
       }
     }catch(SQLException x){}
     return ListaD;
    }

}
