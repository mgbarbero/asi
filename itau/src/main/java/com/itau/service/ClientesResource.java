package com.itau.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/clientes")
public interface ClientesResource {
  @GET
  void generatedMethod1();
}
