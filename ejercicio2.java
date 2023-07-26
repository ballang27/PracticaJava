import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Escriba su edad : ");
		int edad = in.nextInt();
		double billete = 7;
		if(edad < 5) {
			billete -= billete*0.60;
		}else if(edad >= 60) {
			billete -= billete*0.55;
		}else {
			System.out.println("error");
		}
		System.out.println("su boleta cuesta " + billete);
		in.close();

	}

}
