package br.com.financeiro.view;

import java.util.List;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.financeiro.controllers.EstabelecimentoController;
import br.com.financeiro.dominio.Estabelecimento;

@Component
@Scope("session")
public class EstabelecimentoBean extends AbstractCrudMBean<Estabelecimento>{
	
	
	private List<Estabelecimento> estabelecimentos;

	public EstabelecimentoBean() {
		super();
		limparFormulario();
	}
	
	@Inject
	private EstabelecimentoController controller;
	
	@Override
	protected void limparFormulario() {
		entidade = new Estabelecimento();
		
	}

	public List<Estabelecimento> getEstabelecimentos() {
		this.estabelecimentos = controller.findAll();
		return estabelecimentos;
	}

	public void setEstabelecimentos(List<Estabelecimento> estabelecimentos) {
		this.estabelecimentos = estabelecimentos;
	}

}
