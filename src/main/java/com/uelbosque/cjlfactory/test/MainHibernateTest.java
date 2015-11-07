package com.uelbosque.cjlfactory.test;

import com.uelbosque.cjlfactory.DAO.ImplEstudianteDAO;
import com.uelbosque.cjlfactory.model.Estudiante;

public class MainHibernateTest {

	public static void main(String[] args) throws Exception {

		ImplEstudianteDAO generic =  new ImplEstudianteDAO();
		Estudiante estudianteRecuperado =  generic.getById(1);
		if(estudianteRecuperado != null)
			System.out.println(estudianteRecuperado.getNombre());
		
		estudianteRecuperado = new Estudiante();
		estudianteRecuperado.setNombre("Prueba Nombre con JPA 3:53 de la mañana");
		estudianteRecuperado.setApellidos("Prueba Apellidos");
		generic.create(estudianteRecuperado);
		
		
				


	}

	

}
