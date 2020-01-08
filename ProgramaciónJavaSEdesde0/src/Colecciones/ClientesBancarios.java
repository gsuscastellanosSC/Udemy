package Colecciones;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;;

public class ClientesBancarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente("Antonio López", "0001", 20000);
		Cliente cliente2 = new Cliente("Rafael Gómez", "0002", 15000);
		Cliente cliente3 = new Cliente("Ana Martín", "0003", 200000);
		Cliente cliente4 = new Cliente("Juan Díaz", "0004", 20);
		Cliente cliente5 = new Cliente("Antonio López", "0001", 20000);
		Set<Cliente> clientesDelBanco = new HashSet<Cliente>();
		
		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);
		clientesDelBanco.add(cliente4);
		clientesDelBanco.add(cliente5);
		
		/*for (Cliente cliente : clientesDelBanco) {
			if (cliente.getNombre().equals("Ana Martín")) clientesDelBanco.remove(cliente);
		}
		
	*/
		System.out.println(clientesDelBanco.size());
		/*Iterator<Cliente> it = clientesDelBanco.iterator();
		while(it.hasNext()) {
			String nombreCLiente = it.next().getNombre();
			System.out.println(nombreCLiente); 
		} */
		Iterator<Cliente> it = clientesDelBanco.iterator();
		while(it.hasNext()) {
			String nombreCLiente = it.next().getNombre();
			if(nombreCLiente.equals("Ana Martín")) it.remove();
			System.out.println(nombreCLiente); 
		}
		
		for (Cliente cliente : clientesDelBanco) {
			System.out.println("Nombre: "+ cliente.getNombre() + " Cuenta: "+cliente.getnCuenta() + "Saldo: "+cliente.getSaldo());
		} 
	}

}
