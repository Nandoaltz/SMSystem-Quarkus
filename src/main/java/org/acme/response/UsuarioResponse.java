package org.acme.response;

public record UsuarioResponse(
        Long id,
        String nome,
        String email
) {
}
