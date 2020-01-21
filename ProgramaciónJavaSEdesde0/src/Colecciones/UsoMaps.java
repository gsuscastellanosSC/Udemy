package Colecciones;

import java.util.HashMap;
import java.util.Map;

public class UsoMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Empleado> listaEmpleados = new HashMap<String, Empleado>();
		
		listaEmpleados.put("100", new Empleado("Juan"));
		listaEmpleados.put("101", new Empleado("Jesus"));
		listaEmpleados.put("102", new Empleado("Pedro"));
		listaEmpleados.put("103", new Empleado("Pablo"));
		listaEmpleados.put("104", new Empleado("Luis"));
		
		System.out.println(listaEmpleados);
		
		for (Map.Entry<String, Empleado> pesonaEmpleado : listaEmpleados.entrySet()) {
			String clave = pesonaEmpleado.getKey();
			Empleado valor = pesonaEmpleado.getValue();
			System.out.println("Clave: " + clave + " Nombre: " + valor.getNombre() + " Salario " + valor.getSalario());
		}
	}

}
class Empleado {
	private String nombre;
	private double salario;
	public Empleado(String nombre) {
		this.nombre = nombre;
		salario = 2000;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
