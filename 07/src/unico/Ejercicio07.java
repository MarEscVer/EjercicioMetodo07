package unico;

public class Ejercicio07 {

	public static void main(String[] args) {

// Implementar un método al que se le pase un número entero y devuelva el número total de divisores primos que tiene.

	int num;
	int divP;
	
	num = Util.leerInt("Introduzca un número: ");
	
	divP = esDivisor(num);
	
	Util.escribir(" El número " + num + " tiene " + divP + " divisores primos.");
		
	}
	
	public static int esDivisor (int n) {
		int cont = 0;
		for (int i = 2; i <= n; i++) {
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
		for (int i = 2; i < n; i++) {
			if (n%i == 0) {
				esPrimo = false;
			}
		}	
		return esPrimo;
	}
	
}
