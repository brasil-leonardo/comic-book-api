package io.github.brasilleonardo.comicbookapi.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.brasilleonardo.comicbookapi.dto.request.CriarUsuarioRequestDTO;
import io.github.brasilleonardo.comicbookapi.dto.response.CriarUsuarioResponseDTO;
import io.github.brasilleonardo.comicbookapi.dto.response.LerUsuarioResponseDTO;
import io.github.brasilleonardo.comicbookapi.model.Usuario;
import io.github.brasilleonardo.comicbookapi.repository.UsuarioRepository;
import io.github.brasilleonardo.comicbookapi.service.definition.UsuarioService;

@Service
public class UsuarioServiceImplementation implements UsuarioService {
    @Autowired
    public UsuarioRepository usuarioRepository;

    @Override
    public CriarUsuarioResponseDTO criarUsuario(CriarUsuarioRequestDTO dto) {
        Usuario usuario = dto.toModel();
        usuario = usuarioRepository.save(usuario);
        return CriarUsuarioResponseDTO.toDTO(usuario);
    }

    @Override
    public List<LerUsuarioResponseDTO> lerUsuario() {
        Iterable<Usuario> i = usuarioRepository.findAll();
        List<LerUsuarioResponseDTO> l = new ArrayList<>();
        i.forEach(e -> l.add(LerUsuarioResponseDTO.toDTO(e)));
        return l;
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
