package br.com.tivit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_VOTO")
public class TbVoto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_VOTO")
	private long idVoto;

	@Column(name="COD_PAUTA")
	private Integer codPauta;

	@Column(name="CPF_USUARIO")
	private String cpfUsuario;

	@Column(name="VOTO_ABSTENCAO")
	private Integer votoAbstencao;

	@Column(name="VOTO_NAO")
	private Integer votoNao;

	@Column(name="VOTO_SIM")
	private Integer votoSim;

	public TbVoto() {
	}

}