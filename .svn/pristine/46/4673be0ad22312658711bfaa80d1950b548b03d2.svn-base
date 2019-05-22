package br.com.financeiro.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import javax.inject.Inject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractDaoImp<T> implements AbstractDao<T> {

	protected Class<T> clazz;
	
	@Inject
	protected SessionFactory sessionFactory;
	
	@Inject
	private HibernateTemplate ht;
	
	//private static HibernateTemplate singleton;

	@SuppressWarnings("unchecked")
	public AbstractDaoImp() {
		clazz = (Class<T>) getType();				
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(T entity) {
		ht.saveOrUpdate(entity);
	}

	@Override
	public void update(T entity) {
		ht.update(entity);
	}

	@Override
	public void saveOrUpdate(T entity) {
		ht.saveOrUpdate(entity);
	}

	@Override
	public void delete(T entity) {
		ht.delete(entity);
	}

	@Override
	public T find(long id) {		
		return (T) ht.get(clazz, id);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<T> findAll() {						
		List<T> retorno = (List<T>) ht.find(
				"from " + clazz.getSimpleName());
		return retorno;
	}
		 
	
//	protected HibernateTemplate getHibernateTemplate(){
//		if(singleton==null)
//			singleton =  new HibernateTemplate(sessionFactory);
//		
//		return singleton;
//	}

	@Override
	public Session getSession() {
		return sessionFactory.openSession();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	private Type getType() {
		ParameterizedType superclass = (ParameterizedType) getClass()
				.getGenericSuperclass();
		return superclass.getActualTypeArguments()[0];
	}	
}
