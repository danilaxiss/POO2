package _collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Parking {

	private String nombre;
	private int totalPlazas;
	private Coche cocheEliminado; // METDODO SACAR COCHE ALEATORIO
	ArrayList<Coche> listaCoches = new ArrayList<>();
	HashMap<Color, Integer> CocheColor = new HashMap<>();
	HashMap<Marca, Integer> CocheMarca = new HashMap<>();
	HashMap<Coche, Integer> CochesIguales = new HashMap<>();
	HashSet<Coche> setCoches = new HashSet<>();

	public Parking(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;
		this.CocheColor = new HashMap<>();
		this.CocheMarca = new HashMap<>();
		this.CochesIguales = new HashMap<>();
		this.setCoches = new HashSet<>();
	}

	public boolean entraCoche(Coche c) {
		Color color = c.getColor();
		Marca marca = c.getMarca();

		if (listaCoches.size() >= totalPlazas) {
			System.out.println("El coche no tiene espacio");
			return false;
		}

		listaCoches.add(c);
		setCoches.add(c);
		CocheColor.put(color, CocheColor.getOrDefault(color, 0) + 1);
		CocheMarca.put(marca, CocheMarca.getOrDefault(marca, 0) + 1);
		System.out.println("Entra coche");
		CochesIguales.put(c, CochesIguales.getOrDefault(c, 0) + 1);

		return true;
	}

	public boolean saleCoche(Coche coche) {

		boolean cocheDentro = false;
		for (int i = 0; i < listaCoches.size(); i++) {
			if (listaCoches.get(i) == coche) {
				listaCoches.remove(i);
				cocheDentro = true;
				System.out.println("Sale un coche");
				break;
			}
		}

		if (!cocheDentro) {
			System.out.println("No puede salir el coche");
			return false;
		}

		ColorCont(coche);
		MarcaCont(coche);
		CochesIguales(coche);

		return true;
	}

	private void CochesIguales(Coche coche) {
		int cont = CochesIguales.getOrDefault(coche, 0);

		if (cont == 1) {
			CochesIguales.remove(coche);
		} else {
			CochesIguales.put(coche, cont - 1);
		}
	}

	private void ColorCont(Coche coche) {
		int cont = CocheColor.getOrDefault(coche.getColor(), 0);
		if (cont > 0) {
			CocheColor.put(coche.getColor(), cont - 1);
		}
	}

	private void MarcaCont(Coche coche) {
		int cont = CocheMarca.getOrDefault(coche.getMarca(), 0);
		if (cont > 0) {
			CocheMarca.put(coche.getMarca(), cont - 1);
		}
	}

	public Coche saleCocheAleatorio() {
		if (listaCoches.isEmpty()) {
			System.out.println("No puede salir ningún coche");
			return null;
		}

		Random random = new Random();
		int index = random.nextInt(listaCoches.size());
		cocheEliminado = listaCoches.get(index);

		listaCoches.remove(index);
		CocheColor.put(cocheEliminado.getColor(), CocheColor.getOrDefault(cocheEliminado.getColor(), 0) - 1);
		CocheMarca.put(cocheEliminado.getMarca(),
				CocheMarca.getOrDefault(cocheEliminado.getMarca(), 0) - 1);
		CochesIguales.put(cocheEliminado, CochesIguales.getOrDefault(cocheEliminado, 0) - 1);

		System.out.println("Ha salido un coche");
		return cocheEliminado;
	}

	public boolean vaciarParking() {
		System.out.println("EL PARKING " + nombre + " VA A VACIARSE");
		if (listaCoches.isEmpty()) {
			System.out.println("La lista esta vacia");
			setCoches.clear();
			return false;
		}
		while (!listaCoches.isEmpty()) {
			saleCocheAleatorio();
		}
		System.out.println("La lista se ha vaciado");
		return true;
	}

	public void reportParking() {
		int plazasOcupadas = listaCoches.size();
		System.out.println("LISTADO COCHES");
		System.out.println("--------------");
		System.out.println("Parking: " + nombre);

		for (Coche coche : listaCoches) {
			System.out.println("Coche: " + coche);
		}
		System.out
				.println("Total coches: " + listaCoches.size() + ", plazas libres: " + (totalPlazas - plazasOcupadas));
	}

	public void reportColores() {
		System.out.println("PORT DE COLORES");
		System.out.println("-------------------");

		if (CocheColor.isEmpty()) {
			System.out.println("No hay coches en el parking.");
		} else {
			for (Color color : CocheColor.keySet()) {
				int cantidad = CocheColor.get(color);
				if (cantidad > 0) {
					String veces = (cantidad == 1) ? "vez" : "veces";
					System.out.println("El coche de color " + color + " se repite " + cantidad + " " + veces);
				}
			}
		}
		System.out.println("Total coches: " + listaCoches.size());
	}

	public void reportMarca() {
		System.out.println("PORT DE MARCAS");
		System.out.println("-----------------");

		if (CocheMarca.isEmpty()) {
			System.out.println("No hay ningún coche en el parking.");
		} else {
			for (Map.Entry<Marca, Integer> entry : CocheMarca.entrySet()) {
				int cantidad = entry.getValue();
				if (cantidad > 0) {
					String veces = (cantidad == 1) ? "vez" : "veces";
					System.out.println(
							"El coche de marca " + entry.getKey().getNombre() + " se repite " + cantidad + " " + veces);
				}
			}
		}
		System.out.println("Total coches: " + listaCoches.size());
	}

	public void reportCochesIguales() {
		System.out.println("REPORT DE COCHES IGUALES");
		System.out.println("-------------------------");
		System.out.println("Parking: " + nombre);
		if (listaCoches.size() > 1) {
			for (Coche coche : CochesIguales.keySet()) {
				int veces = CochesIguales.get(coche);
				String cantidad = (veces == 1) ? "vez" : "veces";
				System.out.println("Coche: " + coche + " se repite " + veces + " " + cantidad + ".");
			}
		} else {
			System.out.println("No hay ningun coche igual a otro");
		}
	}

	public void reportSetCoches() {
		System.out.println("REPORT DE SET COCHES");
		System.out.println("---------------------");
		System.out.println("Parking: " + nombre);
		if (listaCoches.size() >= 1) {
			for (Coche coche : setCoches) {
				System.out.println("Coche: " + coche);
			}
			System.out.println("Total de items: " + setCoches.size());
		} else {
			System.out.println("No hay ningun coche");
		}
	}

	public void todosMetodos() {
		reportParking();
		reportMarca();
		reportColores();
		reportCochesIguales();
		reportSetCoches();

		System.out.println();
		System.out.println();
	}
}

	
