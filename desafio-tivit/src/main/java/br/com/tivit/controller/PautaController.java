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

import br.com.tivit.dto.PautaDTO;
import br.com.tivit.service.PautaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Validated
@Api(value = "service")
@RequestMapping("/service")
public class PautaController {
	
	private static final Logger log = LoggerFactory.getLogger(PautaController.class);
	
	@Autowired
	private PautaService pautaService;
	
	
	@ApiOperation(value = "INCLUIR PAUTA")
	@RequestMapping(value = "/pauta", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Void> salvar(@RequestBody PautaDTO pautaDTO) throws Exception, Throwable {
		
		try {
			this.pautaService.addPauta(pautaDTO);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			log.error("ERRO NA INCLUSÃO DA PAUTA: ",e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
