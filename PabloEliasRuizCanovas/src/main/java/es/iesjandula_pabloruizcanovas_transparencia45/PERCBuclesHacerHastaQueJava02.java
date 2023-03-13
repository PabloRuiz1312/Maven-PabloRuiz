package es.iesjandula_pabloruizcanovas_transparencia45;
import java.util.Scanner;
public class PERCBuclesHacerHastaQueJava02 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int  base,exponente,contador=0,suma=1;
	System.out.println("Dime la base");
	base=sc.nextInt();
	System.out.println("Dime el exponente");
	exponente=sc.nextInt();
	while(exponente<0)
	{
		System.out.println("Error exponente negativo vuelva a introducir numero");
		exponente=sc.nextInt();
	}
	do
	{
		suma*=base;
		contador++;
	}while(contador<exponente);
	System.out.println("Tu resultado es "+suma);
	sc.close();
   }
}