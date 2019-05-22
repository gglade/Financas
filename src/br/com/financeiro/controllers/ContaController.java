package br.com.financeiro.controllers;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import br.com.financeiro.dao.ContaDao;
import br.com.financeiro.dominio.Conta;
import br.com.financeiro.dominio.Estabelecimento;
import br.com.financeiro.dominio.Usuario;


@Component("ContaController")
public class ContaController extends AbstractControllerImpl<Conta>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public ContaController(){
		super();
		instanciarEntidade();
	}

	@Inject
	private ContaDao dao;
	
	public double getSaldoUsuario (int id){
		
		double saldo=0;
		lista = (List<Conta>)dao.getSaldoContaUsuario(id);
		for(Conta c:lista){
			if(c.getTipo()=='R'){
				saldo+=c.getValorTotal();
			}else {
				saldo=saldo-c.getValorTotal();
			}
		}
		
		return saldo;
	}
	
	
	public List<Conta> getContasUsuario(int id){
		return lista = (List<Conta>)dao.getSaldoContaUsuario(id);
		
	}
	
	@Override
	protected void instanciarEntidade() {
		entity = new Conta();
		entity.setUsuario(new Usuario());
		entity.setEstabelecimento(new Estabelecimento());
		//entity.setTipoConta(new TipoConta());
		
	}

	@Override
	protected long getEntidadeId(Conta c) {
		
		return c.getId();
	}

	
//	public List<Usuario> getSaldoUsuario (int id){
//		List<Usuario> listaUser = new ArrayList<Usuario>();
//		
//		double saldo=0;
//		lista = (List<Conta>)dao.getSaldoContaUsuario(id);
//		for(Conta c:lista){
//			if(c.getTipo()=='P'){
//				saldo+=c.getValorTotal();
//			}else {
//				saldo=saldo-c.getValorTotal();
//			}
//		}
//		Usuario u =new UsuarioController().find(id); 
//		u.setSaldoAtual(saldo);
//		listaUser.add(u);
//		return listaUser;
//	}
//	
	
}
