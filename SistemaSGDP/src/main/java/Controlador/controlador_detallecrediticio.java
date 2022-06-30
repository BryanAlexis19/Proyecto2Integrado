
package Controlador;

import Conexion.Conexion;
import Modelo.modelo_detallecrediticio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class  controlador_detallecrediticio implements Interface.interfaz_detallecrediticio{

    @Override
    public int ingresoDet(modelo_detallecrediticio ep) {
        int respuesta =0;
        try {
            Connection con = Conexion.getConnection();
            String sql = "INSERT INTO detallecredito (idCredito, Reseña, idUsuario, idDocumentacion, fecha) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            ps.setInt(1, ep.getIdCredito());
            ps.setInt(2, ep.getReseña());
            ps.setInt(3, ep.getIdUsuario());
            ps.setInt(4, ep.getIdDocumentacion());
            ps.setString(5,ep.getFechaDetalle());
            respuesta = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return respuesta;
    }
    
}
    
