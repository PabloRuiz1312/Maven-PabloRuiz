package es.iesjandula_pabloruizcanovas_transparencias9;
import java.util.Scanner;
public class PERCPrimerosPasosJava10 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int horas,resultadoDia,resultadoSemana;
	final int SALARIO=12,SEMANA=7;
	System.out.println("Introduzca cuantas horas trabaja su empleado al dia");
	horas=sc.nextInt();		
	if(horas>=24 || horas<=0)
		System.out.println("Error al introducir las horas");
	else 
	{
		resultadoDia=SALARIO*horas;
		resultadoSemana=resultadoDia*SEMANA;
		System.out.println("El salario diario es de "+resultadoDia+" euros y el semanal es "+resultadoSemana+" euros");
			
	}
	}
}
