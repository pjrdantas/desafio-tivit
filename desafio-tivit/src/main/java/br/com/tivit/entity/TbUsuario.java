package br.com.tivit.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_USUARIO")
public class TbUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_USUARIO")
	private long idUsuario;

	@Column(name="CPF_USUARIO")
	private String cpfUsuario;

	@Column(name="NOME_USUARIO")
	private String nomeUsuario;

	public TbUsuario() {
	}

}