package com.expediente.clinico.model;
// Generated 29/11/2018 10:17:12 PM by Hibernate Tools 4.3.1


import com.expediente.clinico.model.common.RegistroModelo;
import java.util.HashSet;
import java.util.Set;

/**
 * Pais generated by hbm2java
 */
public class Pais  implements java.io.Serializable, RegistroModelo {


     private String codigo;
     private String nombre;
     private Set estados = new HashSet(0);

    public Pais() {
    }

	
    public Pais(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public Pais(String codigo, String nombre, Set estados) {
       this.codigo = codigo;
       this.nombre = nombre;
       this.estados = estados;
    }
   
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getEstados() {
        return this.estados;
    }
    
    public void setEstados(Set estados) {
        this.estados = estados;
    }

    @Override
    public Long getId() {
       return null;
    }

    @Override
    public void setId() {
        
    }




}


