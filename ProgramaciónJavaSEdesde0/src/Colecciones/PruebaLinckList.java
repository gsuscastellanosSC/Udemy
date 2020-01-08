package Colecciones;



import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

public class PruebaLinckList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> personas =  new LinkedList<String>();
		personas.add("Ana");
		personas.add("Antonio");
		personas.add("Sara");
		personas.add("Pedro");
		
		System.out.println(personas.size());
		
		ListIterator<String> ite = personas.listIterator();
		
		for (String persona : personas) {
			System.out.println(persona);
		}
		
		
	}

}
