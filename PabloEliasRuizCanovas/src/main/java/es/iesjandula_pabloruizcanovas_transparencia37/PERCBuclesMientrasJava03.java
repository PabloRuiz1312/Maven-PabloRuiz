package es.iesjandula_pabloruizcanovas_transparencia37;
import java.util.Scanner;
public class PERCBuclesMientrasJava03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int numero,numero2,elegir,resultado,fin=1;
	System.out.println("Bienvenido a la calculadora de java le muestro a un menu: \n 1.-Sumar \n 2.-Restar \n 3.-Multiplicar \n 4.-Dividir");
	while(fin!=0){
		System.out.println("Elija su opcion ");
		elegir=sc.nextInt();
		if (elegir==1)
		{
			System.out.println("Elegiste sumar introduzca el primer numero");
			numero=sc.nextInt();
			System.out.println("Introduzca el segundo numero");
			numero2=sc.nextInt();
			resultado=numero+numero2;
			System.out.println("Tu resultado es "+resultado);
		}else if(elegir==2)
		{
			System.out.println("Elegiste restar introduzca el primer numero");
			numero=sc.nextInt();
			System.out.println("Introduzca el segundo numero");
			numero2=sc.nextInt();
			resultado=numero+numero2;
			System.out.println("Tu resultado es "+resultado);
		}else if(elegir==3)
		{
			System.out.println("Elegiste multiplicar introduzca el primer numero");
			numero=sc.nextInt();
			System.out.println("Introduzca el segundo numero");
			numero2=sc.nextInt();
			resultado=numero+numero2;
			System.out.println("Tu resultado es "+resultado);
		}else if(elegir==4 )
		{
			System.out.println("Elegiste dividir introduzca el primer numero");
			numero=sc.nextInt();
			System.out.println("Introduzca el segundo numero");
			numero2=sc.nextInt();
			if(numero2==0)
				System.out.println("Error no se puede dividir entre 0");
			else
			{
				resultado=numero+numero2;
				System.out.println("Tu resultado es "+resultado);
			}
		}else
			System.out.println("Error numero introducido fuera de rango");
		System.out.println("Desea seguir con la calculadora? (0 no/cualquier numero si)");
		fin=sc.nextInt();
	}
	sc.close();
	}

}
