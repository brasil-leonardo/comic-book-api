package io.github.brasilleonardo.comicbookapi.dto.response;

import java.time.LocalDate;

import io.github.brasilleonardo.comicbookapi.model.Usuario;

public record CriarUsuarioResponseDTO(Long id, String nome, String sobrenome, LocalDate dataNascimento, String email) {
    public static CriarUsuarioResponseDTO toDTO(Usuario usuario) {
        return new CriarUsuarioResponseDTO(usuario.getId(), usuario.getNome(), usuario.getSobrenome(), usuario.getDataNascimento(), usuario.getEmail());
    }
}