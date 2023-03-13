package es.iesjandula_pabloruizcanovas_transparencias26;
import java.util.Scanner;
public class PERCCondicionalesJava01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int dia;
	System.out.println("Introduzca un dia de la semana y te digo que dia toca");
	dia=sc.nextInt();
	switch(dia)
	{
	case 1:
		System.out.println("Base de datos");
	break;
	case 2:
		System.out.println("Programacion");
	break;
	case 3:
		System.out.println("Sistemas informaticos");
	break;
	case 4:
		System.out.println("Formacion laboral");
	break;
	case 5:
		System.out.println("Programacion");
	break;
	case 6:
		System.out.println("Dormir");
	break;
	case 7:
		System.out.println("Dormir");
	break;
	default:
		System.out.println("Error numero introducido fuera de rango");
	}
	sc.close();
	}

}
