/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expediente.clinico.dao;

import com.expediente.clinico.model.Estado;
import java.util.List;

/**
 *
 * @author JARC
 */
public interface EstadoDAO {
    public void crearRegistro(Estado registro);
    public void actualizarRegistro(Estado registro);
    public void eliminarRegistro(Estado registro);
    public List<Estado> obtenerRegistros();
}
