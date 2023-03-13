package es.iesjandula_pabloruizcanovas_transparencias9;
import java.util.Scanner;
public class PERCPrimerosPasosJava07 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);	
	int x,resultado;
	System.out.println("Vamos a hacer la ecuacion F(X)=X^2 + X + 1 Introduzca el valor de la X");
	x=sc.nextInt();		
	resultado=(x*x)+x+1;
	System.out.println("El resultado de F("+x+")="+x+"^2 + "+x+" + 1 es "+resultado);
	}

}
