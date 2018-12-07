/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expediente.clinico.service;

import com.expediente.clinico.dao.EstadoDAO;
import com.expediente.clinico.dao.EstadoDAOImpl;
import com.expediente.clinico.model.Estado;
import java.util.List;

/**
 *
 * @author JARC
 */
public class EstadoServiceImpl implements EstadoService {
    private EstadoDAO estadoDAO = new EstadoDAOImpl();

    @Override
    public List<Estado> obtenerRegistros() {
        return estadoDAO.obtenerRegistros();
    }
    
    @Override
    public void actualizarRegistro(Estado estado) {
        estadoDAO.actualizarRegistro(estado);
    }

    @Override
    public void eliminarRegistro(Estado estado) {
        estadoDAO.eliminarRegistro(estado);
    }

    @Override
    public void crearRegistro(Estado estado) {
        estadoDAO.crearRegistro(estado);
    }


}
