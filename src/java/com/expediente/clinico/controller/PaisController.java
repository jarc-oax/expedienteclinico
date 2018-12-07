
package com.expediente.clinico.controller;

import com.expediente.clinico.model.Pais;
import com.expediente.clinico.service.PaisService;
import com.expediente.clinico.service.PaisServiceImpl;
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
@ManagedBean(name = "paisController")
public class PaisController implements Serializable{
    //Carga los registros al iniciar la aplicación en el datatable
    private PaisService paisService;
    private List<Pais> listaRegistros;
    //Obtiene el registro seleccionado del datatable
    Pais selectedRegistro;
    //Objeto para crear un nuevo regitro en la base de datos
    private Pais nuevoPais;
    
    @PostConstruct
    public void init(){
        
        paisService = new PaisServiceImpl();
        listaRegistros = paisService.obtenerRegistros();  
        nuevoPais = new Pais();
    }
 
    public void onRowEdit(RowEditEvent event){
        Pais pais=((Pais) event.getObject());
        paisService.actualizarRegistro(pais);
        FacesMessage mensaje = new FacesMessage("Registro editado exitósamente", ((Pais) event.getObject()).getCodigo());
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }
    public void onRowCancel(RowEditEvent event){
        FacesMessage msg = new FacesMessage("Actualización cancelada", ((Pais) event.getObject()).getCodigo());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void eliminarRegistro(Pais pais){
        String codigo = pais.getCodigo();
        paisService.eliminarRegistro(pais);
        listaRegistros = paisService.obtenerRegistros();
        FacesMessage msg = new FacesMessage("Registro eliminado exitósamente",codigo);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowSelect(SelectEvent event){
    }
 
    public void agregarRegistro() {
        //this.listaRegistros.add(this.nuevoPais);    
        String codigo = nuevoPais.getCodigo();
        paisService.crearRegistro(nuevoPais);
        listaRegistros = paisService.obtenerRegistros();
      
        FacesMessage msg = new FacesMessage("Registro creado exitósamente", codigo);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public List<Pais> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(List<Pais> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }    

    public Pais getSelectedRegistro() {
        return selectedRegistro;
    }

    public void setSelectedRegistro(Pais selectedRegistro) {
        this.selectedRegistro = selectedRegistro;
    }

    public Pais getNuevoPais() {
        return nuevoPais;
    }

    public void setNuevoPais(Pais nuevoPais) {
        this.nuevoPais = nuevoPais;
    }
}
