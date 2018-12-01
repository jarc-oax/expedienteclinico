package com.expediente.clinico.model;

import java.util.Date;

public class Paciente  implements java.io.Serializable, RegistroModel {


     private long idPaciente;
     private String nombre;
     private String apellido;
     private Date fechaNacimiento;
     private String direccion;
     private String telefono;
     private String ocupacion;
     private Boolean sexo;

    public Paciente() {
    }

	
    public Paciente(long idPaciente) {
        this.idPaciente = idPaciente;
    }
    public Paciente(long idPaciente, String nombre, String apellido, Date fechaNacimiento, String direccion, String telefono, String ocupacion, Boolean sexo) {
       this.idPaciente = idPaciente;
       this.nombre = nombre;
       this.apellido = apellido;
       this.fechaNacimiento = fechaNacimiento;
       this.direccion = direccion;
       this.telefono = telefono;
       this.ocupacion = ocupacion;
       this.sexo = sexo;
    }
   
    public long getIdPaciente() {
        return this.idPaciente;
    }
    
    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getOcupacion() {
        return this.ocupacion;
    }
    
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    public Boolean getSexo() {
        return this.sexo;
    }
    
    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public void setId() {
    }
}


