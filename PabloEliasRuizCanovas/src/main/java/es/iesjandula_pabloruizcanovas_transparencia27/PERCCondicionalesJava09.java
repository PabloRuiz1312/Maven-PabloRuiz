package es.iesjandula_pabloruizcanovas_transparencia27;
import java.util.Scanner;
public class PERCCondicionalesJava09 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int numero;
	System.out.println("Introduzca un numero y te digo su primera cifra");
	numero=sc.nextInt();
	if(numero>0 && numero<10)
		System.out.println("La   primera cifra de tu numero es "+numero);
	else if(numero>10 && numero<100)
	{
		numero=numero/10;
		System.out.println("La primera cifra de tu numero es "+numero);
	}else if(numero>100 && numero<1000)
	{
		numero=numero/100;
		System.out.println("La primera cifra de tu numero es "+numero);
	}else if(numero>1000 && numero<10000)
	{
		numero=numero/1000;
		System.out.println("La primera cifra de tu numero es "+numero);
	}else if(numero>10000 && numero<100000)
	{
		numero=numero/10000;
		System.out.println("La primera cifra de tu numero es "+numero);
	}else
		System.out.println("Error numero introducido fuera de rango");
	sc.close();
	}

}
