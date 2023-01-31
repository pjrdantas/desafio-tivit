package br.com.tivit.service;

import java.util.List;

import br.com.tivit.dto.VotacaoPautaDTO;

public interface VotacaoPautaService {

	void addVotacaoPauta(VotacaoPautaDTO votacaoPautaDTO) throws Exception, Throwable;

	VotacaoPautaDTO getVotacaoPautaById(Integer codPauta, String cpfUsuario) throws Exception, Throwable;

	List<VotacaoPautaDTO> getAllVotacaoPauta() throws Exception, Throwable;

}
