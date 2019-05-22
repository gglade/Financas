package br.com.financeiro.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.model.ListDataModel;
import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.financeiro.controllers.ContaController;
import br.com.financeiro.controllers.EstabelecimentoController;
import br.com.financeiro.dominio.Conta;
import br.com.financeiro.dominio.Estabelecimento;
import br.com.financeiro.dominio.Parcela;
import br.com.financeiro.dominio.Usuario;


@Component
@Scope("session")
public class ContaBean extends AbstractCrudMBean<Conta>{
	
	private ListDataModel<Conta> saldoAgrupado;
	private double saldoUser;
	private int usuarioSelecionado;
	
	public ContaBean(){
		super();
		entidade = new Conta();
		entidade.setEstabelecimento(new Estabelecimento());
		entidade.setUsuario(new Usuario());
	}
	
	@Inject
	private ContaController controller;
	
	@Inject
	private EstabelecimentoController estabelecimentoController;
	
	
	@Override
	protected void limparFormulario() {
	entidade = new Conta();
	entidade.setEstabelecimento(new Estabelecimento());
	entidade.setUsuario(new Usuario());
		
	}
	
	public void carregarSaldo (){
		this.saldoAgrupado = getListDataModel();
	}

	
	public ListDataModel<Conta> getListDataModel (){
		
		if(usuarioSelecionado !=0){
			
			saldoAgrupado = new ListDataModel<Conta>(controller.getContasUsuario(usuarioSelecionado));
			return saldoAgrupado;
		}
		return null;
	}

	
	
	public void carregarSaldoUser (){
		this.saldoUser = getSaldoUser();
	}
	
	
	public double getSaldoUser (){
		
		if(usuarioSelecionado !=0){
		
			saldoUser = controller.getSaldoUsuario(usuarioSelecionado);
			
			return saldoUser;
		}
		return 0;
	}


	
	
	
	@SuppressWarnings("deprecation")
	public String salvarConta() {
	     int dias=30;
		ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
	     for (int i=1; i<=entidade.getNumeroParcela(); i++){
			Parcela parcela = new Parcela();
			parcela.setValorParcela(entidade.getValorTotal()/entidade.getNumeroParcela());
			Date data = new Date();
		    data=entidade.getDataEmissao();
		    data.setDate(data.getDate()+(dias*i));
			parcela.setDataVencimento(data);
			parcela.setSituacao("A");
			parcela.setConta(entidade);
			parcelas.add(parcela); 
		}
	    System.out.println("ID ESTABELECIMENTO :" + entidade.getEstabelecimento().getId());
		entidade.setParcelas(parcelas);
		controller.saveOrUpdate(entidade);
		limparFormulario();
		return null;
	}



	public ContaController getController() {
		return controller;
	}



	public void setController(ContaController controller) {
		this.controller = controller;
	}

	public ListDataModel<Conta> getSaldoAgrupado() {
		return saldoAgrupado;
	}

	public void setSaldoAgrupado(ListDataModel<Conta> saldoAgrupado) {
		this.saldoAgrupado = saldoAgrupado;
	}

	public int getUsuarioSelecionado() {
		return usuarioSelecionado;
	}

	public void setUsuarioSelecionado(int usuarioSelecionado) {
		this.usuarioSelecionado = usuarioSelecionado;
	}
		
}
