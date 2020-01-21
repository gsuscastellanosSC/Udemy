package es.pildorasInformaticas.pooAbstractas;

import java.util.Date;

public class Uso_Personas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personas alum1 = new Alumnos("María", "Dibujo", "Aula 5");
		
		Personas emp1 = new Empleados("Jesus", 2500 ,new Date(5465454));
		
		System.out.println(emp1.getNombre());
		
		System.out.println(emp1.getDescripcion());
		
	}

}
