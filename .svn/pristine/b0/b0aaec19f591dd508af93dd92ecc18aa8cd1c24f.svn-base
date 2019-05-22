package br.com.financeiro.controllers;

import org.springframework.stereotype.Component;

import br.com.financeiro.dominio.Usuario;

@Component("UsuarioController")
public class UsuarioController extends AbstractControllerImpl<Usuario>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public UsuarioController(){
		super();
		instanciarEntidade();
	}



	
	@Override
	protected void instanciarEntidade() {
		entity = new Usuario();
		
		
	}

	@Override
	protected long getEntidadeId(Usuario u) {
		
		return u.getId();
	}
	
}
