/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author jeissoncc
 */
public class Consulta_Conexion {
    static Connection conexion=null;
    static Statement sentencia;
    static ResultSet resultado;
    public static void conectar(){
        String ruta="jdbc:mysql://localhost:3306/findegas";
        String user="root";
        String pass="";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(ruta,user,pass); 
            sentencia= conexion.createStatement();
        } catch (Exception e) {
        }
    }

    public static users existeUsuario(String id){
        
        users u = null;
        int identificacion = Integer.parseInt (id);
        String sql = "SELECT * FROM usuarios" + " WHERE id='"+id+"'";
        
        try {
            resultado = sentencia.executeQuery(sql);
            System.out.println(resultado);
        } catch (Exception e) {
        }
        u = asignarUser();
        return u;

    }
    
    public static users asignarUser(){
      users u = null;
        
      String usuario;
      int id;
        try {
            if(resultado.last()){
                usuario= resultado.getString("usuario");
                System.out.println(usuario);
                 
                u = new users(usuario);
            }
        } catch (Exception e) {
        }
      
      return u;
}
}
