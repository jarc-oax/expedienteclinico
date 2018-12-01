 package com.expediente.clinico.service.common;

import com.expediente.clinico.model.common.RegistroModelo;
import java.util.List;

public interface RegistroService< T extends RegistroModelo >{
    
    //Métodos  que van a utilizar todas las clases 
    public void crearRegistro( T registro);//  objeto general
    public void actualizarregistro();
    public void eliminarRegistro();
    public T obtenerRegistro(Long idRegistro);
    public List<T> obtenerRegistro();
}
