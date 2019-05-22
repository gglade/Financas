package br.com.financeiro.services;

import java.util.List;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import br.com.financeiro.controllers.ContaController;
import br.com.financeiro.dominio.Conta;

@WebService
@Component
public class FluxoDeCaixaRemoteServiceImpl implements FluxoDeCaixaRemoteService{

	@Override
	public List<Conta> getContas(int idUsuario) {
		return new ContaController().getContasUsuario(idUsuario);
	}

}
