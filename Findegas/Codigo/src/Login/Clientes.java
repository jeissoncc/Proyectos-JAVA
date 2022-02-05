/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author jeissoncc
 */
public class Clientes {
    
    int id_cliente;
    String razon_social;
    String responsable;
    String email;
    String usuario;
    String password;
    String direccion;
    String telefono;

    public Clientes(int id_cliente, String razon_social, String responsable, String email,  String usuario, String password, String direccion, String telefono) {
        
        this.id_cliente = id_cliente;
        this.razon_social = razon_social;
        this.responsable = responsable;
        this.email = email;
        this.usuario = usuario;
        this.password = password;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    Clientes(String razon_social, String responsable, String direccion, String telefono) {
       
        this.razon_social = razon_social;
        this.responsable = responsable;
        this.direccion = direccion;
        this.telefono = telefono;
           this.id_cliente = id_cliente;
    }

    Clientes(String razon_social, String responsable, int id) {
        this.razon_social = razon_social;
        this.responsable = responsable;
        this.id_cliente = id_cliente;
    }

    Clientes(int id, String razon_social, String responsable, String direccion, String telefono) {
        this.id_cliente = id_cliente;
        this.razon_social = razon_social;
        this.responsable = responsable;
    }
    
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
}
