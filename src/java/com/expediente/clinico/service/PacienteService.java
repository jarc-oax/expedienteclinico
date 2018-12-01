
package com.expediente.clinico.service;

import com.expediente.clinico.model.Paciente;
import com.expediente.clinico.service.common.RegistroService;
import java.util.List;

public interface PacienteService extends RegistroService<Paciente>{
   public List<Paciente> obtenerPacientesMayores();
}
