
package com.expediente.clinico.controller;

import com.expediente.clinico.model.Paciente;
import com.expediente.clinico.controller.common.ControllerBase;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name = "pacienteController")
public class PacienteController extends ControllerBase<Paciente> implements Serializable{
    
}
