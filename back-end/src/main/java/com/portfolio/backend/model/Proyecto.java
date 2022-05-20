
package com.portfolio.backend.model;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Macarena Rodriguez
 */

@Entity
public class Proyecto implements Serializable {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proyecto_id;
    @NotNull
    private String proyecto_nombre;
    @NotNull    
    private String proyecto_fecha;
    @NotNull
    private String proyecto_url;
        
    @NotNull
    private String proyecto_descripcion;

    public Proyecto() {
    }

    public Proyecto(Long proyecto_id, String proyecto_nombre, String proyecto_fecha, String proyecto_url, String proyecto_descripcion) {
        this.proyecto_id = proyecto_id;
        this.proyecto_nombre = proyecto_nombre;
        this.proyecto_fecha = proyecto_fecha;
        this.proyecto_url = proyecto_url;
        this.proyecto_descripcion = proyecto_descripcion;
    }

    public Long getProyecto_id() {
        return proyecto_id;
    }

    public void setProyecto_id(Long proyecto_id) {
        this.proyecto_id = proyecto_id;
    }

    public String getProyecto_nombre() {
        return proyecto_nombre;
    }

    public void setProyecto_nombre(String proyecto_nombre) {
        this.proyecto_nombre = proyecto_nombre;
    }

    public String getProyecto_fecha() {
        return proyecto_fecha;
    }

    public void setProyecto_fecha(String proyecto_fecha) {
        this.proyecto_fecha = proyecto_fecha;
    }

    public String getProyecto_url() {
        return proyecto_url;
    }

    public void setProyecto_url(String proyecto_url) {
        this.proyecto_url = proyecto_url;
    }

    public String getProyecto_descripcion() {
        return proyecto_descripcion;
    }

    public void setProyecto_descripcion(String proyecto_descripcion) {
        this.proyecto_descripcion = proyecto_descripcion;
    }
    
    
        
        
}
