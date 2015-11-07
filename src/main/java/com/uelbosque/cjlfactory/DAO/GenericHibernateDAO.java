package com.uelbosque.cjlfactory.DAO;

import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.uelbosque.cjlfactory.utils.HibernateUtils;

public class GenericHibernateDAO<T, ID extends Serializable> implements IGenericDAO<T, ID> {

	private Session session;
	private Transaction tx;
	private Class<T> clazz;

	public GenericHibernateDAO(Class<T> clazz) {
		this.clazz = clazz;
	}

	private void startOperation() throws HibernateException {

		session = HibernateUtils.getSessionFactory().getCurrentSession();
		tx = session.beginTransaction();
	}
	private void closeSession()	{
		if(session.isOpen())
			session.close();
	}

	public void create(T t) throws Exception {

		try {

			startOperation();
			session.save(t);
			tx.commit();

		} catch(Exception e) {
			closeSession();
			e.printStackTrace();
		}

	}

	@Override
	public T getById(ID id) throws Exception {
		T entity = null;
		try {
			startOperation();
			entity = (T) session.get(getEntityClass(), id);
			tx.commit();

		} catch (Exception e) {
			closeSession();
			e.printStackTrace();
		}
		return entity;

	}

	@Override
	public void update(T t) throws Exception {

		try {
			startOperation();
			session.update(t);
			tx.commit();

		} catch(Exception e) {
			closeSession();
			e.printStackTrace();
		}

	}

	@Override
	public void delete(ID id) throws Exception {

		try {
			startOperation();
			T entity = (T) session.get(getEntityClass(), id); 
			session.delete(entity);
			tx.commit();

		} catch (Exception e){
			closeSession();
			e.printStackTrace();
		}

	}

	@Override
	public void createOrUpdate(T t) throws Exception {

		try {
			startOperation();
			session.saveOrUpdate(t);
			tx.commit();

		}  catch (Exception e){
			closeSession();
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll() throws Exception {

		List<T> objects = null;
		try {
			startOperation();
			Query query = session.createQuery("from " + getEntityClass().getName());
			objects = query.list();
			tx.commit();

		}  catch (Exception e){
			closeSession();
			e.printStackTrace();
		}
		return objects;
	}

	@Override
	public List<T> getListBySentence(String sentence, Dictionary<String, Object> params) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	private Class<T> getEntityClass() {
		return this.clazz;
	}

}
