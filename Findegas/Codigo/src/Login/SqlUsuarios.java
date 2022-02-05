/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Login.jpfactura.*;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import static junit.runner.Version.id;

/**
 *
 * @author jeissoncc
 */
public class SqlUsuarios extends conexion{
    
    Connection conn = getConexion();
   
    
     String generarNumeroFactura(){
         PreparedStatement ps = null;
        java.sql.ResultSet rs = null;
        Connection conn = getConexion();
        String id = null;
        
        String sql ="SELECT MAX(id_factura) FROM factura";
        
        
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while(rs.next()){
                //Aca le digo que muestre el valor en un JtextFiel
                id = rs.getString(1);
                
            }
                                  
            } catch (Exception ex) {
            // NOTA: So hubo error muestra el error
            System.err.println(ex.getMessage());
            System.out.println("error");
        }
        return id;
    }
     
     String generarNumeroVisita(){
         PreparedStatement ps = null;
        java.sql.ResultSet rs = null;
        Connection conn = getConexion();
        String id = null;
        
        String sql ="SELECT MAX(id_visita) FROM visitas";
        
        
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while(rs.next()){
                //Aca le digo que muestre el valor en un JtextFiel
                id = rs.getString(1);
            }
                                  
            } catch (Exception ex) {
            // NOTA: So hubo error muestra el error
            System.err.println(ex.getMessage());
            System.out.println("error");
        }
        return id;
    }
    
     
     
    public ResultSet consulta(String sql){
        Connection conn = getConexion();
        ResultSet rs = null;
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
        }catch(SQLException e){
            System.err.print("error consulta: " + e.getMessage());
        }
        return rs;
    }
    
    public DefaultComboBoxModel servicios(){
        DefaultComboBoxModel listado = new DefaultComboBoxModel();
        DefaultComboBoxModel id_listado = new DefaultComboBoxModel();
        listado.addElement("Seleccione Servicio ");
        id_listado.addElement("Seleccione id ");
        ResultSet rs = this.consulta("SELECT * FROM servicios ORDER BY id_servicio");
        
        try{
            while(rs.next()){
                listado.addElement(rs.getString("servicio"));
                id_listado.addElement(rs.getString("id_servicio"));
                
                
            }
            rs.close();
        
       
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    return listado;
}    
    
    
    
    public DefaultComboBoxModel roles(){
        DefaultComboBoxModel listado = new DefaultComboBoxModel();
        listado.addElement("Seleccione Rol ");
        ResultSet rs = this.consulta("SELECT * FROM roles");
        
        try{
            while(rs.next()){
                listado.addElement(rs.getString("nombre_rol"));
            }
            rs.close();
        
       
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    return listado;
}    
    
    public boolean registrar(usuarios usr) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO usuarios (id, nombres, apellidos, password, email, usuario, direccion, telefonos, rol) VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usr.getId());
            ps.setString(2, usr.getNombre());
            ps.setString(3, usr.getApellido());
            ps.setString(4, usr.getPassword());
            ps.setString(5, usr.getEmail());
            ps.setString(6, usr.getUsuario());
            ps.setString(7, usr.getDireccion());
            ps.setString(8, usr.getTelefono());
            ps.setInt(9, usr.getRol());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    
    
    public boolean registrarVisita(VisitasAgenda visit) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO visitas (id_visita, id_cliente, fecha, fecha_visita, observaciones, estado) VALUES(?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(2, visit.getId_cliente());
            ps.setInt(1, visit.getId_visita());
            ps.setString(3, visit.getFecha());
            ps.setString(4, visit.getFechavisita());
            ps.setString(5, visit.getObservaciones());
            ps.setString(6, visit.getEstado());
             
            
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    public boolean CancelarVisita(VisitaCancelada v) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO visitas_canceladas (estado, fecha, especialista, observaciones) VALUES(?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            
           
            ps.setString(1, v.getEstado());
            ps.setString(2, v.getFecha());
            ps.setString(3, v.getEspecialista());
            ps.setString(4, v.getObservaciones());
            ps.execute();
            System.out.println("voy aqui");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    
    
    public boolean GuardarDetalleFactura(FacturaDetalle deta) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO detalle_facura (id_detalle, id_factura, cantidad, descripcion, vlr_unitario, vlr_total) VALUES(?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, deta.getId_detalle());
            ps.setInt(2, deta.getId_factura());
            ps.setInt(3, deta.getCantidad());
            ps.setString(4, deta.descripcion);
            ps.setInt(5, deta.getVlr_unitario());
            ps.setInt(6, deta.getVlr_total());
             
            
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    public boolean GuardarFactura(factura fact) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO factura (id_factura, fecha, cliente, total, observaciones) VALUES(?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, fact.getId_factura());
            ps.setString(2, fact.getFecha());
            ps.setInt(3, fact.getCliente());
            ps.setInt(4, fact.getTotal());
            ps.setString(5, fact.getObservaciones());
             
            
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    
    public boolean login(usuarios usr) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT  usuarios.id, usuarios.usuario, usuarios.password, usuarios.nombres, usuarios.rol, roles.nombre_rol, roles.id_rol FROM usuarios INNER JOIN roles ON usuarios.rol = roles.id_rol WHERE usuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usr.getPassword().equals(rs.getString(3))) {
                  
                    
                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(4));
                    usr.setRol(rs.getInt(5));
                    usr.setNombre_rol(rs.getString(6));
                    
                    return true;
                    
                } else {
                    return false;
                }
            }

            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    public static ArrayList<String> llenar_combo(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        ArrayList<String> lista = new ArrayList<String>();
        String sql = "SELECT * FROM roles";
        try{
            
            rs = ps.executeQuery(sql);
            System.out.println("Correcto");            
        }catch(Exception e){
            System.out.println("Incorrecto");
        }
        try{
            while(rs.next()){
                lista.add(rs.getString("nombre_rol"));
            }
        }catch(Exception e){
                    
                    }
        return lista;
    }
public static ArrayList<String> comboEspecialistas(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        ArrayList<String> lista = new ArrayList<String>();
        String sql = "SELECT * FROM usuarios";
        try{
            
            rs = ps.executeQuery(sql);
            System.out.println("Correcto");            
        }catch(Exception e){
            System.out.println("Incorrecto");
        }
        try{
            while(rs.next()){
                lista.add(rs.getString("usuario"));
            }
        }catch(Exception e){
                    
                    }
        return lista;
    }

public DefaultComboBoxModel Especialistas(){
        DefaultComboBoxModel listado = new DefaultComboBoxModel();
        listado.addElement("Seleccione Especialista ");
        ResultSet rs = this.consulta("SELECT * FROM usuarios");
        
        try{
            while(rs.next()){
                listado.addElement(rs.getString("usuario"));
            }
            rs.close();
        
       
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    return listado;
}    

public boolean updateUsuario(usuarios usr) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql =("UPDATE usuarios SET rol ='"+usr.getId_rol()+"' WHERE id='"+usr.getId()+"' ");
                
         try {
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Perfil de Usuario Actualizado");
        } catch (SQLException ex) {
            Logger.getLogger(jpeuser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
         
}   public boolean deleteUsuario(usuarios usr) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql =("DELETE FROM usuarios  WHERE id='"+usr.getId()+"' ");
                
         try {
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Perfil de Usuario Eliminado");
        } catch (SQLException ex) {
            Logger.getLogger(jpeuser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
}

}
