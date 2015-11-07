package com.uelbosque.cjlfactory.DAO;

import java.io.Serializable;

public class DAOFactory {

	public <T> IGenericDAO<T, Serializable> getDAO(Class<T> clazz) {
		/*
		 * en esta clase se debe agregar el archivo de configuracion del dao que
		 * se desea seleccionar de esta manera solo falta agregar la clase dao
		 * para que se implemente y se herede para cada una de las entidades.
		 */
		int a = 1;
		if (a == 1) {
			return new GenericEntityManagerDAO<>(clazz);
		}
		if(a == 2){
			return new GenericHibernateDAO<>(clazz);
		}
		return null;
	}

}
