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
public class con_visita {
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

    public static listar listarCancelada(){
        
        listar u = null;
        String sql = "SELECT * FROM visitas_canceladas";
        try {
            resultado = sentencia.executeQuery(sql);
        } catch (Exception e) {
        }
        u = asignarLista();
        return u;

    }
    
    public static listar asignarLista(){
      listar u = null;
        
      String especialista;
      String fecha;
      String observaciones;
      int id;
        try {
            if(resultado.next()){
                id= resultado.getInt("id_vcancelada");
                fecha = resultado.getString("fecha");
                especialista = resultado.getString("especialista");
                observaciones = resultado.getString("observaciones");
                
                 
                u = new listar(id, fecha, especialista, observaciones);
            }
        } catch (Exception e) {
        }
      
      return u;
}
}
