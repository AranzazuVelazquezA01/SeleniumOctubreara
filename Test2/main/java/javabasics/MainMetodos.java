package javabasics;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MainMetodos extends MetodosDos{
	public static void main(String[] args) {
		
		Metodos nombreObjeto= new Metodos(); //hacemos los metodos de objeto
		Metodos nombreObjeto2= new Metodos(112,3);
		MetodosDos objecto= new MetodosDos();
		
		System.out.println(nombreObjeto.sumatoria());//imprimimos una sumatoria
		System.out.println(nombreObjeto2.sumatoria());
		
		
		nombreObjeto.mostrarMensaje();
		String elementoGuardado= nombreObjeto.mostrarNombre("ara");
		System.out.println(elementoGuardado);
		System.out.println("EMPIEZA PIRMER EJEMPLO CON FOR DOS PUNTOS");
				List<String> listaNombres = objecto.listaDeNombres();
				List<Integer> listaNumeros = objecto.listaNumeros();
				for(String nombre : listaNombres) {
					System.out.println(nombre);
				}
				//System.out.println("for con dos puntos");
				//Hace lo mismo que lo de arriba 
				System.out.println("EMPIEZA PIRMER EJEMPLO CON FOR INDEX");
				for(int indice=0 ; indice< listaNombres.size(); indice++){
					System.out.println(listaNombres.get(indice));
				}
				//System.out.println("for con index");
				
				for(int numero : listaNumeros) {
					System.out.println(numero);
				}
				
				List<String> nombresSinElementosDuplicados = listaNombres.stream().distinct().collect(Collectors.toList());
				//Como esta la lista
				System.out.println("LISTA DE NOMBRES NORMAL");
				Collections.sort(nombresSinElementosDuplicados);
				System.out.println(nombresSinElementosDuplicados);
				//ordenado reverso
				System.out.println("LISTA DE NOMBRES ORDEN REVERSO");
				Collections.sort(nombresSinElementosDuplicados,Collections.reverseOrder());
				System.out.println(nombresSinElementosDuplicados);
				
				
				//ORDERNAR LOS NUMEROS
				
				System.out.println("Numero mayor "+Collections.max(listaNumeros));
				System.out.println("Numero menor "+Collections.min(listaNumeros));
				System.out.println("LISTA DE NUMEROS NORMAL");
				Collections.sort(listaNumeros);
				System.out.println(listaNumeros);
				System.out.println("LISTA DE NUMEROS ORDEN REVERSO");
				Collections.sort(listaNumeros,Collections.reverseOrder());
				System.out.println(listaNumeros);
				
				System.out.println("LISTA ELIMINAR EL DUPLICADO");
				Object last = null;//guardar en una variable objecto
				int numCount= 0;//empieza a contar numCount=numCount+1
				Iterator<Integer> i = listaNumeros.iterator();
				
				while(i.hasNext()) {
					Object temp = i.next();
					
					if(temp.equals(last)){
						i.remove();
						numCount++;
					}else {
							last=temp;
						}
					
					}
					
				
				System.out.println("Cantidad de numeros duplicados "+numCount);
				System.out.println(listaNumeros);	
				// HERENCIA CON EL extends
				System.out.println("VARIABLE HEREDADA "+"*"+hereder+"*");	
				
				}
				

}
