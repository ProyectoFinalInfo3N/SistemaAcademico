package com.uelbosque.cjlfactory.DAO;

import com.uelbosque.cjlfactory.modelo.Usuario;

public class ImplUsuarioDAO extends ImplGenericDao<Usuario, Integer> {

	@Override
	protected Class<Usuario> getEntityClass() {
		// TODO Auto-generated method stub
		return Usuario.class;
	}

}
