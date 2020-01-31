package interfacesGraficas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class PrimerJframe {

	public static void main(String[] args) {
						
		List<MiJframe> ventanas = new ArrayList<MiJframe>();
				
		for (int i = 0; i < 10; i++) {
			ventanas.add(new MiJframe(Integer.toString((Integer)i+1)));
			ventanas.get(i).setVisible(true);
		}
	}
}
class MiJframe extends JFrame{
	
	public MiJframe(String algo) {
		//setSize(600, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Definir operación del boton cerrar en la ventana
		//setLocation(1900, 350);//Definir (x, y) en la pantalla de la ventana
		//setLocationRelativeTo(null);//Definir (x, y) en la pantalla de la ventana en el centro
		setBounds(coordenadasRamdom(), coordenadasRamdom(), 450, 450); //Definir posición y tamaño
		//setResizable(false); //Impide modificar el tamaño de la ventana
		//setExtendedState(NORMAL); Maximizar
		setTitle(algo);//Modificar el titulo de la ventana
		//setVisible(true); 
	}
	
	public static int coordenadasRamdom() {
		//System.out.println();
		return (int)(Math.random()*10000+1);
	}
}
