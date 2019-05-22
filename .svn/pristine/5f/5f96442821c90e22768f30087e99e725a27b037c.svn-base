package br.com.financeiro.controllers;

import org.springframework.stereotype.Component;

import br.com.financeiro.dominio.Papel;


@Component("PapelController")
public class PapelController extends AbstractControllerImpl<Papel>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public PapelController() {
		super();
		instanciarEntidade();
	}
	
	
	@Override
	protected void instanciarEntidade() {
		entity = new Papel();	
		
	}

	
	@Override
	protected long getEntidadeId(Papel p) {
		
		return p.getId();
	}
	

}
