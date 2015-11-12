package com.uelbosque.cjlfactory.DAO;

import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;
import javax.persistence.EntityManager;

import com.uelbosque.cjlfactory.utilidades.UtilidadesEntityManager;

public class GenericEntityManagerDAO<T, ID extends Serializable> implements IGenericDAO<T, ID> {

	public GenericEntityManagerDAO(Class<T> clazz) {
		this.clazz = clazz;
	}

	private EntityManager em = null;
	private Class<T> clazz = null;

	private void startOperation() {
		em = UtilidadesEntityManager.getEntityManager();
	}

	@Override
	public void create(T t) throws Exception {
		startOperation();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
	}

	@Override
	public T getById(ID id) throws Exception {
		startOperation();
		return (T) em.find(getEntityClass(), id);
	}

	@Override
	public void update(T t) throws Exception {
		startOperation();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
	}

	@Override
	public void delete(ID id) throws Exception {
		startOperation();
		em.getTransaction().begin();
		T entity = (T) em.find(getEntityClass(), id);
		em.remove(entity);
		em.getTransaction().commit();
	}

	@Override
	public void createOrUpdate(T t) throws Exception {
		// falta la implementacion de este metodo;

	}

	@Override
	public List<T> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> getListBySentence(String sentence, Dictionary<String, Object> params) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	private Class<T> getEntityClass() {
		return clazz;
	}

}
