package com.uelbosque.cjlfactory.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-01T18:21:00.547-0500")
@StaticMetamodel(Estudiante.class)
public class Estudiante_ {
	public static volatile SingularAttribute<Estudiante, Integer> id;
	public static volatile SingularAttribute<Estudiante, String> nombres;
	public static volatile SingularAttribute<Estudiante, String> apellidos;
	public static volatile SingularAttribute<Estudiante, Date> fechaNacimiento;
	public static volatile SingularAttribute<Estudiante, String> lugarNacimiento;
	public static volatile SingularAttribute<Estudiante, String> telefono;
	public static volatile SingularAttribute<Estudiante, String> direccion;
	public static volatile SingularAttribute<Estudiante, String> correoElectonico;
}
