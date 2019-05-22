package br.com.financeiro.dominio;



import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@Access(AccessType.FIELD)
public class Permissao{

	
	 public Permissao() {
		super();
	
	}

	@EmbeddedId
	  private PermissaoId id;
	 
	 	

	public PermissaoId getId() {
		return id;
	}

	public void setId(PermissaoId id) {
		this.id = id;
	}
	
	

}
