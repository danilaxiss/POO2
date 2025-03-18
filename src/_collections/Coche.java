package _collections;

import java.util.Objects;

public class Coche {
	
	private enum marca{
		PE, FO, FE, BU, OP;
	}
	private enum color{
		RO, NA, AM, VE, AZ, IN, VI;
	}
	
	private Marca marca;
	private Color color;
	

	public Coche(Marca marca, Color color) {
		super();
		this.marca = marca;
		this.color = color;
	}



	public Coche() {
		marca = Marca.aleatorio();
		color = Color.aleatorio();
	}



	public Marca getMarca() {
		return marca;
	}

	public Color getColor() {
		return color;
	}

	
	
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", color=" + color + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return color == other.color && marca == other.marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, marca);
	}


}
