package com.uelbosque.cjlfactory.utilidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilidadesEntityManager {
	
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
