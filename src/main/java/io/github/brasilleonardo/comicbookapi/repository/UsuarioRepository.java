package io.github.brasilleonardo.comicbookapi.repository;

import org.springframework.data.repository.CrudRepository;

import io.github.brasilleonardo.comicbookapi.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}