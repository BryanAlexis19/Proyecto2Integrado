
package Controlador;

import Conexion.Conexion;
import Modelo.modelo_seguimiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class controlador_seguimiento  implements Interface.interfaz_seguimiento{

    @Override
    public int ingresoSeg(modelo_seguimiento ep) {
        int respuesta =0;
        try {
            Connection con = Conexion.getConnection();
            String sql = "INSERT INTO seguimiento (idUsuario, CIP, fecha, accion) VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            ps.setInt(1, ep.getIdUsuario());
            ps.setInt(2, ep.getCIP());
            ps.setString(3, ep.getFecha());
            ps.setInt(4, ep.getAccion());
            respuesta = ps.executeUpdate();
                                
                    
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return respuesta;
        
    }
    

    
}
