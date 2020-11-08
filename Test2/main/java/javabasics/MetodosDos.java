package javabasics;

import java.util.ArrayList;
import java.util.List;

public class MetodosDos {
	
	static String hereder = "Mensaje de texto heredado de la clase MetodosDos";
	public List<String> listaDeNombres(){
		List<String> listaNombres = new ArrayList<>();
			listaNombres.add("Aranzazu");
			listaNombres.add("Xoti");
			listaNombres.add("Guadalupe");
			listaNombres.add("Yuya");
		return listaNombres;
		
	}
	
	public List<Integer> listaNumeros(){
		List<Integer> listaNumeros = new ArrayList<>();
			listaNumeros.add(1);
			listaNumeros.add(0);
			listaNumeros.add(6);
			listaNumeros.add(78);
			listaNumeros.add(1);
		return listaNumeros;
		
	}

}
