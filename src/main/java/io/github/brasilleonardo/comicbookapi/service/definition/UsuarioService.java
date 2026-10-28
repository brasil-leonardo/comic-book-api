package io.github.brasilleonardo.comicbookapi.service.definition;

import java.util.List;

import io.github.brasilleonardo.comicbookapi.dto.request.CriarUsuarioRequestDTO;
import io.github.brasilleonardo.comicbookapi.dto.response.CriarUsuarioResponseDTO;
import io.github.brasilleonardo.comicbookapi.dto.response.LerUsuarioResponseDTO;

public interface UsuarioService {
    public CriarUsuarioResponseDTO criarUsuario(CriarUsuarioRequestDTO dto);
    public List<LerUsuarioResponseDTO> lerUsuario();
    public void deleteUsuario(Long id);
}