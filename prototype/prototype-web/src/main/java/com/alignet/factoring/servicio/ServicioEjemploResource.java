/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alignet.factoring.servicio;

import com.alignet.factoring.procesos.ProcesoEjemploLocal;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 * REST Web Service
 *
 * @author Carlos
 */
@Path("servicios")
@RequestScoped
public class ServicioEjemploResource {

    @Inject
    ProcesoEjemploLocal delegado;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ServicioEjemploResource
     */
    public ServicioEjemploResource() {
    }

    /**
     * Retrieves representation of an instance of
     * com.alignet.factoring.servicio.ServicioEjemploResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //los servicios se conectan a los metodos del delegado para ejecutar acciones
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of
     * ServicioEjemploResource
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
        //los servicios se conectan a los metodos del delegado para ejecutar acciones
    }
}
