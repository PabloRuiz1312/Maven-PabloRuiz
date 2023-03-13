package es.iesjandula_pabloruizcanovas_transparencia10;
import java.util.Scanner;
public class PERCPrimerosPasosPseInt11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double  nota,nota2,resultado,resultado2;
		final int NOTA1=40,NOTA2=60,MEDIA=100,NOTAMAX=10;
			System.out.println("Introduzca su primera nota");
			 	nota=sc.nextDouble();
			 	resultado=(nota*NOTA1)/MEDIA;
			 System.out.println("Tu primera nota es de "+nota+" y si le aplicamos el 40% del primer examen es "+resultado);
			 	nota2=NOTAMAX-nota;
			 	resultado2=NOTAMAX-resultado;
			 System.out.println("Te haria falta sacar en le segundo examen un "+nota2+" y si le aplicamos el 60% un "+resultado2+" para sacar un 10 en la media");
			
				
			

	}

}
