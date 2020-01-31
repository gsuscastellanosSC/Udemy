package exepciones;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Fallos {

	public Fallos() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
		int [] arr = {5, 38, -15, 92, 71};
				
		for (int i = 0; i < arr.length; i++) {
			System.out.println("posición "+i);
		}
		try {
			imprimir();
		} catch (Exception e) {
			System.out.println("Elección invalida");
		}
		
	}
public static void imprimir() {
	String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
	int edad = 0;
	edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
	
		
	System.out.println("Hola" + nombre + " Tienes "+edad+" años "+" El programa termino su ejecución");
}
}
