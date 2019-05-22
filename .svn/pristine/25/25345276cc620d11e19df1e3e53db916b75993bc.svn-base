package br.com.financeiro.dominio;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.springframework.security.access.annotation.Secured;

@Entity
public class TipoConta {
	
	@Id
	@Column(name = "id_tipoconta")
	@GeneratedValue(generator = "SEQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequenceName = "sequence_tipoconta", name = "SEQ", allocationSize = 1)
	private int  id;
	
	private String descricao;
	
	@OneToMany(mappedBy = "tipoConta")
	private Collection<Conta> contas;
	
	
	@Secured ({"ROLE_ADMIN"})
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Collection<Conta> getContas() {
		return contas;
	}

	public void setContas(Collection<Conta> contas) {
		this.contas = contas;
	}
	

}
