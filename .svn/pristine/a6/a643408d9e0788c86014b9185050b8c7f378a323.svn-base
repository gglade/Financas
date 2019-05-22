package br.com.financeiro.dominio;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Estabelecimento {
	
	@Id
	@Column(name = "id_estabelecimento")
	@GeneratedValue(generator = "SEQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequenceName = "sequence_estabelecimento", name = "SEQ", allocationSize = 1)
	private int  id;
	
	private String nomeEstabelecimento;
	
	@Column(name = "Situcao", nullable = false, length = 1, insertable = true, updatable = true)
    private String situacao;
	
	@OneToMany(mappedBy = "estabelecimento", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Collection<Conta> contas;	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}

	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		this.nomeEstabelecimento = nomeEstabelecimento;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Collection<Conta> getContas() {
		return contas;
	}

	public void setContas(Collection<Conta> contas) {
		this.contas = contas;
	}

	
	
	
	
}
