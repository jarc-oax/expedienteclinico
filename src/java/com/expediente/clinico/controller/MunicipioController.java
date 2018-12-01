
package com.expediente.clinico.controller;

import com.expediente.clinico.controller.common.ControllerGeneral;
import com.expediente.clinico.model.Municipio;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.RequestScoped;

@RequestScoped
@ManagedBean(name ="paisController")
public class MunicipioController extends ControllerGeneral<Municipio> implements Serializable{
    
}
