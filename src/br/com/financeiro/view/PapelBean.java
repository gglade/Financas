package br.com.financeiro.view;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.financeiro.dominio.Papel;

@Component
@Scope("session")
public class PapelBean extends AbstractCrudMBean<Papel>{
	
	private List<Papel> papeis;
	
	
	public PapelBean() {
		super();
		limparFormulario();
	}

	@Override
	protected void limparFormulario() {
		entidade = new Papel();
		
	}
	
	public ListDataModel<Papel> getDataModel() {
		dataModel = new ListDataModel<Papel>(controller.findAll());
		return dataModel;
	}

	public List<Papel> getPapeis() {
		this.papeis = controller.findAll();
		return papeis;
	}

	public void setPapeis(List<Papel> papeis) {
		this.papeis = papeis;
	}

	
	
}
