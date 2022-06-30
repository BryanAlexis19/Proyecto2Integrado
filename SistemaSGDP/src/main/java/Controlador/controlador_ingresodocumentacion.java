
package Controlador;

import Conexion.Conexion;
import Modelo.modelo_ingresodocumentacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class controlador_ingresodocumentacion implements Interface.interfaz_ingresodocumentacion{
    private Connection con = Conexion.getConnection();
    private String sql="";    
    @Override
    public int ingresoDoc(modelo_ingresodocumentacion ingDoc) {
        int respuesta =0;
        try {            
            //INSERT INTO `ingresodocumentacion` (`idDocumentacion`, `idUsuario`, `fechaIngreso`) VALUES ('1', '1', '2022-06-01');
            sql = "INSERT INTO ingresodocumentacion (idDocumentacion, idUsuario,fechaIngreso) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            ps.setInt(1, ingDoc.getIdDocumentacion());
            ps.setInt(2, ingDoc.getIdUsuario());
            ps.setString(3, ingDoc.getFechaIngreso());
            respuesta = ps.executeUpdate();                                
                    
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return respuesta;
    }
    
}
