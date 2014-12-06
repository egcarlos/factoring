/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alignet.factoring.procesos;

import java.io.Serializable;
import java.util.Map;
import javax.ejb.Stateless;

/**
 *
 * @author Carlos
 */
@Stateless
public class ProcesoEjemplo implements ProcesoEjemploLocal {

    @Override
    public Map<String, Serializable> procesoMetodoEjemplo(Map<String, Serializable> parametroEjemplo) {
        return null;
    }
}
