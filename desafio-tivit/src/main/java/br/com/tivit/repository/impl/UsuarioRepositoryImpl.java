package br.com.tivit.repository.impl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.tivit.dto.UsuarioDTO;
import br.com.tivit.repository.UsuarioRepository;

@Transactional
@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

	private static final Logger log = LoggerFactory.getLogger(UsuarioRepositoryImpl.class);
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public void addUsuario(UsuarioDTO usuarioDTO) throws Exception, Throwable {
		 
		
StringBuilder sql = new StringBuilder();
		
		sql.append("  INSERT INTO ");
		sql.append("  TB_USUARIO ("); 
		sql.append("  ID_USUARIO, ");
		sql.append("  CPF_USUARIO, ");
		sql.append("  NOME_USUARIO) ");
		sql.append("  values (:idUsuario, :cpfUsuario, :nomeUsuario)");
		SqlParameterSource params = new MapSqlParameterSource()
				.addValue("idUsuario", usuarioDTO.getIdUsuario())
				.addValue("cpfUsuario", usuarioDTO.getCpfUsuario())
				.addValue("nomeUsuario", usuarioDTO.getNomeUsuario());
		
		jdbcTemplate.update(sql.toString(), params);
		log.info("USUARIO INCLUIDO COM SUCESSO!");
		
		
	}

}
