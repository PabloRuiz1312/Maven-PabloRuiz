package es.iesjandula_pabloruizcanovas_transparencias26;
import java.util.Scanner;
public class PERCCondicionalesJava02 {
	
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int hora;
	System.out.println("Introduzca una hora y te digo en que momento del dia");
	hora=sc.nextInt();
	if(hora>=6 && hora<=12)
		System.out.println("Buenos dias");
	else if(hora>=13 && hora<=20)
		System.out.println("Buenas tardes");
	else if(hora>=21 && hora<=5)
		System.out.println("Buenas noches");
	else
		System.out.println("Error numero introducido fuera de rango");
	sc.close();
	}
}
