package es.iesjandula_pabloruizcanovas_transparencia45;
import java.util.Scanner;
public class PERCBuclesHacerHastaQueJava03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int base,exponente,suma,acum,contador=1;
	System.out.println("Dime la base");
	base=sc.nextInt();
	acum=base;
	System.out.println("Dime el exponente");
	exponente=sc.nextInt();
	while(exponente<0)
	{
		System.out.println("Exponente negativo introducido vuelve a introducirlo");
		exponente=sc.nextInt();
	}
	do
	{
		suma=acum+acum;
		acum=suma;
		contador++;
	}while(contador<exponente);
	System.out.println("Tu resultado es "+suma);
	}

}
