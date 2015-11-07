package com.uelbosque.cjlfactory.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-07T03:24:30.299-0500")
@StaticMetamodel(Estudiante.class)
public class Estudiante_ {
	public static volatile SingularAttribute<Estudiante, Integer> idEstudiante;
	public static volatile SingularAttribute<Estudiante, Carrera> carrera;
	public static volatile SingularAttribute<Estudiante, String> nombresEstudiante;
	public static volatile SingularAttribute<Estudiante, String> apellidosEstudiante;
	public static volatile SingularAttribute<Estudiante, String> direccionEstudiante;
	public static volatile SingularAttribute<Estudiante, String> correoEstudiante;
	public static volatile SingularAttribute<Estudiante, Date> fechaNacEstudiante;
	public static volatile SingularAttribute<Estudiante, String> lugarNacEstudiante;
	public static volatile SingularAttribute<Estudiante, String> telefonoEstudiante;
	public static volatile SingularAttribute<Estudiante, Integer> edadEstudiante;
	public static volatile SingularAttribute<Estudiante, String> identificacionEstudiante;
	public static volatile SingularAttribute<Estudiante, Integer> idestudiante;
	public static volatile SingularAttribute<Estudiante, String> nombre;
	public static volatile SingularAttribute<Estudiante, String> apellidos;
	public static volatile SingularAttribute<Estudiante, Date> fechanacimiento;
	public static volatile SingularAttribute<Estudiante, String> lugarnacimiento;
	public static volatile SingularAttribute<Estudiante, String> telefono;
	public static volatile SingularAttribute<Estudiante, String> direccion;
	public static volatile SingularAttribute<Estudiante, String> correoelectronico;
	public static volatile SetAttribute<Estudiante, EstudianteMateria> estudianteMaterias;
	public static volatile SetAttribute<Estudiante, EstudianteMateria> estudianteMaterias_1;
}
