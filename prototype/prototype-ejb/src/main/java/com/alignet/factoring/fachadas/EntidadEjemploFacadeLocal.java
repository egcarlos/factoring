/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alignet.factoring.fachadas;

import com.alignet.factoring.entidades.EntidadEjemplo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Carlos
 */
@Local
public interface EntidadEjemploFacadeLocal {

    void create(EntidadEjemplo entidadEjemplo);

    void edit(EntidadEjemplo entidadEjemplo);

    void remove(EntidadEjemplo entidadEjemplo);

    EntidadEjemplo find(Object id);

    List<EntidadEjemplo> findAll();

    List<EntidadEjemplo> findRange(int[] range);

    int count();

}
