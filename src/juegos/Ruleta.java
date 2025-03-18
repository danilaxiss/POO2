package juegos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ruleta {
	public static void main(String[] args) {
		
		Random random = new Random();
		int numeroAleatorio = random.nextInt(0,37);
		int apuesta;
		

		
		ArrayList<Integer> al = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		boolean acertado = false;
		
		while(!acertado) {
			System.out.println("Introduce tu intento: ");
			apuesta = scanner.nextInt();
			System.out.printf("Introducido: %d%n", apuesta);
			
			if(apuesta < numeroAleatorio) {
				System.out.println("Numero incorrecto. Apuesta perdida.");
				System.out.println("El numero ganador era: " + numeroAleatorio);
				System.out.println("Intentalo de nuevo.");
				break;
			}else if(apuesta > numeroAleatorio) {
				System.out.println("Numero incorrecto. Apuesta perdida.");
				System.out.println("El numero ganador era: " + numeroAleatorio);
				System.out.println("Intentalo de nuevo.");
				break;
			}else {
				System.out.println("Apuesta ganada!! Felicidades!!");
		break;	
			}
			

		}
		
	}

}
