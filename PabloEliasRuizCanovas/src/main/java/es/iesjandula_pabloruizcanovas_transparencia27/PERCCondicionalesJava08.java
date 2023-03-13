package es.iesjandula_pabloruizcanovas_transparencia27;
import java.util.Scanner;
public class PERCCondicionalesJava08 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int numero;
	System.out.println("Dime un numero y te digo su ultima cifra");
	numero=sc.nextInt();
	if(numero>=0 && numero<10)
	{
		System.out.println("La ultima cifra de tu numero es "+numero);
	}else if(numero>=10 && numero<100)
	{
		numero=numero%10;
		System.out.println("La ultima cifra de tu numero es "+numero);
	}else if(numero>=100 && numero<1000)
	{
		numero=(numero%100)%10;
		System.out.println("La ultima cifra de tu numero es "+numero);
	}else if(numero>=1000 && numero<10000)
	{
		numero=(numero%1000)%100%10;
		System.out.println("La ultima cifra de tu numero es "+numero);
	}else if(numero>=10000 && numero<100000)
	{
		numero=(numero%10000)%1000%100%10;
		System.out.println("La ultima cifra de tu numero es "+numero);
	}else
		System.out.println("Error numero introducido fuera de rango");
	sc.close();
	}

}
