package es.iesjandula_pabloruizcanovas_transparencias9;
import java.util.Scanner;
public class PERCPrimerosPasosJava09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double euros,resultado;
		final double PESETAS=166.386;
		System.out.println("Introduzca una cantidad de euros");
		euros=sc.nextInt();
		resultado=PESETAS*euros;
		System.out.println("Tienes un total de "+resultado+" pesetas");
	}

}
