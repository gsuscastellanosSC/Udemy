package Colecciones;

public class Libro {
	private String autor;
	private String titulo;
	private int isbn;
	
	public Libro(String autor, String titulo, int isbn) {
		this.autor = autor;
		this.titulo = titulo;
		this.isbn = isbn;
	}
	
	public String getDatos() {
		return "El título es: " + titulo +". El autos es: " + autor + ". Y el ISBN es: " + isbn;
	}
	
	public boolean equals(Object obj) {
		Libro otroLibro = (Libro)obj;
		if(obj instanceof Libro) {
			if (this.isbn == otroLibro.isbn) {
				return true;
			}else {
				return false;
			}
		}else return false;
	}
}
