package br.com.tivit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tivit.dto.VotacaoPautaDTO;
import br.com.tivit.repository.VotacaoPautaRepository;
import br.com.tivit.service.VotacaoPautaService;

@Service
public class VotacaoPautaServiceImpl implements VotacaoPautaService {
	
	@Autowired
	private VotacaoPautaRepository votacaoPautaRepository;

	@Override
	public void addVotacaoPauta(VotacaoPautaDTO votacaoPautaDTO) throws Exception, Throwable {
		votacaoPautaRepository.addVotacaoPauta(votacaoPautaDTO);
		
	}

	@Override
	public VotacaoPautaDTO getVotacaoPautaById(Integer codPauta, String cpfUsuario) throws Exception, Throwable {
		VotacaoPautaDTO obj = votacaoPautaRepository.getVotacaoPautaById(codPauta, cpfUsuario);
		return obj;
	}

	@Override
	public List<VotacaoPautaDTO> getAllVotacaoPauta() throws Exception, Throwable {
		return votacaoPautaRepository.getAllVotacaoPauta();
	}

}
