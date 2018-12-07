/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expediente.clinico.service;

import com.expediente.clinico.dao.PaisDAO;
import com.expediente.clinico.dao.PaisDAOImpl;
import com.expediente.clinico.model.Pais;
import java.util.List;

/**
 *
 * @author unsis1
 */
public class PaisServiceImpl implements PaisService{
    private PaisDAO paisDAO = new PaisDAOImpl();

    @Override
    public List<Pais> obtenerRegistros() {
        return paisDAO.obtenerRegistros();
    }
    
    @Override
    public void actualizarRegistro(Pais pais) {
        paisDAO.actualizarRegistro(pais);
    }

    @Override
    public void eliminarRegistro(Pais pais) {
        paisDAO.eliminarRegistro(pais);
    }

    @Override
    public void crearRegistro(Pais pais) {
        paisDAO.crearRegistro(pais);
    }
}
