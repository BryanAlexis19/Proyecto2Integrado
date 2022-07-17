
package Conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    static String bd1 = "fovipol_db";
    //static String bd1 = "fovipol_db2";
    static String url1= "jdbc:mysql://localhost:3306/";
    static String user1="root";
    static String password1 = "";
    static String driver1 = "com.mysql.cj.jdbc.Driver";
    static Connection cx1;
    
    
    public static Connection getConnection(){
        Connection con = null;
        
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            //String url= "jdbc:mysql://localhost:3306/fovipol_db2";
            String url= "jdbc:mysql://localhost:3306/fovipol_db";
            String user="root";
             String password = "";
            con=DriverManager.getConnection(url, user, password);
            System.out.println("Se conecto a BD");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("No se conecto a BD") ;
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
        }
        return con;
        
          
      }

    public Conexion() {

    }

    public static Connection conectar() {
        
        try {
            Class.forName(driver1);
            cx1=DriverManager.getConnection(url1+bd1, user1, password1);
            System.out.println("Se conecto a BD" + bd1);
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("No se conecto a BD" + bd1) ;
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
        }
        return cx1;
    }
    
    public static void desconectar(){
        try{
            cx1.close();
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    /*public static void main(String[] args){
        Conexion conexion = new Conexion();
        conexion.conectar();
    }*/
    
}