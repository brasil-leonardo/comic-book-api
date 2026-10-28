package io.github.brasilleonardo.comicbookapi.dto.response;

import java.time.LocalDate;

import io.github.brasilleonardo.comicbookapi.model.Usuario;

public record LerUsuarioResponseDTO(Long id, String nome, String sobrenome, LocalDate dataNascimento, String email) {
    public static LerUsuarioResponseDTO toDTO(Usuario usuario) {
        return new LerUsuarioResponseDTO(usuario.getId(), usuario.getNome(), usuario.getSobrenome(), usuario.getDataNascimento(), usuario.getEmail());
    }
}