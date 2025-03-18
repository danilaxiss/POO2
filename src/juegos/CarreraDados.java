package juegos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CarreraDados {
	
	
	public static void main(String[] args) {
		Random random = new Random();
		
		System.out.println("Bienvenido a carrera de dados!!");
		System.out.println("Pon la palabra lanzar para empezar!!");
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		

		String linea = "--------------------";
		boolean partida = false;
		
		while(!partida) {
		    System.out.println("Empieza: ");
		    String palabra = scanner.next().toLowerCase();
			int numeroAleatorio = random.nextInt(1,7);		    
		    
		    if (palabra.equals("salir")) {
				System.out.println("Gracias por jugar: ¡Hasta pronto!");
				break;
			}
			if (!palabra.equals("lanzar")) {
				System.out.println("Entrada no valida:intentalo de nuevo.");
				continue;
			}
			
			System.out.println("Jugador 1");
		    System.out.printf("Numero sacado : %d, avanzas %d casillas.%n", numeroAleatorio, numeroAleatorio);
		    
		    char[] arr = linea.toCharArray();
		   		    	
		   for (int i = 0; i < numeroAleatorio; i++) {
	            if (i < arr.length) {
	                arr[i] = 'x';
	            }
	        }
		    
		   String nuevaLinea = new String(arr);
		    	
		    System.out.println(nuevaLinea);
		    
		    continue;
		}
	}

}
