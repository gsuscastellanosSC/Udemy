package Colecciones;

public class UsoLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro("Java SE", "Juan", 10);
		Libro libro2 = new Libro("Java SE", "Juan", 10);
		libro1 = libro2;
		System.out.println(libro1.hashCode());
		System.out.println(libro1.equals(libro2));
		System.out.println(libro2.hashCode());
	}
	
	
	
	
}
