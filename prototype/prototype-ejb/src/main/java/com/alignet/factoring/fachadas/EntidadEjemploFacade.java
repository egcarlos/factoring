/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alignet.factoring.fachadas;

import com.alignet.factoring.entidades.EntidadEjemplo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Carlos
 */
@Stateless
public class EntidadEjemploFacade extends AbstractFacade<EntidadEjemplo> implements EntidadEjemploFacadeLocal {

    @PersistenceContext(unitName = "factoringPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EntidadEjemploFacade() {
        super(EntidadEjemplo.class);
    }

}
