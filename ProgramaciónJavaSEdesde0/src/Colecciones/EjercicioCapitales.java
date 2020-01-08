package Colecciones;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EjercicioCapitales {
	public static void main(String[] args) {
		List<String> paisesCapitales = new LinkedList<String>();
		List<String> paises = new LinkedList<String>();
		paises.add("España");
		paises.add("Colombia");
		paises.add("México");
		paises.add("Perú");
		
		System.out.println(paises);
		
		System.out.println("\n");
		List<String> capitales = new LinkedList<String>();
		capitales.add("Madrid"); //0
		capitales.add("Bogotá");//1
		capitales.add("D.F");//2
		capitales.add("Lima");//3
		
		System.out.println(capitales);
		
		Iterator<String> itPaises = paises.listIterator();
		Iterator<String> itCapitales = capitales.listIterator();
		
				
		while (itPaises.hasNext()) {
			paisesCapitales.add(itPaises.next());
			paisesCapitales.add(itCapitales.next());
			
		}
		
		paises= paisesCapitales;
		System.out.println(paisesCapitales + "Aqui" +paises);
		
		itCapitales = capitales.listIterator(); //Reiniciar Iterador
		
		while(itCapitales.hasNext()) {
			itCapitales.next();
			if(itCapitales.hasNext()) {
				itCapitales.next();
				itCapitales.remove();
			}
		}
		System.out.println(capitales);
	
		
	}
}
