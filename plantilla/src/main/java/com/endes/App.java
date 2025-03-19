package com.endes;

import com.endes.entidad.Comercial;
import com.endes.entidad.Empleado;
import com.endes.entidad.Plantilla;
import com.endes.entidad.Tecnico;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Plantilla plantilla = new Plantilla();
        
        //Técnico de categoría 1
        plantilla.contratarEmpleado(new Tecnico("11111111H", "Alejandro", "Fernández", 1000.0, 1));
    
        //Técnico de categoría 2
        plantilla.contratarEmpleado(new Tecnico("22222222J", "Jerónima", "Jiménez", 1000.0, 2));
    
        //Comercial
        Comercial comercial = new Comercial("33333333P", "Desiderio", "Durán", 800.0);
        comercial.setVentas(2000);
        
        Plantilla.contratarEmpleado(comercial);
        
        for(Empleado e: plantilla.getEmpleadoPorNombre("er")) {
        	System.out.println(e.getNombre() + " " + e.getApellidos() + ": " + e.getSueldo());
        }
    }
}
