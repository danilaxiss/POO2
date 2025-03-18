package _enums;

public enum FinDe {
	
	VI(5, "viernes", "friday"), SA(6, "sabado", "saturday"), DO(7, "domingo", "sunday");  //literales

	private int numeroDia;
	private String nombreES;
	private String nombreEN;


	private FinDe(int numeroDia, String nombreES, String nombreEN) {
		this.numeroDia = numeroDia;
		this.nombreES = nombreES;
		this.nombreEN = nombreEN;
	}
	
	public int getNumeroDia() {
		return numeroDia;
	}

	public String getNombreES() {
		return nombreES;
	}

	public String getNombreEN() {
		return nombreEN;
	}

	public String presentacion() {
		return String.format("El dia %d del fin de semana es el %s (%s)", numeroDia, nombreES, nombreEN);
	}
	
	
}
