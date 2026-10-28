package io.github.brasilleonardo.comicbookapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.brasilleonardo.comicbookapi.dto.request.CriarUsuarioRequestDTO;
import io.github.brasilleonardo.comicbookapi.dto.response.CriarUsuarioResponseDTO;
import io.github.brasilleonardo.comicbookapi.dto.response.LerUsuarioResponseDTO;
import io.github.brasilleonardo.comicbookapi.service.definition.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    @Autowired
    public UsuarioService usuarioService;

    @PostMapping
    public CriarUsuarioResponseDTO criarUsuario(@RequestBody CriarUsuarioRequestDTO dto) {
        return usuarioService.criarUsuario(dto);
    }

    @GetMapping
    public List<LerUsuarioResponseDTO> lerUsuario() {
        return usuarioService.lerUsuario();
    }

    @DeleteMapping
    @RequestMapping("{id}")
    public void deletarUsuario(@PathVariable Long id) {
        usuarioService.deleteUsuario(id);
    }
}
