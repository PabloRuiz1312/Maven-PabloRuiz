package es.iesjandula_pabloruizcanovas_transparencias26;
import java.util.Scanner;
public class PERCCondicionalesJava05 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in); 
	int horas,minutos,segundos,resultado;
	final int MEDIANOCHE=86400;
	System.out.println("Introduzca una cantidad de horas");
	horas=sc.nextInt();
	System.out.println("Introduzca una cantidad de minutos");
	minutos=sc.nextInt();
	if(horas<0 || minutos<0)
		System.out.println("Error tiempo negativo no valido");
	else
	{
		if(horas>24)
			horas=horas-24;
		if(minutos>60)
		{
			horas=horas+(minutos%60);
			minutos=minutos%60;
		}
		if(horas==0 && minutos==0)
			System.out.println("Faltan 0 segundos para medianoche");
		else
		{
			segundos=(horas*3600)+(minutos*60);
			resultado=MEDIANOCHE-segundos;
			System.out.println("Faltan "+resultado+" para medianoche");
		}
	}
	sc.close();
	}

}
