package Ej_3;

public class ProductoRecursivo {

	public static void main(String[] args) {
		System.out.println(product(5.5,3));

	}
	
	public static double product(double num1, double num2) {
		if(num2 == 1)
			return num1;
		
		return num1 + product(num1, num2 -1);
	}

}
