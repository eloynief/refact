package divisores;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numeroUsuario;
		long numDivisores;
		Scanner sc = new Scanner(System.in);
		
		numeroUsuario = sc.nextInt();
		numDivisores = primeDivisors(numeroUsuario);
		
		String string = "Número de divisores: ";
		System.out.println(string + numDivisores);
		sc.close();
	}

	private static long primeDivisors(long number) {
		int cont = 0;
		
		for(int i=2; i<=number; i++) {
			long modulo = number%i;
			boolean esDivisor = modulo==0;
			if(esDivisor && isPrime(i)) {
				cont++;
			}
		}
		
		return cont;
	}
	
	public static boolean isPrime(int numero) {
		boolean esPrimo = true;
		for(int i=2; i<numero; i++) {
			if(numero%i == 0) {
				esPrimo = false;
				break;
			}
		}
		return esPrimo;
	}
}
