package br.com.tivit.service;


import org.springframework.stereotype.Service;

import br.com.tivit.dto.UsuarioDTO;

@Service
public interface UsuarioService {
	
	void addUsuario(UsuarioDTO usuarioDTO) throws Exception, Throwable;

}
