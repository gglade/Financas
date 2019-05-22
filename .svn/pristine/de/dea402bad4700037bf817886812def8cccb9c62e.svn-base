package br.com.financeiro.services;

import javax.inject.Inject;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

import br.com.financeiro.controllers.ContaController;

@WebService
@Component
public class SaldoRemoteServiceImpl implements SaldoRemoteService{
	
	@Inject
	private ContaController controller;

	@Override
	public double getSaldoAtual(int idUsuario) {

		return controller.getSaldoUsuario(idUsuario);
	}

}
