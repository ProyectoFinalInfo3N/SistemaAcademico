package com.uelbosque.cjlfactory.test;


import com.uelbosque.cjlfactory.DAO.ImplEstudianteDAO;
import com.uelbosque.cjlfactory.model.Estudiante;


public class MainHibernateTest {

	public static void main(String[] args) throws Exception {

		ImplEstudianteDAO generic =  new ImplEstudianteDAO();
		Estudiante estudianteRecuperado =  generic.getById(1018433394);
		if(estudianteRecuperado != null)
			System.out.println(estudianteRecuperado.getNombres());
		
		estudianteRecuperado = new Estudiante();
		estudianteRecuperado.setNombres("Prueba Nombre con JPA");
		estudianteRecuperado.setApellidos("Prueba Apellidos");
		generic.create(estudianteRecuperado);
		
		
				


	}

	

}
