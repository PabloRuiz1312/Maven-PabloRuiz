package es.iesjandula_pabloruizcanovas_transparencias26;
import java.util.Scanner;
public class PERCCondicionalesJava06 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int numero1,numero2,numero3;
	System.out.println("Introduzca el primer numero");
	numero1=sc.nextInt();
	System.out.println("Introduzca el segundo numero");
	numero2=sc.nextInt();
	System.out.println("Introduzca el tercer numero");
	numero3=sc.nextInt();
	if(numero1>numero2 && numero1>numero3)
		System.out.println("El primer numero es el "+numero1);
	else if(numero2>numero1 && numero2>numero3)
		System.out.println("El primer numero es el "+numero2);
	else 
		System.out.println("El primer numero es el "+numero3);
	if(numero2<numero1 && numero2>numero3)
		System.out.println("El segundo numero es el "+numero2+" y el tercero el "+numero3);
	else if(numero2<numero3 && numero2>numero1)
		System.out.println("El segundo numero es el "+numero2+" y el tercero es el "+numero1);
	else if(numero1<numero2 && numero1>numero3)
		System.out.println("El segundo numero es el "+numero1+" y el tercero es el "+numero3);
	else if(numero1<numero3 && numero1>numero2)
		System.out.println("el segundo numero es el "+numero1+" y el tercerro es el "+numero2);
	else if(numero3<numero1 && numero3>numero2)
		System.out.println("El segundo numero es el "+numero3+" y el tercero es el "+numero2);
	else
		System.out.println("El segundo numer es el "+numero3+" y el tercero es el "+numero1);
	
	
	sc.close();
	}

}
