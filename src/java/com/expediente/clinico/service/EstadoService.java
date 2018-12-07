
package com.expediente.clinico.service;

import com.expediente.clinico.model.Estado;
import java.util.List;

public interface EstadoService{
    public void crearRegistro(Estado registro);
    public void actualizarRegistro(Estado registro);
    public void eliminarRegistro(Estado registro);
    public List<Estado> obtenerRegistros();
}
