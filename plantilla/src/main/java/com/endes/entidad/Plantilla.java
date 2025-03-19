package com.endes.entidad;

import java.util.ArrayList;
import java.util.List;

public class Plantilla {

	
	private static List<Empleado> empleados;
	
	public Plantilla() {
		empleados = new ArrayList<Empleado>();
	}
	
	public static void contratarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public List<Empleado> getEmpleadoPorNombre(String filtroNombre){
		return empleados.stream().filter(e -> e.getNombre().contains(filtroNombre) || e.getApellidos().contains(filtroNombre)).toList();
	}
}
