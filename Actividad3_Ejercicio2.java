package PracLambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Actividad3_Ejercicio2 {
	
	public static String CadenaConca (List<String> cadena, int num) {
		String cadenaConvertida = "";
		List<String> cadenaAConcatenar = new ArrayList<String>();
		for (String cada : cadena) {
			if (cada.length() > num) {
				cadenaAConcatenar.add(cada);				
			}
		}
		cadenaConvertida = cadenaAConcatenar.stream().collect(Collectors.joining(", "));
		return cadenaConvertida;
		}

	public static void main(String[] args) {
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Juan");
		listaNombres.add("Sebastian");
		listaNombres.add("Martin");
		listaNombres.add("Demostenes");
		listaNombres.add("Ezequiel");
		listaNombres.add("Leo");
		System.out.println(CadenaConca(listaNombres, 4));
	}
}
