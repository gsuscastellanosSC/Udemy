package Colecciones;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ColeccionTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Set <String> ordenaGente = createTreeSet();
		addElementsToTreeSet("Oscar,María,Ana", ordenaGente);
		System.out.println(ordenaGente);
		showElementTreeSet(ordenaGente);*/
		
		Productos comparador = new Productos();
		Set <Productos> ordenaProductos = new TreeSet<Productos>(comparador);
		Productos pr1 = new Productos(3, "esta es la descripción del Tercer Producto");
		Productos pr2 = new Productos(7, "Septimo");
		Productos pr3 = new Productos(2, "Segundo Producto");
		ordenaProductos.add(pr1);
		ordenaProductos.add(pr2);
		ordenaProductos.add(pr3);
		
		for (Productos product : ordenaProductos) {
			System.out.println(product.getDescription());
		}
	
		
	}
	public static Set<String> createTreeSet() {
		Set<String> treeSet = new TreeSet<String>();
		return treeSet;
	}
	public static void addElementsToTreeSet(String elementsToAdd, Set<String> TreeSet) {
		String [] elements = elementsToAdd.split(",");
		for (String element : elements) {
			TreeSet.add(element);
		}
	}
	public static void showElementTreeSet(Set<String> treeSet) {
		for (String element : treeSet) {
			System.out.println(element);
		}
	}
}


class Productos implements Comparable<Productos>, Comparator<Productos>{
	private int numeroProducto;
	private String descripcion;
	
	public Productos() {
		
	}
	
	public Productos(int numeroProducto, String descripcion) {
		this.numeroProducto = numeroProducto;
		this.descripcion = descripcion;
	}
	public String getDescription() {
		return descripcion;
	}
	@Override
	public int compareTo(Productos produc) {
		// TODO Auto-generated method stub
		return numeroProducto - produc.numeroProducto;
	}
	@Override
	public int compare(Productos o1, Productos o2) {
		// TODO Auto-generated method stub
		int caracter1=o1.getDescription().length();
		int caracter2=o2.getDescription().length();
		
		if (caracter1<caracter2) {
			return -1;
		}else if(caracter1>caracter2){
			return 1;
		}else {
			return 0;
		}
	}
	
 
}


