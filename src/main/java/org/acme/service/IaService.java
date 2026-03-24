package org.acme.service;

import dev.langchain4j.service.SystemMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import io.quarkiverse.langchain4j.ToolBox;
import jakarta.enterprise.context.ApplicationScoped;

@RegisterAiService
@ApplicationScoped
public interface IaService {

    @ToolBox(UsuarioService.class)
    @SystemMessage("""
            Voce é um chat bot que response minhas perguntas e faz requisições no banco de dados
                        """)
    String chat(String msg);
}
