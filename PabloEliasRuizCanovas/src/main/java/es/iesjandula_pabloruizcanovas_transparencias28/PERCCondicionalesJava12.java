package es.iesjandula_pabloruizcanovas_transparencias28;
import java.util.Scanner;
public class PERCCondicionalesJava12 {

	
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	double nota1,nota2,media;
	boolean apto;
	System.out.println("Introduzca la primera nota del examen");
	nota1=sc.nextDouble();
	System.out.println("Introduzca la segunda nota del examen");
	nota2=sc.nextDouble();
	media=(nota1+nota2)/2;
	if(media>=5 && media<=10)
		System.out.println("Su alumno ha aprobado su media es "+media);
	else if(media<5 && media>=0)
	{
		System.out.println("El alumno despues de la recuperacion es apto o no apto (true apto/ false no apto)");
		apto=sc.nextBoolean();
		if(apto==true)
		{
			media=5;
			System.out.println("El alumno es apto su media de el alumno es de "+media);
		}else
			System.out.println("El alumno no es apto su media es de "+media);
			
		
	}else
		System.out.println("Error al calcular la media");
	sc.close();
	}
}
