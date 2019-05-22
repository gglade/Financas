package br.com.financeiro.view;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.financeiro.dominio.Usuario;

@Component
@Scope("session")
public class UsuarioBean extends AbstractCrudMBean<Usuario>{
	
	private List<Usuario> usuarios;
	
	
	public UsuarioBean(){
		super();
		entidade = new Usuario();
		limparFormulario();
	}


	@Override
	protected void limparFormulario() {
		entidade = new Usuario();
		
	}

	public String prepararAlterar() {
		// limparFormulario();
		entidade = dataModel.getRowData();
		return null;
	}
	
	public ListDataModel<Usuario> getDataModel() {
		dataModel = new ListDataModel<Usuario>(controller.findAll());
		return dataModel;
	}
	
	public List<Usuario> getUsuarios() {
		this.usuarios = controller.findAll();
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	

}
