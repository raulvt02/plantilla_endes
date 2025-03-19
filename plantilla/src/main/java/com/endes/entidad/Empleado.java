package com.endes.entidad;

public abstract class Empleado {
	private String dni;
	private String nombre;
	private String apellidos;
	private Double sueldoBase;
	
	public Empleado(String dni, String nombre, String apellidos, Double sueldoBase) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoBase = sueldoBase;
	}
	public Double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(Double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	
	public abstract Double getSueldo();
	
}
