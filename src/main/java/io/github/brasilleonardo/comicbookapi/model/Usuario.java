package io.github.brasilleonardo.comicbookapi.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Usuario {
    private Long id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String email;
}
