package Ej_5;

public class Ej_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] info = {3,5,6,7,9,11,13,15};
		mostrarMatriz(info, info.length);
	}
	
	public static void mostrarMatriz(int [] datos,int tam){
		if(tam != 0) {
			System.out.println(datos[tam-1]);
			mostrarMatriz(datos, tam-1);
		}
		
	}

}
