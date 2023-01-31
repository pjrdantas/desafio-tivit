package br.com.tivit.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
@JsonPropertyOrder({ "idPauta", "codigoPauta",  "descrPauta", "dataPauta" })
public class PautaDTO {

	@JsonProperty("idPauta")
	private long idPauta;

	@JsonProperty("codigoPauta")
	private Integer codigoPauta;
	
	@JsonProperty("descrPauta")
	private String descrPauta;
	
	@JsonProperty("dataPauta")
	private String dataPauta;
	
	public PautaDTO() {
		
	}
}
