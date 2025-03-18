package _collections;

public class Test2 {

	public static void main(String[] args) {
		Coche c1 = new Coche(Marca.FE, Color.RO);
		Coche c2 = new Coche(Marca.FE, Color.RO);
		Coche c3 = new Coche(Marca.FE, Color.RO);
		Parking p1 = new Parking("Lagoh", 10);
		Parking p2 = new Parking("Dia", 15);
		Parking p3 = new Parking("Mas", 20);
		Parking p4 = new Parking("MC Donalds", 20);
		Parking p5 = new Parking("Burger King", 5);

		System.out.println("Parking 1");
		p1.entraCoche(c1);
		p1.entraCoche(c2);
		p1.entraCoche(c3);

		p1.todosMetodos();

		p1.saleCoche(c2);
		p1.todosMetodos();
		p1.saleCoche(c2);
		p1.todosMetodos();
		p1.vaciarParking();
		p1.todosMetodos();

		System.out.println("------------------------");
		for (int i = 0; i < 3; i++) {
			System.out.println();
		}
		System.out.println("Parking 2");
		p2.entraCoche(c1);
		p2.entraCoche(c2);
		p2.entraCoche(c3);

		p2.todosMetodos();

		for (int i = 0; i < 4; i++) {
			p2.saleCocheAleatorio();
		}

		p2.todosMetodos();

		System.out.println("------------------------");
		for (int i = 0; i < 3; i++) {
			System.out.println();
		}
		System.out.println("Parking 3");
		p3.entraCoche(c1);
		p3.entraCoche(c2);
		p3.entraCoche(c3);
		p3.todosMetodos();
		Coche cocheAleatorio = p3.saleCocheAleatorio();
		p3.todosMetodos();
		p3.entraCoche(cocheAleatorio);
		p3.todosMetodos();

		System.out.println("------------------------");
		for (int i = 0; i < 3; i++) {
			System.out.println();
		}
		System.out.println("Parking 4");
		p4.vaciarParking();
		p4.saleCocheAleatorio();
		p4.saleCoche(c1);
		p4.todosMetodos();

		System.out.println("------------------------");
		for (int i = 0; i < 3; i++) {
			System.out.println();
		}
		System.out.println("Parking 5");
		for (int i = 0; i < 6; i++) {
			p5.entraCoche(new Coche(Marca.FO, Color.IN));
		}
		p5.todosMetodos();
	
	}
}
