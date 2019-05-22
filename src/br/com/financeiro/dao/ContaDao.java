package br.com.financeiro.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import br.com.financeiro.dominio.Conta;

@Component("ContaDao")
public class ContaDao extends AbstractDaoImp<Conta>{
	
	public ContaDao(){
		super();
		
	}
	
	@Inject
	private HibernateTemplate ht;
	
	@SuppressWarnings("unchecked")
	public List<Conta> getSaldoContaUsuario (int userId){
		
		Query q = getSession().createQuery("from Conta c where c.usuario.id= :user");
		q.setInteger("user",userId);
		return q.list();
		
	}

}
