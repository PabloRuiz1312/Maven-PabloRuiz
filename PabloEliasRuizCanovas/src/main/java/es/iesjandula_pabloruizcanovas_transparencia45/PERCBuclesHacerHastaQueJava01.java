package es.iesjandula_pabloruizcanovas_transparencia45;
import java.util.Scanner;
public class PERCBuclesHacerHastaQueJava01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int numero,factorial=1;
	System.out.println("Dime un numero y te hago su factorial");
	numero=sc.nextInt();
	do
	{	
		factorial*=numero;
		System.out.print(numero+" x ");
		numero--;
		
	}while(numero>0);
	System.out.println("Tu factorial es "+factorial);
	sc.close();
	}

}
