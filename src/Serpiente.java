/* Rodrigo Valladares Santana L1 
 * Programación de Aplicaciones Interactivas Práctica 4
 * 
 * Ejercicio 2.
 * 
 * */

import java.util.*;
public class Serpiente {
	
	//Guarda el número de serpientes que se están moviendo
	private int numSerpientes;
	
	//Devuelve el número de serpientes que está reptando
	public int reptar() {
		return numSerpientes;
	}
	
	private void setNumSerpientes(int numSerpientes) {
		this.numSerpientes = numSerpientes;
	}
	
	Serpiente(int numSerpientes) {
		setNumSerpientes(numSerpientes);
	}

	public static void main(String[] args) {
		
		ArrayList serpientes = new ArrayList();
		Iterator<Serpiente> iterador;
		
		try {
			for(int i = 0; i < args.length; i++)
				serpientes.add(new Serpiente(Integer.parseInt(args[i])));
		}
		catch(NumberFormatException noNumero) { //Error porque no se ha pasado un número en los argumentos
			System.out.println("Error: un argumento no es numérico. Serpiente <n1> <n2> ... <nm> (n = entero)");
		}
		
		iterador = serpientes.iterator();
		
		while(iterador.hasNext())
			System.out.println("Reptan " + iterador.next().reptar() + " serpientes.");
	

	}

}