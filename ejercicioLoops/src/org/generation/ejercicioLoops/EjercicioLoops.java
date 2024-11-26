package org.generation.ejercicioLoops;

import java.util.Scanner;

public class EjercicioLoops {

	public static void main(String[] args) {
		//EJERCICIO LOOP//
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Holi, por favor ingresa tu nombre "); 
		String nombre = scanner.next();
		
		
		for (int i = 0; i < nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}
		scanner.close();
	}

}
