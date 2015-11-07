package com.uelbosque.cjlfactory.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-07T03:24:30.284-0500")
@StaticMetamodel(Carrera.class)
public class Carrera_ {
	public static volatile SingularAttribute<Carrera, Integer> idCarrera;
	public static volatile SingularAttribute<Carrera, String> nombreCarrera;
	public static volatile SetAttribute<Carrera, Estudiante> estudiantes;
}
