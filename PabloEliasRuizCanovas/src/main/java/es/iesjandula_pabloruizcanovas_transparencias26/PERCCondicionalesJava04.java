package es.iesjandula_pabloruizcanovas_transparencias26;
import java.util.Scanner;
public class PERCCondicionalesJava04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	final int B,A;
	int x;
	System.out.println("Vamos a resolver ax + b = 0 introduzca los valores de a");
	A=sc.nextInt();
	System.out.println("Introduzca los valores de b");
	B=sc.nextInt();
	if(A==0)
		System.out.println("Error solucion infinita A no puede ser 0");
	else
	{
		x=(B*-1)/A;
		System.out.println("La solucion de la ecuacion es x=b/a si lo pasamos a valores es x="+-B+"/"+A+" y su resultado es "+x);	
	}
	
	sc.close();
	}

}
