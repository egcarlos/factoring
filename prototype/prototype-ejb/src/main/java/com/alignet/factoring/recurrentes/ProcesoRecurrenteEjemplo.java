/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alignet.factoring.recurrentes;

import com.alignet.factoring.procesos.ProcesoEjemploLocal;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;

/**
 *
 * @author Carlos
 */
@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
@TransactionManagement(TransactionManagementType.BEAN)
public class ProcesoRecurrenteEjemplo implements ProcesoRecurrenteEjemploLocal {

    private AtomicBoolean semaforo;

    @PostConstruct
    public void init() {
        semaforo = new AtomicBoolean(false);
    }

    @Inject
    ProcesoEjemploLocal delegado;

    @Schedule(month = "*", hour = "*", dayOfMonth = "*", year = "*", minute = "*", second = "0", persistent = false)
    @Override
    public void myTimer() {
        //El semaforo se usa para sincronizar los accesos al proceso recurrente
        //el no usar sincronizacion in transacciones controladas por el servidor
        //permite que el proceso sea de larga vida
        if (!semaforo.compareAndSet(false, true)) {
            //cuando no se puede bloquear esta ocupado
            return;
        }
        try {
            //ES NECESARIO OBTENER LOS DATOS DESDE ALGUN PUNTO
            Map<String, Serializable> datos = datosParaProceso();

            //delegar el procesamiento
            Map<String, Serializable> respuesta = delegado.procesoMetodoEjemplo(datos);

            //hacer algo con los datos...
        } finally {
            //al terminar el proceso el semaforo se libera
            semaforo.set(false);
        }
    }

    private Map<String, Serializable> datosParaProceso() {
        //aca se obtienen los datos a procesar, normlamente desde la base de datos u otro repositorio
        return null;
    }
}
