
package com.expedinte.clinico.dao;

import com.expediente.clinico.model.Pais;


public interface PaisDAO {
    public void crearRegistro(Pais pais);
     public Pais obtenerRegistro(String idPais);
}
