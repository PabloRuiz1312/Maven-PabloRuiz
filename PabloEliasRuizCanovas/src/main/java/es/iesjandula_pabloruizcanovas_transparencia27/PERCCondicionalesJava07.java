package es.iesjandula_pabloruizcanovas_transparencia27;
import java.util.Scanner;
public abstract class PERCCondicionalesJava07 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int numero;
	System.out.println("Introduzca un numero y te digo si es par o divisible entre 5");
	numero=sc.nextInt();
	if(numero%2==0 && numero%5!=0)
		System.out.println("Tu numero es par");
	else if(numero%5==0 && numero%2!=0)
	
		System.out.println("Tu numero es divisible entre 5");
	else if(numero%2==0 && numero%5==0)
	{
		System.out.println("Tu numero es par y divisible entre 5");
	}
	else
		System.out.println("Tu numero no es par ni divisible");
	sc.close();
	}

}
