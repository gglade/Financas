package br.com.financeiro.dominio;

import java.io.Serializable;
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
public class Usuario implements  Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1784550491174191330L;

	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(generator = "SEQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequenceName = "sequence_user", name = "SEQ", allocationSize = 1)
	private int id;
		
	private String  login;
	
	private String password;
	
	private String nome;
	
	private Double saldoAtual;
	
	@Column(name = "enable", columnDefinition= "BOOLEAN")
	private boolean enable;
	
	
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Collection<Conta> contas;
	
		
//	@ManyToMany(fetch=FetchType.LAZY)
//	@JoinTable(name="permissao", joinColumns = @JoinColumn (name="id_usuario"), inverseJoinColumns = @JoinColumn (name="id_papel"))
//	private Collection<Papel> papeis;
	
	
	@OneToMany(mappedBy = "id.usuario")
	private Collection<Permissao> permissoes;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isEnable() {
		return enable;
	}


	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Collection<Permissao> getPermissoes() {
		return permissoes;
	}


	public void setPermissoes(Collection<Permissao> permissoes) {
		this.permissoes = permissoes;
	}


	public Collection<Conta> getContas() {
		return contas;
	}


	public void setContas(Collection<Conta> contas) {
		this.contas = contas;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getSaldoAtual() {
		return saldoAtual;
	}


	public void setSaldoAtual(Double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}


		
	
}
