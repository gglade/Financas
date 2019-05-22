package br.com.financeiro.controllers;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import br.com.financeiro.dao.AbstractDao;


@Component("AbstractControllerImpl")
public abstract class AbstractControllerImpl<T> implements AbstractController<T>, Serializable{	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected T entity;
	protected List<T> lista;
	protected DataModel<T> dataModel;
	protected ListDataModel<T> listDataModel;
	protected AbstractDao<T> dao;
	protected Class<T> clazz;
	protected String clazzdao;	
	
	
	

	@Autowired
	  private ApplicationContext contexto;
	
	@SuppressWarnings("unchecked")
	public AbstractControllerImpl() {
		clazz = (Class<T>) getType();
		instanciarEntidade();
	}

	   @SuppressWarnings("unchecked")
		@PostConstruct
	    public void iniciarInstanciaDao() {
	        clazz = (Class<T>) getType();
	        clazzdao = clazz.getSimpleName() + "Dao";
	        dao = (AbstractDao<T>) contexto.getBean(clazzdao);
	    }
	

	private Type getType() {
		ParameterizedType superclass = (ParameterizedType) getClass()
				.getGenericSuperclass();	
		
		return superclass.getActualTypeArguments()[0];	
	
	}	

	
	
	//******************************************************	
    protected abstract void instanciarEntidade();

    protected abstract long getEntidadeId(T entidade);
    
 //****************************************************
	
	
	
	@Override
	public void save(T entity) {
		dao.save(entity);
				
	}

	@Override
	public void update(T entity) {
		dao.update(entity);		
	}

	@Override
	public void saveOrUpdate(T entity) {
		dao.saveOrUpdate(entity);
			
	}

	@Override
	public void delete(T entity) {
		dao.delete(entity);
			
	}

	@Override
	public T find(long id) {
	
		return	dao.find(id);
	
	}

	@Override
	public List<T> findAll() {
		 return dao.findAll();		
	
	}	
	
}
