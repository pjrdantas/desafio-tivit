package br.com.tivit.service;

import java.util.List;

import br.com.tivit.dto.PautaDTO;

public interface PautaService {
	
	void addPauta(PautaDTO pautaDTO) throws Exception, Throwable;
	
	PautaDTO getPautaById(int idPauta) throws Exception, Throwable;
	
	List<PautaDTO> getAllPauta() throws Exception, Throwable;

}
