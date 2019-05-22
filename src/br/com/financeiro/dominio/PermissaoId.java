package br.com.financeiro.dominio;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
@Access(AccessType.PROPERTY)
public class PermissaoId implements Serializable{
	
	
	  public PermissaoId() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_usuario")
	  private Usuario usuario;

	  @ManyToOne(fetch = FetchType.EAGER)
	  @JoinColumn(name = "id_papel")
	  private Papel papel;
	  
	  
	  

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Papel getPapel() {
		return papel;
	}

	public void setPapel(Papel papel) {
		this.papel = papel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	  
	  
	  
	  
}
