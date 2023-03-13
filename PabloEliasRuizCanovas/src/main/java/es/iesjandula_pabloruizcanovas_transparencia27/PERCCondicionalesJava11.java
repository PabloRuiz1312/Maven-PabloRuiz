package es.iesjandula_pabloruizcanovas_transparencia27;
import java.util.Scanner;
public class PERCCondicionalesJava11 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int numero,capicua;
	System.out.println("Introduzca un numero y te digo si es capicua (Se lee igual de izquierda a derecha)");
	numero=sc.nextInt();
	if(numero>0 && numero<10)
		System.out.println("Tu numero es capicua");
	if(numero>10 && numero<100)
	{
		capicua=numero/10;
		numero=numero/10;
		if(numero==capicua)
		
			System.out.println("Tu numero es capicua");
		else
			System.out.println("Tu numero no es capicua");
	}else if(numero>100 && numero<1000)
	{
		capicua=numero/100;
		numero=numero/10;
		if(numero==capicua)
			System.out.println("Tu numero es capicua");
		else
			System.out.println("Tu numero no es capicua");
	}else if(numero>1000 && numero<10000)
		System.out.println("Tu numero no es capicua");
	else if(numero>10000 && numero<100000)
	{
		capicua=numero/100;
		numero=numero/10000;
		if(numero==capicua)
		{
			System.out.println("Tu numero es capicua");
		}else
			System.out.println("Tu numero no es capicua");
	}
	
		
	

	}

}
