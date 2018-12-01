
package com.expediente.clinico.dao;

import com.expediente.clinico.model.Paciente;
import java.util.List;

public interface PacienteDAO {
   public void crearRegistro(Paciente paciente); 
   public void actualizarRegistro(Paciente paciente);
   public void eliminarRegistro(Paciente paciente);
   public List<Paciente> obtenerRegistros();
   public Paciente obtenerRegistro(Long idPaciente);
}
