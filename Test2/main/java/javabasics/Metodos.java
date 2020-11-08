package javabasics;

public class Metodos {
	int numero1, numero2;
	public Metodos (int numero1, int numero2) {
		this.numero1=numero1;
		this.numero2=numero2;
	}
		public Metodos() {
			
			
		}
		public static void main(String[] args) {
			
			Metodos nombreObjeto= new Metodos();
			Metodos nombreObjeto2= new Metodos(9,3);
			
			System.out.println(nombreObjeto.sumatoria());
			System.out.println(nombreObjeto2.sumatoria());
			
			
			nombreObjeto.mostrarMensaje();
			String elementoGuardado= nombreObjeto.mostrarNombre("ara");
			System.out.println(elementoGuardado);
			
					
					}
public int  sumatoria() {
	return numero1+numero2;
	
}

public void mostrarMensaje() {
	System.out.println("Hola mundo");
}

public String mostrarNombre(String nombre) {
	System.out.println(nombre);
	return nombre;
}
}
