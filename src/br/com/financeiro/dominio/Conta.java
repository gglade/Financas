package br.com.financeiro.dominio;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;



@Entity
public class Conta {
	
	@Id
	@Column(name = "id_conta")
	@GeneratedValue(generator = "SEQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequenceName = "sequence_conta", name = "SEQ", allocationSize = 1)
	private int  id;
	
	private String descricaoConta;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_emissao", length = 15, insertable = true, updatable = true)
	private Date dataEmissao;
	
	private double valorTotal;
	
	private char tipo;
	
	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	@ManyToOne
	@JoinColumn(name = "id_tipoconta")
	private TipoConta tipoConta;

	@ManyToOne  
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@OneToMany(mappedBy = "conta", cascade=CascadeType.ALL)	
	private Collection<Parcela> parcelas;
	
	private int numeroParcela;
	
	@ManyToOne  
	@JoinColumn(name = "id_estabelecimento")
	private Estabelecimento estabelecimento;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricaoConta() {
		return descricaoConta;
	}

	public void setDescricaoConta(String descricaoConta) {
		this.descricaoConta = descricaoConta;
	}


	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Collection<Parcela> getParcelas() {
		return parcelas;
	}

	public void setParcelas(Collection<Parcela> parcelas) {
		this.parcelas = parcelas;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setNumeroParcela(int numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	public int getNumeroParcela() {
		return numeroParcela;
	}
	
	

}
