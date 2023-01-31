package br.com.tivit.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.tivit.dto.VotacaoPautaDTO;
import br.com.tivit.repository.VotacaoPautaRepository;

@Transactional
@Repository
public class VotacaoPautaRepositoryImpl implements VotacaoPautaRepository {
	
	private static final Logger log = LoggerFactory.getLogger(VotacaoPautaRepositoryImpl.class);

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public void addVotacaoPauta(VotacaoPautaDTO votacaoPautaDTO) throws Exception, Throwable {
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("  INSERT INTO ");
		sql.append("  TB_VOTO ("); 
		sql.append("  ID_VOTO, ");
		sql.append("  COD_PAUTA, ");
		sql.append("  CPF_USUARIO, ");
		sql.append("  VOTO_ABSTENCAO, ");
		sql.append("  VOTO_NAO, ");
		sql.append("  VOTO_SIM ) ");
		sql.append("  values (:idVoto, :codPauta, :cpfUsuario, :votoAbstencao, :votoNao, :votoSim)");
		SqlParameterSource params = new MapSqlParameterSource()
				.addValue("idVoto", votacaoPautaDTO.getIdVoto())
				.addValue("codPauta", votacaoPautaDTO.getCodPauta())
				.addValue("cpfUsuario", votacaoPautaDTO.getCpfUsuario())
				.addValue("votoAbstencao", votacaoPautaDTO.getVotoAbstencao())
				.addValue("votoNao", votacaoPautaDTO.getVotoNao())
				.addValue("votoSim", votacaoPautaDTO.getVotoSim());

		jdbcTemplate.update(sql.toString(), params);
		log.info("VOTAÇÃO DA PAUTA REALIZADA COM SUCESSO!");
	}

	@Override
	public VotacaoPautaDTO getVotacaoPautaById(Integer codPauta, String cpfUsuario) throws Exception, Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VotacaoPautaDTO> getAllVotacaoPauta() throws Exception, Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
