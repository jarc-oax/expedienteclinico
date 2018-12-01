
package com.expediente.clinico.service;

import com.expediente.clinico.model.Paciente;
import java.util.List;

public interface PacienteService {
   public void crearRegistro(Paciente paciente); 
   public void actualizarRegistro(Paciente paciente);
   public void elimianrRegistro(Paciente paciente);
   public List<Paciente> obtenerPacientes();
   public Paciente obtenerPaciente(Long idPaciente);
}
