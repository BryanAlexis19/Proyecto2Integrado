
package Controlador;

import Conexion.Conexion;
import Modelo.modelo_documentacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class controlador_documentacion implements Interface.interfaz_documentacion {
    private Connection cn = Conexion.getConnection();
    private String sql="";
    
    @Override
    public List<modelo_documentacion> DLista() {
        List<modelo_documentacion> ListaD = new ArrayList();
        //DefaultTableModel modelo;
        //String [] titulos={"idDocumentacion","TipoDocumentacion","Ubicacion","CIP"};
        //modelo = new DefaultTableModel(null,titulos);
        try{
           sql = "SELECT idDocumentacion, TipoDocumentacion, Ubicacion,CIP Tipo FROM documentacion";
           PreparedStatement st = cn.prepareStatement(sql);
           ResultSet rs= st.executeQuery();
           while (rs.next()){
               modelo_documentacion md = new modelo_documentacion ();
               md.setIdDocumentacion(rs.getInt(1));
               md.setIipoDocumentacion(rs.getInt(2));
               md.setUbicacion(rs.getBytes(3));
               md.setCip(rs.getInt(4));
               ListaD.add(md);
               System.out.println(""+md);
           }
                    
        }catch(Exception x){
            JOptionPane.showConfirmDialog(null,x);
            
        }
       return ListaD;
    }
    

    @Override
    public boolean insertarDoc(modelo_documentacion docum) {
        sql="INSERT INTO documentacion (idDocumentacion, TipoDocumentacion, Ubicacion,CIP) VALUES (?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, docum.getIdDocumentacion());
            pst.setInt(2, docum.getIipoDocumentacion());
            pst.setBytes(3,docum.getUbicacion());
            pst.setInt(4, docum.getCip());
            int n=pst.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    @Override
    public boolean actualizarDoc(modelo_documentacion docum) {
        int n=0;
        sql="UPDATE documentacion SET TipoDocumentacion=?, Ubicacion =?,CIP=? "
                + "WHERE idDocumentacion=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, docum.getIdDocumentacion());
            pst.setInt(2, docum.getIipoDocumentacion());
            pst.setBytes(3,docum.getUbicacion());
            pst.setInt(4, docum.getCip());
            n=pst.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    @Override
    public boolean eliminarDoc(modelo_documentacion docum) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
