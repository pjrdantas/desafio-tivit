package br.com.tivit.repository;

import br.com.tivit.dto.UsuarioDTO;

public interface UsuarioRepository {
	
	void addUsuario(UsuarioDTO usuarioDTO) throws Exception, Throwable;

}
