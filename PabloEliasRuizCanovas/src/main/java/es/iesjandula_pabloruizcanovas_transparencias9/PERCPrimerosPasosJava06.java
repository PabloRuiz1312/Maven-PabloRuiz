package es.iesjandula_pabloruizcanovas_transparencias9;
import  java.util.Scanner;
public class PERCPrimerosPasosJava06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero,numero2,numero3,resultado;
		System.out.println("Introduzca un numero");
		numero=sc.nextInt();
		System.out.println("Introduzca otro numero");
		numero2=sc.nextInt();
		System.out.println("Introduzca otro numero");
		numero3=sc.nextInt();		
		resultado=numero*numero2*numero3;
		System.out.println("El resultado de la multiplicacion de los numeros introducidos es "+resultado);
	}

}
