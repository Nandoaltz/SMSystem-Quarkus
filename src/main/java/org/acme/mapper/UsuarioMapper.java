package org.acme.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.model.Usuario;
import org.acme.request.UsuarioRequest;
import org.acme.response.UsuarioResponse;

@ApplicationScoped
public class UsuarioMapper {

    public static Usuario map(UsuarioRequest usuarioRequest){
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioRequest.nome());
        usuario.setEmail(usuarioRequest.email());
        usuario.setSenha(usuarioRequest.senha());
        return usuario;
    }

    public static UsuarioResponse map(Usuario usuario){
        return new UsuarioResponse(usuario.getId(), usuario.getNome(), usuario.getEmail());
    }

}
