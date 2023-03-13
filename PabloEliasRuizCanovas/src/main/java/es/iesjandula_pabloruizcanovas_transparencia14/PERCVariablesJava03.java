package es.iesjandula_pabloruizcanovas_transparencia14;
import java.util.Scanner;
public class PERCVariablesJava03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double factura,precioIva,precioFinal;
		final int IVA=21;
		System.out.println("Que factura desea entregar");
		factura=sc.nextDouble();
		precioIva=factura*IVA/100;
		precioFinal=factura+precioIva;
		System.out.println("Su factura se le suma "+precioIva+" euros por el IVA su precio final seria "+precioFinal+" euros");
		

	}

}
