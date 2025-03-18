package _enums;

public class Fieston {
	
	private String lugar;
	private FinDe dia;
	private MesesAno meses;
	
	public Fieston(String lugar, FinDe dia, MesesAno meses) {
		super();
		this.lugar = lugar;
		this.dia = dia;
		this.meses = meses;
	}
	
	
	
	@Override
	public String toString() {
		return "Fieston [lugar=" + lugar + ", dia=" + dia + ", mes=" + meses + "]";
	}
	
	public static void main(String[] args) {
		Fieston fieston = new Fieston("Core", FinDe.SA, MesesAno.ABR);
		System.out.println(fieston);
		for(FinDe f : FinDe.values()) {
			System.out.println(f);
		}
		
		
	}
	

}
