package Ej_2;

public class Ej_2 {

	public static void main(String[] args) {
		double resultado;
		
		resultado = power (2.2,2);
		
		System.out.println(resultado);
		

	}
	
	public static double power(double base, double exponente) {
		if(exponente==0) {
			return 1;
		}
		
		return base * power(base,exponente -1) ;
	}

}
