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
public class listar {
    
        String estado;
        String fecha;
        String especialista;
        String observaciones;
        int id;

    listar(int id, String fecha, String especialista, String observaciones) {
        this.id = id;
        this.fecha = fecha;
        this.especialista = especialista;
        this.observaciones = observaciones; 
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
        

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
