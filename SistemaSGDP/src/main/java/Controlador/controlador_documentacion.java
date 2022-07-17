
package Controlador;

import Conexion.Conexion;
import Modelo.modelo_documentacion;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class controlador_documentacion implements Interface.interfaz_documentacion {
    private Conexion con = new Conexion();
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
            pst.setInt(4, docum.getIdDocumentacion());
            pst.setInt(1, docum.getIipoDocumentacion());
            pst.setBytes(2,docum.getUbicacion());
            pst.setInt(3, docum.getCip());
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
    
    public void ejectuar_archivoPDF(modelo_documentacion doc){
        String sql2;
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;
        try{
           sql2 = "SELECT ubicacion FROM documentacion WHERE idDocumentacion = ?;";
           ps = con.getConnection().prepareStatement(sql2);
           ps.setInt(1, doc.getIdDocumentacion());
           rs = ps.executeQuery();
           while(rs.next()){
               b = rs.getBytes(1);
           }
           InputStream bos = new ByteArrayInputStream(b);
           
           int tamanoInput = bos.available();
           byte[] datosPDF = new byte[tamanoInput];
           bos.read(datosPDF, 0, tamanoInput);
           
           OutputStream out = new FileOutputStream("new.pdf");
           out.write(datosPDF);
           
           //abrir el archivo
           out.close();
           bos.close();
           ps.close();
           rs.close();
           con.desconectar();
           
        } catch (Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    
}
