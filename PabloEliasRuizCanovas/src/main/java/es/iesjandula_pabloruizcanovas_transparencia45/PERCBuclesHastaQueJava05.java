package es.iesjandula_pabloruizcanovas_transparencia45;
import java.util.Scanner;
public class PERCBuclesHastaQueJava05 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int numero;
	System.out.println("Introduzca un numero y te pinto un triangulo invertido");
	numero=sc.nextInt();
	do
	{
		for(int i=0;i<numero;i++)
		{
			System.out.print("*");
			
		}
		System.out.println("");
		numero--;
	}while(numero>0);
	sc.close();
	}

}
