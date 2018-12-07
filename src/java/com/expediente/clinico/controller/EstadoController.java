
package com.expediente.clinico.controller;

import com.expediente.clinico.model.Estado;
import com.expediente.clinico.model.Pais;
import com.expediente.clinico.service.EstadoService;
import com.expediente.clinico.service.EstadoServiceImpl;
import com.expediente.clinico.service.PaisService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;

@RequestScoped
@ManagedBean(name ="estadoController")

public class EstadoController implements Serializable{
    /*private EstadoService estadoService;
    private List<Estado> listaRegistros;
    private Estado estadoSelected;
    
    @PostConstruct
    public void init(){
        estadoService  = new EstadoServiceImpl();
        listaRegistros = estadoService.obtenerRegistros();
    }

    public List<Estado> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(List<Estado> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }*/
       //Carga los registros al iniciar la aplicación en el datatable
    private EstadoService estadoService;
    private PaisService paisService;
    private List<Estado> listaRegistros;
    //Obtiene el registro seleccionado del datatable
    Estado selectedRegistro;
    //Objeto para crear un nuevo regitro en la base de datos
    private Estado nuevoEstado;
    private Pais paisEstado;
    
    @PostConstruct
    public void init(){
        
        estadoService = new EstadoServiceImpl();
        listaRegistros = estadoService.obtenerRegistros();  
        paisEstado = new Pais("MXN","México");
        nuevoEstado = new Estado(null,paisEstado,null);
        
    }
 
    public void onRowEdit(RowEditEvent event){
        Estado estado=((Estado) event.getObject());
        estadoService.actualizarRegistro(estado);
        FacesMessage mensaje = new FacesMessage("Registro editado exitósamente", ((Estado) event.getObject()).getCodigo());
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }
    public void onRowCancel(RowEditEvent event){
        FacesMessage msg = new FacesMessage("Actualización cancelada", ((Estado) event.getObject()).getCodigo());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void eliminarRegistro(Estado estado){
        String codigo = estado.getCodigo();
        estadoService.eliminarRegistro(estado);
        listaRegistros = estadoService.obtenerRegistros();
        FacesMessage msg = new FacesMessage("Registro eliminado exitósamente",codigo);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowSelect(SelectEvent event){
    }
 
    public void agregarRegistro() {
        //this.listaRegistros.add(this.nuevoEstado);   
        String codigo = nuevoEstado.getCodigo();
        estadoService.crearRegistro(nuevoEstado);
        listaRegistros = estadoService.obtenerRegistros();
      
        FacesMessage msg = new FacesMessage("Registro creado exitósamente", codigo);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public List<Estado> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(List<Estado> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }    

    public Estado getSelectedRegistro() {
        return selectedRegistro;
    }

    public void setSelectedRegistro(Estado selectedRegistro) {
        this.selectedRegistro = selectedRegistro;
    }

    public Estado getNuevoEstado() {
        return nuevoEstado;
    }

    public void setNuevoEstado(Estado nuevoEstado) {
        this.nuevoEstado = nuevoEstado;
    }

    
    
}
