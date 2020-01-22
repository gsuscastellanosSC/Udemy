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
		Reloj miReloj = new Reloj();
		miReloj.ejecutarTemporizador(3000, true);
		JOptionPane.showMessageDialog(null, "Pulsame");
	}
}

class Reloj {
	public void ejecutarTemporizador(int intervalo, boolean sonido) {
		Timer miTemporizador = new Timer(intervalo, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Date ahora = new Date();
				System.out.println(ahora);
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		});
		 miTemporizador.start();
	 }
}
