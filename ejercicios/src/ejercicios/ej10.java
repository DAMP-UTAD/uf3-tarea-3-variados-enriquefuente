package ejercicios;
import java.util.Scanner;
public class ej10 {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Insertar primer num");
		int n;
		n = scan.nextInt();
		if (n<10) {
			System.out.println("el primer num es menor que 10");
		}
		System.out.println("Insertar segundo num");
		int n1;
		n1 = scan.nextInt();
		if (n1<10) {
			System.out.println("el segundo num es menor que 10");
		}
		System.out.println("Insertar tercer num");
		int n2;
		n2 = scan.nextInt();
		if (n2<10) {
			System.out.println("el tercer num es menor que 10");
		}
		int ns;
		ns = (n + n1 +n2);
		if (ns<10) {
			System.out.println("La suma es menor que 10");
		}
	}
}
