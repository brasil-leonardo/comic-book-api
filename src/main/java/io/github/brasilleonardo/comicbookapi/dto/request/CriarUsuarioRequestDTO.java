package io.github.brasilleonardo.comicbookapi.dto.request;

import java.time.LocalDate;

import io.github.brasilleonardo.comicbookapi.model.Usuario;

public record CriarUsuarioRequestDTO(String nome, String sobrenome, LocalDate dataNascimento, String email) {
    public Usuario toModel() {
        return new Usuario(nome(), sobrenome(), dataNascimento(), email());
    }
}