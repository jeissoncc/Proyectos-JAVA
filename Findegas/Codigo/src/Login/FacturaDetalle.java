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
public class FacturaDetalle {
    
    int id_detalle;
    int id_factura;
    int cantidad;
    String descripcion;
    int vlr_unitario;
    int vlr_total;

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getVlr_unitario() {
        return vlr_unitario;
    }

    public void setVlr_unitario(int vlr_unitario) {
        this.vlr_unitario = vlr_unitario;
    }

    public int getVlr_total() {
        return vlr_total;
    }

    public void setVlr_total(int vlr_total) {
        this.vlr_total = vlr_total;
    }
}
