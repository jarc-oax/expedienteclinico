
package com.expediente.clinico.service.common;

import com.expediente.clinico.model.common.RegistroModelo;
import java.util.List;

public interface RegistroService<T extends RegistroModelo> {
    
    public void crearRegistro(T registro);
    public void ActualizarRegistro(T registro);
    public void eliminarRegistro(T registro);
    
    
    public T obtenerRegistro(Long idRegistro);
    
    public List<T> obtenerRegistro();
}
