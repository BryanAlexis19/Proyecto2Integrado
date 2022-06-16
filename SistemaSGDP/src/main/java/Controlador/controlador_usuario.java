
package Controlador;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
import Modelo.*;
import java.sql.Connection;
import java.util.ArrayList;

public class controlador_usuario implements Interface.interfaz_usuario {

    @Override
    public List<modelo_usuario> ULista() {
       List<modelo_usuario> Lista = new ArrayList();
     try{
       Connection cn = Conexion.getConnection();
       String sql = "SELECT idUsuario, UserName, Password, Tipo FROM usuario";
       PreparedStatement st = cn.prepareStatement(sql);
       ResultSet rs= st.executeQuery();
       while (rs.next()){
           modelo_usuario x = new modelo_usuario (); 
           x.setId_usuario(rs.getInt(1));
           x.setUsuario(rs.getString(2));
           x.setContraseña(rs.getString(3));
           x.setTipo(rs.getInt(4));
           Lista.add(x);
           System.out.print(x);
       }
     }catch(SQLException x){}
     return Lista;
    
    }

    @Override
    public boolean login(modelo_usuario usr) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cn= Conexion.getConnection();
        String sql="SELECT idUsuario,UserName,Password,Tipo FROM usuario WHERE Login=?";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs=ps.executeQuery();
            Connection con = Conexion.getConnection();
            if(rs.next()){
            if(usr.getContraseña().equals(rs.getString(3))){
            usr.setId_usuario(rs.getInt(1));
            usr.setUsuario(rs.getString(2));
            usr.setTipo(rs.getInt(4));    
            return true;
            }else{
            return false;
            }
        }
        } catch (SQLException e) {
            Logger.getLogger(modelo_usuario.class.getName()).log(Level.SEVERE, null, e);
        }
return false;
    }
    
    
    
    }

