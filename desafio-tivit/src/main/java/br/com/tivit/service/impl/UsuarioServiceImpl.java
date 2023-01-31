package br.com.tivit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tivit.dto.UsuarioDTO;
import br.com.tivit.repository.UsuarioRepository;
import br.com.tivit.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void addUsuario(UsuarioDTO usuarioDTO) throws Exception, Throwable {
		usuarioRepository.addUsuario(usuarioDTO);
		
	}

}
