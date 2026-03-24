package org.acme.controller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.acme.mapper.UsuarioMapper;
import org.acme.model.Usuario;
import org.acme.request.UsuarioRequest;
import org.acme.service.UsuarioService;

@Path("/usuario")
@ApplicationScoped
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Path("/cadastrar")
    @POST
    public Response save(UsuarioRequest usuario){
        Usuario map = UsuarioMapper.map(usuario);
        usuarioService.save(map);
        return Response.status(Response.Status.CREATED).entity(UsuarioMapper.map(UsuarioMapper.map(usuario))).build();
    }
}