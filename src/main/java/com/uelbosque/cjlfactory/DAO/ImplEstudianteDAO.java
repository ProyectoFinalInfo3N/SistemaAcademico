package com.uelbosque.cjlfactory.DAO;

import com.uelbosque.cjlfactory.model.Estudiante;

public class ImplEstudianteDAO extends ImplGenericDao<Estudiante, Integer> {

	@Override
	protected Class<Estudiante> getEntityClass() {
		// TODO Auto-generated method stub
		return Estudiante.class;
	}

}
