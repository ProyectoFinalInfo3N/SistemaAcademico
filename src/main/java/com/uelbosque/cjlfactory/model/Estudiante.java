package com.uelbosque.cjlfactory.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="estudiante")
public class Estudiante {
	@Id
	@GeneratedValue
	@Column(name="idestudiante")
	private int id;
	@Column(name="nombre")
	private String nombres;
	private String apellidos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreoElectonico() {
		return correoElectonico;
	}

	public void setCorreoElectonico(String correoElectonico) {
		this.correoElectonico = correoElectonico;
	}

	private Date fechaNacimiento;
	private String lugarNacimiento;
	private String telefono;
	private String direccion;
	@Column(name="correoelectronico")
	private String correoElectonico;

	public Estudiante() {
		// TODO Auto-generated constructor stub
	}

}
