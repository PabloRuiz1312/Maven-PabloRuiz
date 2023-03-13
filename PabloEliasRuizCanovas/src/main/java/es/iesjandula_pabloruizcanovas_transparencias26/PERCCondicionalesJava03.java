package es.iesjandula_pabloruizcanovas_transparencias26;
import java.util.Scanner;
public class PERCCondicionalesJava03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int dia;
	System.out.println("Introduzca un dia de la semana y te digo que dia toca");
	dia=sc.nextInt();
	switch(dia)
	{
	case 1:
		System.out.println("Lunes");
	break;
	case 2:
		System.out.println("Martes");
	break;
	case 3:
		System.out.println("Miercoles");
	break;
	case 4:
		System.out.println("Jueves");
	break;
	case 5:
		System.out.println("Viernes");
	break;
	case 6:
		System.out.println("Sabado");
	break;
	case 7:
		System.out.println("Domingo");
	break;
	default:
		System.out.println("Error numero introducido fuera de rango");
	}
	sc.close();

	}

}


