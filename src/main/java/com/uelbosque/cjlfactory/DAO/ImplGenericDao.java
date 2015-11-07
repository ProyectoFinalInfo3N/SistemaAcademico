package com.uelbosque.cjlfactory.DAO;

import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


public abstract class ImplGenericDao<T, ID extends Serializable> implements IGenericDAO<T, ID> {

	private IGenericDAO<T, Serializable> generic;

	public ImplGenericDao() {
		generic =  new DAOFactory().<T>getDAO(getEntityClass());	
	}
	protected abstract Class<T> getEntityClass();
	

	@Override
	public void create(T t) throws Exception {
		generic.create(t);
	}

	@Override
	public T getById(ID id) throws Exception {
		return generic.getById(id);
	}

	@Override
	public void update(T t) throws Exception {
		generic.update(t);
	}

	@Override
	public void delete(ID id) throws Exception {
		generic.delete(id);
	}

	@Override
	public void createOrUpdate(T t) throws Exception {
		generic.createOrUpdate(t);
	}

	@Override
	public List<T> getAll() throws Exception {
		return generic.getAll();
	}

	@Override
	public List<T> getListBySentence(String sentence, Dictionary<String, Object> params) throws Exception {
		// TODO Auto-generated method stub
		return generic.getListBySentence(sentence, params);
	}

}
