package _collections;

import java.util.Map.Entry;
import java.util.Random;

public enum Color {
	
	RO("rojo"),NA("naraja"),AM("amarillo"),VE("verde"),
	AZ("azul"),IN("indigo"),VI("violeta");
	

	private String nombre;
	
	private Color( String nombre) {
		this.nombre = nombre;
	}
	

	public String getNombre() {
		return nombre;
	}
	
	
	public static Color aleatorio(){
		Random random = new Random ();
		Color[] colores = Color.values(); // Obtienes todos los colores del enum
        int indiceAleatorio = random.nextInt(colores.length); // Obtienes un índice aleatorio
        System.out.printf("%s\n", colores[indiceAleatorio].getNombre());
        return colores[indiceAleatorio];
	}
	
	public static void main(String[] args) {
		System.out.println(aleatorio());
	}


	static Entry<String, Integer>[] entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
