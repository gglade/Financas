package br.com.financeiro.dominio;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Papel implements Serializable{	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8936922166532871771L;
	@Id
	@Column(name = "id_papel")
	@GeneratedValue(generator = "SEQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequenceName = "sequence_papel", name = "SEQ", allocationSize = 1)
	private int id;
	
	private String descricao;
	
//	@ManyToMany(fetch=FetchType.LAZY)
//	@JoinTable(name="permissao", joinColumns = @JoinColumn (name="id_papel"), inverseJoinColumns = @JoinColumn (name="id_usuario"))
//	private Collection<Usuario> usuarios;
		
	@OneToMany(mappedBy = "id.papel")
	private Collection<Permissao> permissoes;
	

	public Collection<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(Collection<Permissao> permissoes) {
		this.permissoes = permissoes;
	}

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

//	public Collection<Usuario> getUsuarios() {
//		return usuarios;
//	}
//
//	public void setUsuarios(Collection<Usuario> usuarios) {
//		this.usuarios = usuarios;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
