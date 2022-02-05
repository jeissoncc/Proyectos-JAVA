
package Login;


public class variables {
    
    String fecha;
    String consecutivo;
    String cliente;
    String id;
    String direccion;
    String telefono;
    String contacto;
    String servicio;
    String observacion;

    public variables(String fecha, String consecutivo, String cliente, String id, String direccion, String telefono, String contacto, String servicio, String observacion) {
        this.fecha = fecha;
        this.consecutivo = consecutivo;
        this.cliente = cliente;
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contacto = contacto;
        this.servicio = servicio;
        this.observacion = observacion;
    }

    public variables(String fecha, String consecutivo, String cliente, String id, String observacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    
}
