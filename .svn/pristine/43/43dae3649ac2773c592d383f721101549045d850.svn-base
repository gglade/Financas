package br.com.financeiro.view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;
import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.financeiro.controllers.PapelController;
import br.com.financeiro.controllers.PermissaoController;
import br.com.financeiro.controllers.UsuarioController;
import br.com.financeiro.dominio.Papel;
import br.com.financeiro.dominio.Permissao;
import br.com.financeiro.dominio.PermissaoId;
import br.com.financeiro.dominio.Usuario;


@Component
@Scope("session")
public class PermissaoBean extends AbstractCrudMBean<Permissao>{

	PermissaoId permissao = new PermissaoId();

	private int usuarioSelecionado;
	private int papelSelecionado;
	private List<SelectItem> listUsuario;
	private List<SelectItem> listPapel;
	
	
	public PermissaoBean(){
		super();
		limparFormulario();
	}

	@Inject
	private PermissaoController controller;
	
	@Inject 
	UsuarioController useController;
	
	@Inject
	PapelController roleController;
	
	@Override
	protected void limparFormulario() {		
		entidade = new Permissao();	
		setUsuarioSelecionado(0);
		setPapelSelecionado(0);
		
	} 
	
	 //montando a lista  
	   public List<SelectItem> getListUsuario() {        
	        
	      List<Usuario> list = useController.findAll();	      
	      listUsuario = new ArrayList<SelectItem>(list.size());	      
	      Usuario u = new Usuario();  
	      u.setId(0);        
	      SelectItem item = new SelectItem(u,"Selecione");  
	      listUsuario.add(item);  	        
	      for(Usuario usuario: list)  
	      listUsuario.add(new SelectItem(usuario, usuario.getNome()));  
	        
	      return listUsuario;  	      
         
	   }     
	
	   //montando a lista  
	   public List<SelectItem> getListPapel() {        
	        
	      List<Papel> list = roleController.findAll();	      
	      listPapel= new ArrayList<SelectItem>(list.size());	      
	      Papel p = new Papel();  
	      p.setId(0);        
	      SelectItem item = new SelectItem(p,"Selecione");  
	      listPapel.add(item);  	        
	      for(Papel papel: list)  
	      listPapel.add(new SelectItem(papel, papel.getDescricao()));  
	        
	      return listPapel;  	      
         
	   }     
	
	public String salvarPermissao(){
		entidade = new Permissao();
		Usuario usuario = new Usuario();
		Papel papel = new Papel();
		
		usuario.setId(usuarioSelecionado);
		papel.setId(papelSelecionado);
		
		permissao.setUsuario(usuario);
		permissao.setPapel(papel);
		
		entidade.setId(permissao);
		controller.saveOrUpdate(entidade);
		limparFormulario();
		
		return null;
	}
	
	public String prepararAlterar() {
		// limparFormulario();
		entidade = dataModel.getRowData();
		return null;
	}
	
	public ListDataModel<Permissao> getDataModel() {
		dataModel = new ListDataModel<Permissao>(controller.findAll());
		return dataModel;
	}

	public int getUsuarioSelecionado() {
		return usuarioSelecionado;
	}

	public void setUsuarioSelecionado(int usuarioSelecionado) {
		this.usuarioSelecionado = usuarioSelecionado;
	}

	public int getPapelSelecionado() {
		return papelSelecionado;
	}

	public void setPapelSelecionado(int papelSelecionado) {
		this.papelSelecionado = papelSelecionado;
	}

	public PermissaoId getPermissao() {
		return permissao;
	}

	public void setPermissao(PermissaoId permissao) {
		this.permissao = permissao;
	}

	public PermissaoController getController() {
		return controller;
	}


	public void setController(PermissaoController controller) {
		this.controller = controller;
	}
	
	
	
}
