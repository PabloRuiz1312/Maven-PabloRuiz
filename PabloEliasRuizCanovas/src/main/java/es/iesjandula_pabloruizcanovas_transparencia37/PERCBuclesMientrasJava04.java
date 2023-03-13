package es.iesjandula_pabloruizcanovas_transparencia37;
import java.util.Scanner;
public class PERCBuclesMientrasJava04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int numero=50,contador=0,suma=0;
	while(contador<250)
	{
		suma+=numero;
		numero++;
		contador++;
	}
	System.out.println("Tu sumatorio es "+suma);
	sc.close();
	}

}
