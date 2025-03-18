package colecctionsymaps;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
       String cuento = CuentaCuentos.cuentoZorro();
		 
       String[] palabras = CuentaCuentos.devuelvePalabras(cuento);
       
       CuentaCuentos.arrayPalabras(palabras);
       System.out.println();
       CuentaCuentos.arrayListPalabras(palabras);
       System.out.println();
       CuentaCuentos.hashSetPalabras(palabras); 
       System.out.println();
       CuentaCuentos.treeSetPalabras(palabras);
       System.out.println();
       CuentaCuentos.mapConteoPalabras(palabras);
	        }
	}

