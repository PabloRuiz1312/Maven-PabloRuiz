package es.iesjandula_pabloruizcanovas_transparencia45;
import java.util.Scanner;
public class PERCBuclesHastaQueJava04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int dividendo,divisor,resta=0,contador=0;
	System.out.println("Introduzca el dividendo");
	dividendo=sc.nextInt();
	System.out.println("Introduzca el divisor");
	divisor=sc.nextInt();
	do
	{
		dividendo-=divisor;
		if(dividendo==1 || dividendo==0)
		{
			break;
		}else
		{
			resta+=divisor;
			contador++;
		}
	}while(contador<dividendo);
	System.out.println(resta);
	}

}
