package es.iesjandula_pabloruizcanovas_transparencia37;
import java.util.Scanner;
public class PERCBuclesMientrasJava01 {

	public static void main(String[] args) {
	Scanner sc =  new Scanner (System.in);
	int numero,contador=0;
	System.out.println("Introduzca un numero");
	numero=sc.nextInt();
	while(contador!=numero)
	{
		System.out.print("*");
		contador++;
	}
	sc.close();
	}

}
