package br.com.financeiro.services;

import java.util.List;

import javax.jws.WebService;

import br.com.financeiro.dominio.Conta;

@WebService
public interface FluxoDeCaixaRemoteService {
	
	List<Conta> getContas(int idUsuario);

}
