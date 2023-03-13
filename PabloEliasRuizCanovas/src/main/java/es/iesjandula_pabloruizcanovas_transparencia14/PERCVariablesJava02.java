package es.iesjandula_pabloruizcanovas_transparencia14;
import java.util.Scanner;
public class PERCVariablesJava02 {

	public static void main(String[] args) {
	Scanner sc  = new Scanner (System.in);
	double euros,resultadoPesetas=0;
	final double PESETAS=166.386;
	System.out.println("De cuantos euros dispones");
	euros=sc.nextDouble();
	resultadoPesetas=PESETAS*euros;
	System.out.println("Dipondrias de "+resultadoPesetas+" pesetas");	
	}
}
