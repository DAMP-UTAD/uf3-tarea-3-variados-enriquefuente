package ejercicios;
import java.util.Scanner;
public class ej11 {
		public static void main (String [] args){
			Scanner scan = new Scanner(System.in);
			System.out.println("Insertar primer num");
			int n;
			n = scan.nextInt();
			
			System.out.println("Insertar segundo num");
			int n1;
			n1 = scan.nextInt();
			
			System.out.println("Insertar tercer num");
			int n2;
			n2 = scan.nextInt();
		
			if (n<10) {
				System.out.println("al menos uno de los valores es menor que diez");
			} else if (n1<10) {
				System.out.println("al menos uno de los valores es menor que diez");
			} else if (n2<10) {
				System.out.println("al menos uno de los valores es menor que diez");
			} else {
				System.out.println("todos los numeros son mayores que 10");
			}

		}
	}