package br.com.tivit.repository;

import java.util.List;

import br.com.tivit.dto.VotacaoPautaDTO;

public interface VotacaoPautaRepository {
	
	void addVotacaoPauta(VotacaoPautaDTO votacaoPautaDTO) throws Exception, Throwable;

	VotacaoPautaDTO getVotacaoPautaById(Integer codPauta, String cpfUsuario) throws Exception, Throwable;

	List<VotacaoPautaDTO> getAllVotacaoPauta() throws Exception, Throwable;

}
