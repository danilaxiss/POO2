package _enums;

public enum MesesAno {
	
	ENE(1, "enero", "january") , FEB(2, "febrero", "february") , MAR(3, "marzo", "march"), 
	ABR(4, "abril", "april"), MAY(5, "mayo", "may"), JUN(6, "junio", "june"),
	JUL(7, "julio", "july"), AGO(8, "agosto", "august"), SEP(9, "septiembre", "september"),
	OCT(10, "octubre", "october"), NOV(11, "noviembre", "november"), DIC(22, "diciembre", "dicember");
	
	private int meses;
	private String nombreES;
	private String nombreEN;
	
	private MesesAno(int meses, String nombreES, String nombreEN) {
		this.meses = meses;
		this.nombreES = nombreES;
		this.nombreEN = nombreEN;
	}

	public int getMeses() {
		return meses;
	}

	public String getNombreES() {
		return nombreES;
	}

	public String getNombreEN() {
		return nombreEN;
	}
	
	
	public String presentacion() {
		return String.format("El mes %d del año es el %s (%s)", meses, nombreES, nombreEN);
		
	}
	
	

}
