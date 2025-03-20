package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase Plantilla.
 */
class PlantillaTest {
    private Plantilla plantilla;
    private Empleado tecnico1;
	private Empleado tecnico2;

    @BeforeEach
    @DisplayName("Inicialización de la plantilla de empleados")
    void setUp() throws Exception {
        plantilla = new Plantilla();
    }

    /**
     * Prueba que verifica que no se puedan contratar empleados con el mismo DNI.
     */
    
    @Disabled
    @Test
    @DisplayName("No permite contratar empleados con el mismo DNI")
    void testContratarEmpleado_Duplicado() {
        Empleado tecnico1 = new Tecnico("33333333J", "David", "Arenas", 900.0, 20);
        Empleado tecnico2 = new Tecnico("33333333J", "Carlos", "Pérez", 1200.0, 2); 

        // Se permite el primer contrato
        assertDoesNotThrow(() -> plantilla.contratarEmpleado(tecnico1));

        // Intentar contratar otro empleado con el mismo DNI debería lanzar una excepción
        Exception ex = assertThrows(IllegalArgumentException.class, () -> plantilla.contratarEmpleado(tecnico2));

        // Verificar el mensaje de la excepción
        assertEquals("El empleado con DNI 33333333J ya está contratado", ex.getMessage());
    }
}