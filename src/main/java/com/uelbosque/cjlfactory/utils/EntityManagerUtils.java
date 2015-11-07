package com.uelbosque.cjlfactory.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtils {
	
	private static final EntityManagerFactory EMF;
	static{
		try{
			EMF = Persistence.createEntityManagerFactory("SistemaAcademico");
		}catch(Throwable e ){
			throw new ExceptionInInitializerError(e);
		}
	}
	public static EntityManager getEntityManager() {
		return EMF.createEntityManager();
	}
}
