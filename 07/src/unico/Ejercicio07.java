package unico;

public class Ejercicio07 {

	public static void main(String[] args) {

// Implementar un método que nos diga si un número es primo.

	int num;
	int divP;
	
	num = Util.leerInt("Introduzca un número: ");
	
	divP = esDivisor(num);
	
	Util.escribir(" El número " + num + " tiene " + divP + " divisores primos.");
		
	}
	
	public static int esDivisor (int n) {
		int cont = 0;
		for (int i = 1; i <= n; i++) {
			if (n%i == 0) {
				if (esPrimo(i)) {
					cont += 1;
				}
			}
		}
		return cont;
	}
	
	public static boolean esPrimo (int n) {

		boolean esPrimo = true;
		
		for (int i = 2; 2 <n; i++) {
			if (n%i == 0) {
				esPrimo = false;
			}
		}	
		return esPrimo;
	}
	
}
