package br.com.financeiro.controllers;

import java.util.List;

public interface AbstractController <T> {
	
	public void save(T entity);
	public void update(T entity);
	public void saveOrUpdate(T entity);
	public void delete(T entity);
	public T find(long id);
	public List<T> findAll();	

}
