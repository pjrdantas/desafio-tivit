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
@JsonPropertyOrder({ "idUsuario", "cpfUsuario",  "nomeUsuario" })
public class UsuarioDTO {

	@JsonProperty("idUsuario")
	private long idUsuario;

	@JsonProperty("cpfUsuario")
	private String cpfUsuario;

	@JsonProperty("nomeUsuario")
	private String nomeUsuario;
	
	public UsuarioDTO() {
		
	}
}
