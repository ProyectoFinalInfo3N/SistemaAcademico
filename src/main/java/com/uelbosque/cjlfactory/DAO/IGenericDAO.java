package com.uelbosque.cjlfactory.DAO;

import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;

public interface IGenericDAO<T, ID extends Serializable> {

	void create(T t) throws Exception;

	T getById(ID id) throws Exception;

	void update(T t) throws Exception;

	void delete(ID id) throws Exception;

	void createOrUpdate(T t) throws Exception;

	List<T> getAll() throws Exception;
	//TODO: verificar la implementación de este metodo que todavia no es requerida
	List<T> getListBySentence(String sentence,Dictionary<String, Object> params) throws Exception;

}
