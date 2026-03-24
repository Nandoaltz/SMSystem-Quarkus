package org.acme.service;

import dev.langchain4j.agent.tool.Tool;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import org.acme.model.Usuario;

import java.util.List;

@ApplicationScoped
public class UsuarioService {

    @Transactional
    public void save(Usuario usuario){
        usuario.persist();
    }

    @Tool("Retorna os usuarios do banco de dados, mas não retorne a senha")
    public List<Usuario> usuarioList(){
        return Usuario.listAll();
    }
}
