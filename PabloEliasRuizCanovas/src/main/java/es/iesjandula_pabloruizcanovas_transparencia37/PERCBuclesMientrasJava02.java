package es.iesjandula_pabloruizcanovas_transparencia37;
import java.util.Scanner;
public class PERCBuclesMientrasJava02 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int numero,acertarNumero;
	acertarNumero=(int)(Math.random()*10+1);
	System.out.println("Se ha generado un numero del 1 al 10 intente adivinarlo pulse -1 si se quiere rendir");
	numero=sc.nextInt();
	while(numero!=acertarNumero && numero!=-1)
	{
		System.out.println("No lo has adivinado vuelve a introducirlo");
		numero=sc.nextInt();
	}
	if(numero==-1)
	
		System.out.println("Te has rendido  el numero era "+acertarNumero);
	else
	System.out.println("Has acertado ");
	sc.close();
	}

}
