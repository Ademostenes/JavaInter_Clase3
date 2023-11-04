package PracLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Actividad3_Ejercicio1 {
	
	public static List<String> EnMayusculas(List<String> lista) {
        List<String> listaTransformada = new ArrayList<>();
        for (String cadena : lista) {
            listaTransformada.add(cadena.toUpperCase());
        }
        return listaTransformada;
    }
	
	public static List<String> EnMayusculas2(List<String> lista) {
        List<String> listaTransformada = new ArrayList<>();
        lista.forEach( c -> listaTransformada.add(c.toUpperCase()));
        return listaTransformada;
    }
	

	public static void main(String[] args) {
       List<String> cadena = Arrays.asList("juan", "pedro", "matias");
       System.out.println(EnMayusculas(cadena));
       System.out.println(EnMayusculas2(cadena));
	}

}
