package br.com.financeiro.dao;

import org.springframework.stereotype.Component;

import br.com.financeiro.dominio.Permissao;

@Component("PermissaoDao")
public class PermissaoDao extends AbstractDaoImp<Permissao>{

	public PermissaoDao() {
		super();
		
	}

}
