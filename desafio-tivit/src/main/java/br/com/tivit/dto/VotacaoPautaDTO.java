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
@JsonPropertyOrder({ "idVoto", "codPauta",  "cpfUsuario", "votoAbstencao", "votoNao", "votoSim" })
public class VotacaoPautaDTO {
	
	@JsonProperty("idVoto")
	private long idVoto;

	@JsonProperty("codPauta") 
	private Integer codPauta;

	@JsonProperty("cpfUsuario") 
	private String cpfUsuario;
	
	@JsonProperty("votoAbstencao")
	private Integer votoAbstencao;

	@JsonProperty("votoNao")
	private Integer votoNao;

	@JsonProperty("votoSim")
	private Integer votoSim;
	
	public VotacaoPautaDTO() {
		
	}

}
