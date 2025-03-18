package juegos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AdivinaPalabra {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		Random random = new Random();

		al.add("Senri");
		al.add("Notyet");
		al.add("Perro");
		al.add("Gato");

		Scanner scanner = new Scanner(System.in);
		int palabraAleatoria = random.nextInt(al.size());
		String palabraSeleccionada = al.get(palabraAleatoria);
		System.out.println(palabraSeleccionada);

		for (int i = 0; i < palabraSeleccionada.length(); i++) {
			System.out.print("_ ");
		}

		System.out.println();

		String letra;
		String letraPalabra;

		letraPalabra = palabraSeleccionada;
		boolean acertado = false;

		while (!acertado) {
			System.out.print("Introduce tu intento: ");
			letra = scanner.next();
			System.out.printf("Introducido: %s%n", letra);

			if (letra.equals(letraPalabra)) {
				System.out.printf("Has acertado la letra: %s", letra);
				System.out.println();
				for (int i = 0; i < palabraSeleccionada.length(); i++) {
					System.out.printf("_ ");
				}
				System.out.println();
			} else if (!letra.equals(letraPalabra)) {
				System.out.printf("Has fallado la letra: %s", letra);
				System.out.println();
				for (int i = 0; i < palabraSeleccionada.length(); i++) {
					System.out.printf("_ ");
					
				}
				System.out.println();
			}

		}
	}

}
