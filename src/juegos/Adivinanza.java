package juegos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
	public static void main(String[] args) {
		
		// lanzamos un numero al azar del 1 al 100
		Random random = new Random();
		int numeroAleatorio = random.nextInt(1,101);
		int intento;
		
		//bienvenida
		System.out.println("Bienvenido a adivinar el numero!!");
		System.out.println("Tienes que adivinar un numero del 1 al 100");
		
		System.out.println();
		
		//arraylist
		ArrayList<Integer> historial = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean acertado = false;
		
		while (!acertado) {
			System.out.print("Introduce tu intento: ");
			intento = scanner.nextInt();
			System.out.printf("Introducido: %d%n", intento);
				
			historial.add(intento);
			
			//para saber cuando a adivinado el numero, es mayor o menor
		if (intento < numeroAleatorio) {
			System.out.println("El numero es mayor");
		} else if (intento > numeroAleatorio) {
			System.out.println("El numero es menor.");
		} else {
			System.out.println("¡Felicidades! Has ganado");
			break;
		}
		
		System.out.println("Historial de intentos: " + historial);
		
		}
		System.out.println("Historial de intentos final: " + historial);
		System.out.println("Intentos final: " + historial.size());
        System.out.println("Juega de nuevo!!");
	}

}
