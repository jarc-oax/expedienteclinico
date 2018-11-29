package com.expediente.clinico.model;
// Generated 29/11/2018 10:17:12 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Estado generated by hbm2java
 */
public class Estado  implements java.io.Serializable {


     private String codigo;
     private Pais pais;
     private String nombre;
     private Set municipios = new HashSet(0);

    public Estado() {
    }

	
    public Estado(String codigo, Pais pais, String nombre) {
        this.codigo = codigo;
        this.pais = pais;
        this.nombre = nombre;
    }
    public Estado(String codigo, Pais pais, String nombre, Set municipios) {
       this.codigo = codigo;
       this.pais = pais;
       this.nombre = nombre;
       this.municipios = municipios;
    }
   
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Pais getPais() {
        return this.pais;
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getMunicipios() {
        return this.municipios;
    }
    
    public void setMunicipios(Set municipios) {
        this.municipios = municipios;
    }




}


