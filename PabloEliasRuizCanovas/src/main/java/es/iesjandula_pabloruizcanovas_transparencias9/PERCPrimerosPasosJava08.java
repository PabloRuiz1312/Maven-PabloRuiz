package es.iesjandula_pabloruizcanovas_transparencias9;
import java.util.Scanner;
import java.lang.Math;
public class PERCPrimerosPasosJava08 {
	
	public  static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int numero1,numero2,resultado=0,raiz1,raiz2;
				
		System.out.println("Introduzca dos numeros y relizare varias operaciones");
		numero1=sc.nextInt();
		System.out.println("Introduzca otro numero");
		numero2=sc.nextInt();
					
		resultado=numero1+numero2;
		System.out.println("La suma de "+numero1+" y "+numero2+" es "+resultado);
				
		resultado=numero1-numero2;
		System.out.println("La resta de "+numero1+" y "+numero2+" es "+resultado);
				
		resultado=numero1*numero2;
		System.out.println("La multiplicacion de "+numero1+" y "+numero2+" es "+resultado);		
		if(numero2==0)
			System.out.println("Error al hacer la division el numero 2 vale "+numero2);
		else
		{
			resultado=numero1/numero2;
			System.out.println("La division de "+numero1+" y "+numero2+" es "+resultado);
			resultado=numero1%numero2;
			System.out.println("El resto de "+numero1+" entre "+numero2+" es "+resultado);
		}
		resultado=(int)Math.pow(numero1, numero2);
		System.out.println("La potencia de "+numero1+" y "+numero2+" es "+resultado);
				
		if(numero1<0 || numero2<0)
			System.out.println("Error al realizar la raiz cuadrada numero negativo introducido");
		else
		{
			raiz1=(int)Math.sqrt(numero1);
			raiz2=(int)Math.sqrt(numero2);
			resultado=raiz1+raiz2;
			System.out.println("La suma de las raices de "+numero1+" y "+numero2+" es "+resultado);
		}
	}
}
