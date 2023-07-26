import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Escriba la cantidad a gastar: ");
		double cantidad = in.nextInt();
		if(cantidad >= 10000) {
			cantidad = cantidad*(0.30);
		}else if(cantidad >= 5001) {
			cantidad = cantidad*(0.20);
		}else if (cantidad >=1001) {
			cantidad = cantidad*(0.10);
		}else {
			System.out.println("la cantidad no tiene comision");

		}
		System.out.println("la comision es " + cantidad);
		in.close();
	}

}
