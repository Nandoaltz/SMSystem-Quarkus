package org.acme.controller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.acme.service.IaService;

@Path("/chat")
@ApplicationScoped
public class IaController {

    private final IaService iaService;

    public IaController(IaService iaService) {
        this.iaService = iaService;
    }

    @POST
    public String chat(String msg){
        return iaService.chat(msg);
    }
}
