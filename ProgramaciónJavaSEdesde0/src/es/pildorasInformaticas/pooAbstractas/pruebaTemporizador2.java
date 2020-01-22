package es.pildorasInformaticas.pooAbstractas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.tools.Tool;
import java.awt.Toolkit;


public class pruebaTemporizador2 {

	public pruebaTemporizador2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reloj miReloj = new Reloj(3000, true);
		miReloj.ejecutarTemporizador();
		JOptionPane.showMessageDialog(null, "Pulsame");
	}
}

class Reloj {
	private int intervalo;
	private boolean sonido;
	public Reloj(int intervalo, boolean sonido) {
		
		this.intervalo = intervalo;
		
		this.sonido = sonido;
	}
	public void ejecutarTemporizador() {
		class DameLaHora implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Date ahora = new Date();
				System.out.println(ahora);
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
			
		}
		 ActionListener oyente = new DameLaHora();
		 Timer miTemporizador = new Timer(intervalo, oyente);
		 miTemporizador.start();
	 }
}
