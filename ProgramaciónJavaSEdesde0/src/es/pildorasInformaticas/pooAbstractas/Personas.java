package es.pildorasInformaticas.pooAbstractas;

import java.util.Date;

public abstract class Personas {
	
	private String nombre;
	
	public Personas (String nom) {
		nombre = nom;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String getDescripcion();
}

class Empleados extends Personas{
	
	private double sueldo;
	private Date fecha_alta;
	
	public Empleados(String nom, double sueldo, Date fecha_alta) {
		super(nom);
		this.sueldo = sueldo;
		this.fecha_alta = fecha_alta;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "El Empleado "+ this.getNombre() +" Tiene un sueldo de $" + sueldo + " y entro a trabajar en ";
	}
	
}

class Jefes extends Empleados{
	
	private double incentivo;
	
	public Jefes(String nom, double sueldo, Date fecha_alta) {
		super(nom, sueldo, fecha_alta);
		// TODO Auto-generated constructor stub
	}
	
	public void setIncentivo(double incentivo) {
		this.incentivo =incentivo;
	}
		
}

class Alumnos extends Personas{
	
	private String a_optativas;
	private String aula;
	public Alumnos(String nom, String a_optativas, String aula) {
		super(nom);
		this.a_optativas = a_optativas;
		this.aula = aula;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "El alumno " +this.getNombre()+" esta en el aula " + aula + " y ha escogido la asignatura " + a_optativas;
	}
}
