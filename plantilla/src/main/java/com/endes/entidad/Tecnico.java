package com.endes.entidad;

public class Tecnico extends Empleado {
	private int categoria;

	public Tecnico(String dni, String nombre, String apellidos, Double sueldoBase, int categoria) {
		super(dni, nombre, apellidos, sueldoBase);
		this.categoria = categoria;
	}

	@Override
	public Double getSueldo() {
		return getSueldoBase() + categoria * 100;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}


}