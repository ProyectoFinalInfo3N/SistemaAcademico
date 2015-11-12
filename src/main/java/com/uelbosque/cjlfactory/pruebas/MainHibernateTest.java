package com.uelbosque.cjlfactory.pruebas;

import com.uelbosque.cjlfactory.DAO.ImplRolDAO;
import com.uelbosque.cjlfactory.DAO.ImplUsuarioDAO;
import com.uelbosque.cjlfactory.modelo.Rol;
import com.uelbosque.cjlfactory.modelo.Usuario;

public class MainHibernateTest {

	public static void main(String[] args) throws Exception {

		ImplUsuarioDAO generic =  new ImplUsuarioDAO();
		ImplRolDAO genRol = new ImplRolDAO();
		Usuario usuarioRecuperado =  generic.getById(1);
		if(usuarioRecuperado != null)
			System.out.println(usuarioRecuperado.getNombresUsuario());
		Rol rol = genRol.getById(002);
		usuarioRecuperado = new Usuario();
		usuarioRecuperado.setIdUsuario(2);
		usuarioRecuperado.setNombresUsuario("Prueba Nombre con JPA 3:53 de la mañana");
		usuarioRecuperado.setApellidosUsuario("Prueba Apellidos");
		usuarioRecuperado.setRol(rol);
		generic.create(usuarioRecuperado);
		
		
				


	}

	

}
