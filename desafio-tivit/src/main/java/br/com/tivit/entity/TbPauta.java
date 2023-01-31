package br.com.tivit.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_PAUTA")
public class TbPauta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_PAUTA")
	private long idPauta;

	@Column(name="ABSTENCAO_PAUTA")
	private Integer abstencaoPauta;

	@Column(name="CODIGO_PAUTA")
	private Integer codigoPauta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_PAUTA")
	private Date dataPauta;

	@Column(name="DESCR_PAUTA")
	private String descrPauta;

	@Column(name="VOTO_NAO_PAUTA")
	private Integer votoNaoPauta;

	@Column(name="VOTO_SIM_PAUTA")
	private Integer votoSimPauta;

	public TbPauta() {
	}


}