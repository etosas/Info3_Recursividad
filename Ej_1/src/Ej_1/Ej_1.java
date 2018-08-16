package Ej_1;

import java.util.Scanner;

public class Ej_1 {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("Ingrese un numero");
		
		scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		visualizarRecursion(num);

	}
	
	public static long visualizarRecursion(int num) {
		
		
		if(num == 1) {
			return 1;
		}
		System.out.println("Se llamo con" + num);
		long resultado = num * visualizarRecursion(num-1);
		System.out.println("El factorial de: "+num+" es: " +resultado + "=" + num + "*" + (num-1)+"!"  );
		return resultado;
	}
}
