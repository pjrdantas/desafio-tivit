package br.com.tivit.repository.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.tivit.dto.PautaDTO;
import br.com.tivit.repository.PautaRepository;

@Transactional
@Repository
public class PautaRepositoryImpl implements PautaRepository {
	
	private static final Logger log = LoggerFactory.getLogger(PautaRepositoryImpl.class);
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public void addPauta(PautaDTO pautaDTO) throws Exception, Throwable {
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("  INSERT INTO ");
		sql.append("  TB_PAUTA ("); 
		sql.append("  ID_PAUTA, ");
		sql.append("  ABSTENCAO_PAUTA, ");
		sql.append("  CODIGO_PAUTA, ");
		sql.append("  DATA_PAUTA, ");
		sql.append("  DESCR_PAUTA, ");
		sql.append("  VOTO_NAO_PAUTA, ");
		sql.append("  VOTO_SIM_PAUTA) ");
		sql.append("  values (:idPauta, :abstencaoPauta, :codigoPauta, :dataPauta, :descrPauta, :votoNaoPauta, :votoSimPauta)");
		SqlParameterSource params = new MapSqlParameterSource()
				.addValue("idPauta", pautaDTO.getIdPauta())
				.addValue("abstencaoPauta", 0)
				.addValue("codigoPauta", pautaDTO.getCodigoPauta())
				.addValue("dataPauta", df.parse(pautaDTO.getDataPauta()))
				.addValue("descrPauta", pautaDTO.getDescrPauta())
				.addValue("votoNaoPauta", 0)
				.addValue("votoSimPauta", 0);
		
		jdbcTemplate.update(sql.toString(), params);
		log.info("PAUTA INCLUIDA COM SUCESSO!");
		
	}


	@Override
	public PautaDTO getPautaById(int idPauta) throws Exception, Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PautaDTO> getAllPauta() throws Exception, Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
