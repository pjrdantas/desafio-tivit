package br.com.tivit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.tivit.dto.VotacaoPautaDTO;
import br.com.tivit.service.VotacaoPautaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Validated
@Api(value = "service")
@RequestMapping("/service")
public class VotacaoPautaController {

	private static final Logger log = LoggerFactory.getLogger(VotacaoPautaController.class);
	
	@Autowired
	private VotacaoPautaService votacaoPautaService;
	
	
	@ApiOperation(value = "INCLUIR VOTAÇÃO DA PAUTA")
	@RequestMapping(value = "/votacaoPauta", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Void> salvar(@RequestBody VotacaoPautaDTO votacaoPautaDTO) throws Exception, Throwable {
		
		try {
			this.votacaoPautaService.addVotacaoPauta(votacaoPautaDTO);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			log.error("ERRO NA INCLUSÃO DA VOTAÇÃO DA PAUTA: ",e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
