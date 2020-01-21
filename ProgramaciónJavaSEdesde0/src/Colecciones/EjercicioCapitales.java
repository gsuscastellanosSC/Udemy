package Colecciones;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjercicioCapitales {
	public static void main(String[] args) {
		List<String> paisesCapitales = new LinkedList<String>();
		List<String> paises = new LinkedList<String>();
		paises.add("España");
		paises.add("Colombia");
		paises.add("México");
		paises.add("Perú");
		
		//System.out.println(paises);
		
		//System.out.println("\n");
		List<String> capitales = new LinkedList<String>();
		capitales.add("Madrid"); //0
		capitales.add("Bogotá");//1
		capitales.add("D.F");//2
		capitales.add("Lima");//3
		
		//System.out.println(capitales);
		iterateLinkListForInsertElement(paises, capitales);
		
		deleteElementsEvens(capitales);
		
		
	
		
	}
	
	public static void iterateLinkListForInsertElement(List<String> linkedList0, List<String> linkedList1) {
		ListIterator<String> iterator0 = linkedList0.listIterator();
		ListIterator<String> iterator1 = linkedList1.listIterator();
		
		while (iterator1.hasNext()) {
			if(iterator0.hasNext()) {
				iterator0.next();
			}
			iterator0.add(iterator1.next());
		}
		System.out.println(linkedList0);
	}
	
	public static void deleteElementsEvens(List<String> linkedList) {
		ListIterator<String> iterator = linkedList.listIterator();
		
		while(iterator.hasNext()) {
			iterator.next();
			if(iterator.hasNext()) {
				iterator.next();
				iterator.remove();
			}
		}
		System.out.println(linkedList);
	}
}
