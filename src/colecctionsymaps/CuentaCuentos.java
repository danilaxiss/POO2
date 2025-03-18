package colecctionsymaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class CuentaCuentos {    
      
public static String cuentoZorro(){
        StringBuilder sb = new StringBuilder();
        sb.append("El zorro y las uvas");
        sb.append("\nHabÃ­a una vez un zorro que caminaba, sediento, por el bosque. "
                + "Mientras lo hacÃ­a vio en lo alto de la rama de un Ã¡rbol un racimo "
                + "de uvas, las cuales deseÃ³ al instante al servirle para refrescarse "
                + "y apagar su sed. El zorro se acercÃ³ al Ã¡rbol e intentÃ³ alcanzar las "
                + "uvas, pero estaban demasiado altas. Tras intentarlo una y otra vez "
                + "sin conseguirlo, el zorro finalmente se rindiÃ³ y se alejÃ³. Viendo "
                + "que un pÃ¡jaro habÃ­a visto todo el proceso se dijo en voz alta que "
                + "en realidad no querÃ­a las uvas, dado aÃºn no estaban maduras, y que "
                + "en realidad habÃ­a cesado el intento de alcanzarlas al comprobarlo.");
        sb.append("\nOtra interesante historia corta en forma de fÃ¡bula que nos "
                + "enseÃ±a que a menudo nos intentamos convencer a nosotros mismos "
                + "de no querer algo e incluso llegamos a despreciar dicho algo por "
                + "el hecho de que encontramos difÃ­cil llegar a alcanzarlo.");
        return sb.toString();
    }        
    

public static String cuentoLechera(){
        StringBuilder sb = new StringBuilder();
        sb.append("El cuento de la lechera");
        sb.append("\nÃ‰rase una vez una joven lechera que llevaba un cubo de leche "
                + "en la cabeza, camino al mercado para venderla. Durante el camino, "
                + "la soÃ±adora joven iba imaginando lo que podrÃ­a lograr conseguir "
                + "con la leche. PensÃ³ que en primer lugar y con el dinero de la venta "
                + "comprarÃ­a un canasto de huevos, los cuales una vez eclosionaran le "
                + "permitirÃ­a montar una pequeÃ±a granja de pollos. Una vez estos "
                + "crecieran podr0Ã­a venderlos, lo que le darÃ­a dinero para "
                + "comprarse un lechÃ³n.");
        sb.append("\nUna vez este creciera la venta del animal bastarÃ­a para comprarse "
                + "una ternera, con la leche de la cual seguirÃ­a obteniendo beneficios "
                + "y a su vez podrÃ­a tener terneros. Sin embargo, mientras iba pensando "
                + "todas estas cosas la joven tropezÃ³, lo que provocÃ³ que el cÃ¡ntaro "
                + "cayera el suelo y se rompiera. Y con Ã©l, sus expectativas hacia lo "
                + "que podrÃ­a haber hecho con ella.");  
        return sb.toString();
    } 

public static String[] devuelvePalabras(String texto) {
    texto = texto.replaceAll("[.,\n]", "");

    String[] palabras = texto.split(" ");

    return palabras;
}

public static void arrayPalabras(String[] palabras1) {
	System.out.println("Array de palabras");
	System.out.println();
	System.out.println("=================");
	System.out.println();
	for(String palabra : palabras1) {
		System.out.print("[" + palabra + "]");
	}
	System.out.println();
	System.out.println("\nLista original tiene " + palabras1.length + " palabras");
	
}
public static void arrayListPalabras(String[] palabras2) {
	ArrayList<String> al = new ArrayList<>();
	System.out.println("Array de palabras");
	System.out.println();
	System.out.println("=================");
	System.out.println();
	for(String palabra : palabras2) {
		System.out.print("[" + palabra + "]");
	}
	System.out.println();
	System.out.println("\nLista original tiene " + palabras2.length + " palabras");
	
}

public static void hashSetPalabras(String[] palabras3) {
    HashSet<String> h = new HashSet<String>();
	System.out.println("Array de palabras");
	System.out.println();
	System.out.println("=================");
	System.out.println();
	for(String palabra : palabras3) {
		System.out.print("[" + palabra + "]");
	}
	System.out.println();
	System.out.println("\nLista original tiene " + palabras3.length + " palabras");
	
}

public static void treeSetPalabras(String[] palabras4) {
	TreeSet<String> t = new TreeSet<>();
	System.out.println("Array de palabras");
	System.out.println();
	System.out.println("=================");
	System.out.println();
	for(String palabra : palabras4) {
		System.out.print("[" + palabra + "]");
	}
	System.out.println();
	System.out.println("\nLista original tiene " + palabras4.length + " palabras");
}

public static void mapConteoPalabras(String[] palabras5) {
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	System.out.println("Array de palabras");
	System.out.println();
	System.out.println("=================");
	System.out.println();
	for(String palabra : palabras5) {
		System.out.print("[" + palabra + "]");
	}
}

public static void mapConteoPalabrasOrdenadas(String[] palabras6) {
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	System.out.println("Array de palabras");
	System.out.println();
	System.out.println("=================");
	System.out.println();
	for(String palabra : palabras6) {
		System.out.print("[" + palabra + "]");
	}
}
}
 