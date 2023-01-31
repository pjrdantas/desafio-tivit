package br.com.tivit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tivit.dto.PautaDTO;
import br.com.tivit.repository.PautaRepository;
import br.com.tivit.service.PautaService;

@Service
public class PautaServiceImpl  implements PautaService{
	
	@Autowired
	private PautaRepository pautaRepository;

	@Override
	public void addPauta(PautaDTO pautaDTO) throws Exception, Throwable {
		pautaRepository.addPauta(pautaDTO);
		
	}


	@Override
	public PautaDTO getPautaById(int idPauta) throws Exception, Throwable {
		PautaDTO obj = pautaRepository.getPautaById(idPauta);
		return obj;
	}

	@Override
	public List<PautaDTO> getAllPauta() throws Exception, Throwable {
		return pautaRepository.getAllPauta();
	}

}
