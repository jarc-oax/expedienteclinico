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
    public void crearRegistro(Estado estado);
    public void actualizarRegistro(Estado estado);
    public void eliminarRegistro(Estado estado);
    public Estado obtenerRegistro(Long idEstado);
    public List<Estado> obtenerRegstros(Long idEstado);
}
