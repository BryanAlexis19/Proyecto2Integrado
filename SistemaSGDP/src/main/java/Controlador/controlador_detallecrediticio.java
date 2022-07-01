
package Controlador;

import Conexion.Conexion;
import Modelo.modelo_cliente;
import Modelo.modelo_detallecrediticio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class  controlador_detallecrediticio implements Interface.interfaz_detallecrediticio{

    @Override
    public int ingresoDet(modelo_detallecrediticio ep) {
        int respuesta =0;
        try {
            Connection con = Conexion.getConnection();
            String sql = "INSERT INTO detallecredito (Reseña, idUsuario, idDocumentacion, fechaDetalle) VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            ps.setInt(1, ep.getReseña());
            ps.setInt(2, ep.getIdUsuario());
            ps.setInt(3, ep.getIdDocumentacion());
            ps.setString(4,ep.getFechaDetalle());
            respuesta = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return respuesta;
    }
    
    public List<modelo_cliente> filtraApe(String id){
        List<modelo_cliente> lista=new  ArrayList();
            try{
            Connection cn=Conexion.getConnection();
            String sql="select CIP, Nombres, Apellidos from cliente where Apellidos like ?";
                PreparedStatement st=cn.prepareStatement(sql);
                st.setString(1,id+"%");
                ResultSet rs=st.executeQuery();
                while(rs.next()){
                    modelo_cliente n=new modelo_cliente();
                    n.setCip(rs.getInt(1));
                    n.setNombre(rs.getString(2));
                    n.setApellido(rs.getString(3));
                    lista.add(n);
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
        return lista;
    }

    @Override
    public List<modelo_detallecrediticio> ListaDT() {
        List<modelo_detallecrediticio> ListaDT = new ArrayList();
       try{
       Connection cn = Conexion.getConnection();
       String sql = "SELECT idCredito, Reseña, idUsuario,idDocumentacion, fecha FROM detallecredito";
       PreparedStatement st = cn.prepareStatement(sql);
       ResultSet rs= st.executeQuery();
       while (rs.next()){
           modelo_detallecrediticio x = new modelo_detallecrediticio(); 
           x.setIdCredito(rs.getInt(1));
           x.setReseña(rs.getInt(2));
           x.setIdUsuario(rs.getInt(3));
           x.setIdDocumentacion(rs.getInt(4));
           x.setFechaDetalle(rs.getString(5));
           ListaDT.add(x);
           System.out.print(x);
       }
     }catch(SQLException x){}
     return ListaDT;
    }
    public List<modelo_detallecrediticio> filtraid(int id){
        List<modelo_detallecrediticio> lista=new  ArrayList();
            try{
            Connection cn=Conexion.getConnection();
            String sql="SELECT idCredito, Reseña, idUsuario,idDocumentacion, fecha FROM detallecredito where idDocumentacion like ?";
                PreparedStatement st=cn.prepareStatement(sql);
                st.setString(1,id+"%");
                ResultSet rs=st.executeQuery();
                while(rs.next()){
                    modelo_detallecrediticio x=new modelo_detallecrediticio();
                    x.setIdCredito(rs.getInt(1));
                    x.setReseña(rs.getInt(2));
                    x.setIdUsuario(rs.getInt(3));
                    x.setIdDocumentacion(rs.getInt(4));
                    x.setFechaDetalle(rs.getString(5));
                    lista.add(x);
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
        return lista;
    }
}
    
