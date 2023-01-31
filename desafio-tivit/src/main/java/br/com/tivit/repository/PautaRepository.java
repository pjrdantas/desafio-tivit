package br.com.tivit.repository;

import java.util.List;

import br.com.tivit.dto.PautaDTO;

public interface PautaRepository {
	
	
	void addPauta(PautaDTO pautaDTO) throws Exception, Throwable;
	
	PautaDTO getPautaById(int idPauta) throws Exception, Throwable;
	
	List<PautaDTO> getAllPauta() throws Exception, Throwable;


}
