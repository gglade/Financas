package br.com.financeiro.dominio;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Parcela {
	
	@Id
	@Column(name = "id_parcela")
	@GeneratedValue(generator = "SEQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequenceName = "sequence_parcela", name = "SEQ", allocationSize = 1)
	private int  id;
	
	
	private double valorParcela;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_vencimento", length = 15, insertable = true, updatable = true)
	private Date dataVencimento;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_pagamento",  length = 15, insertable = true, updatable = true)
	private Date dataPagamento;
	
	
	@Column(name = "Situcao",length = 1, insertable = true, updatable = true)
    private String situacao;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_conta")
	private Conta conta;
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	

}
