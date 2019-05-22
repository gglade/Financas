package br.com.financeiro.services;

import javax.jws.WebService;

@WebService
public interface SaldoRemoteService {
	
	double getSaldoAtual(int idUsuario);

}
