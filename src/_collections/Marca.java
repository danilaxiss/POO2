package _collections;

import java.util.Random;

public enum Marca {
	
	PE("peugeot"),FO("ford"),FE("ferrari"),BU("bugatti"),
	OP("opel");
	
	private String nombre;
	
	private Marca(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public static Marca aleatorio (){
		Random random = new Random ();
		Marca[] marcas = Marca.values(); // Obtienes todos los colores del enum
        int indiceAleatorio = random.nextInt(marcas.length); // Obtienes un índice aleatorio
        System.out.printf("%s\n", marcas[indiceAleatorio].getNombre());
        return marcas[indiceAleatorio];
	}
	
	public static void main(String[] args) {
		System.out.println(aleatorio());
	}

}
