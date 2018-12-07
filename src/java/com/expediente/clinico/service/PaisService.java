/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expediente.clinico.service;

import com.expediente.clinico.model.Pais;
import java.util.List;

/**
 *
 * @author unsis1
 */
public interface PaisService {
    public List<Pais> obtenerRegistros();
     public void actualizarRegistro(Pais pais);
     public void eliminarRegistro(Pais pais);
     public void crearRegistro(Pais pais);
}
