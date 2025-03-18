package juegos;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		String[] opciones = { "piedra", "papel", "tijera" };

		System.out.println("Bienvenido a prieda, papel o tijeras");

		while (true) {
			System.out.println("Elige piedra, papel o tijera ( o escribe 'salir' para termimar):");
			String eleccion = scanner.next().toLowerCase();

			if (eleccion.equals("salir")) {
				System.out.println("Gracias por jugar: ¡Hasta pronto!");
				break;
			}
			if (!eleccion.equals("piedra") && !eleccion.equals("papel") && !eleccion.equals("tijera")) {
				System.out.println("Entrada no valida:intentalo de nuevo.");
				continue;
			}
			
			String ordenador = opciones[random.nextInt(3)];
			System.out.println("El ordenador eligio: "+ ordenador);
			
			if(eleccion.equals(ordenador)) {
				System.out.println("Es un empate!");
			}else if((eleccion.equals("piedra")&& ordenador.equals("tijera")) ||
					(eleccion.equals("papel")&& ordenador.equals("piedra")) ||
					(eleccion.equals("tijera")&& ordenador.equals("papel"))) {
				System.out.println("Ganaste!!");
				break;
			}else {
				System.out.println("Perdistes!! Sigue intentandolo!!");
			}
		}
		scanner.close();
	}
}
