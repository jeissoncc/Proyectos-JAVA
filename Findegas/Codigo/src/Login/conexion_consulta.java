/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import java.sql.*;


public class conexion_consulta {
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

    public static Clientes existeCliente(String id_cliente){
        
        Clientes c = null;
        int identificacion = Integer.parseInt (id_cliente);
        String sql = "SELECT * FROM clientes" + " WHERE id_cliente='"+id_cliente+"'";
        
        try {
            resultado = sentencia.executeQuery(sql);
        } catch (Exception e) {
        }
        c= asignar();
        return c;

    }
    
    public static Clientes existeVisita(String id_visita){
        
        Clientes c = null;
        int identificacion = Integer.parseInt (id_visita);
        System.out.println(identificacion);
        String s = "SELECT clientes.id_cliente, clientes.razon_social, clientes.responsable FROM clientes INNER JOIN visitas ON clientes.id_cliente = visitas.id_cliente WHERE id_visita ='"+id_visita+"'";
        try {
            resultado = sentencia.executeQuery(s);
        } catch (Exception e) {
        }
        c= asignarVisita();
        return c;
    }
    
    public static Clientes asignar(){
      Clientes c = null;
        
      String razon_social;
      String responsable;
      String direccion;
      String telefono;
      int id;
        try {
            if(resultado.last()){
                razon_social= resultado.getString("razon_social");
                responsable = resultado.getString("responsable");
                direccion = resultado.getString("direccion");
                telefono = resultado.getString("telefono");
                 
                c = new Clientes (razon_social, responsable, direccion, telefono);
            }
        } catch (Exception e) {
        }
      
      return c;
                
    }
   public static Clientes asignarVisita(){
      Clientes c = null;
        
      String razon_social;
      String responsable;
      int id;
        try {
            if(resultado.last()){
                id = resultado.getInt("id_cliente");
                razon_social= resultado.getString("razon_social");
                responsable = resultado.getString("responsable");
                
                c = new Clientes (razon_social, responsable, id);
            }
        } catch (Exception e) {
        }
      
      return c;
                
   }
   
   public static users existeusuario(String id){
        
        users c = null;
        int identificacion = Integer.parseInt (id);
        String sql = "SELECT usuario FROM usuarios" + " WHERE id ='"+id+"'";
        
        try {
            resultado = sentencia.executeQuery(sql);
        } catch (Exception e) {
        }
        c= asignarUser();
        return c;

    }
   
   public static users asignarUser(){
      users c = null;
     
      String usuario;
      int id;
        try {
            if(resultado.last()){
                usuario = resultado.getString("usuario");
                 
                c = new users (usuario);
            }
        } catch (Exception e) {
        }
      
      return c;
                
    }
}
