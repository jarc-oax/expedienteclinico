
package com.expediente.clinico.service.common;

import java.util.List;

public interface RegistroService <T>{
    public void crearRegistro(T registro);
    public void actualizarRegistro(T registro);
    public void eliminarRegistro(T registro);
    public List<T> obtenerRegistros();
    public T obtenerRegistro(Long idRegistro);
}
