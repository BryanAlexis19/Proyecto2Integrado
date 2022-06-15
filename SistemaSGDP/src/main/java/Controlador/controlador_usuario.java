
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
       Connection cn= Conexion.getConnection();
       String sql="SELECT idUsuario, UserName, Password, Tipo FROM usuario";
       PreparedStatement st = cn.prepareStatement(sql);
       ResultSet rs= st.executeQuery();
       while (rs.next()){
           modelo_usuario x = new modelo_usuario (); 
           x.setId_usuario(rs.getInt(1));
           x.setUsuario(rs.getString(2));
           x.setContraseña(rs.getString(3));
           x.setTipo(rs.getInt(4));
           Lista.add(x);
       }
     }catch(Exception x){}
     return Lista;
    
    }
    
    
    
    }

