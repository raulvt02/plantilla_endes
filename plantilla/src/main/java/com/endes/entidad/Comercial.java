package com.endes.entidad;

public class Comercial extends Empleado {
	
	private double ventas;
	
	
	public Comercial(String dni, String nombre, String apellidos, Double sueldoBase) {
		super(dni, nombre, apellidos, sueldoBase);
		
	}
	
	public double getVentas() {
		return ventas;
	}


	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	@Override
	public Double getSueldo() {
		return getSueldoBase() + (10/100 * ventas);
	}

}
