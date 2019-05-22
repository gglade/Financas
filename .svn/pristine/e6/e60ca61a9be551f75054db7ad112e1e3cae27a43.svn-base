package br.com.financeiro.dao;

import java.util.List;

import org.hibernate.Session;

public interface AbstractDao<T> {
	
	public void save(T entity);
	public void update(T entity);
	public void saveOrUpdate(T entity);
	public void delete(T entity);
	public T find(long id);
	public List<T> findAll();	
	public Session getSession();
	public void close();
}
