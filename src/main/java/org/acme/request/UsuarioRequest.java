package org.acme.request;

public record UsuarioRequest(
        String nome,
        String email,
        String senha
) {
}
