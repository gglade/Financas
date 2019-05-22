package br.com.financeiro.controllers;

import org.springframework.stereotype.Component;

import br.com.financeiro.dominio.Estabelecimento;

@Component("EstabelecimentoController")
public class EstabelecimentoController extends AbstractControllerImpl<Estabelecimento>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public EstabelecimentoController() {
		super();
		instanciarEntidade();
		
	}

	@Override
	protected void instanciarEntidade() {
		entity = new Estabelecimento();
		
	}
	

	@Override
	protected long getEntidadeId(Estabelecimento e) {
		
		return e.getId();
	}

}
