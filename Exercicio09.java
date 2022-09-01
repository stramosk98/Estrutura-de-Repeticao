package lista3;
import java.util.Scanner;
public class Exercicio09 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Tabuada de: ");
			int num = entrada.nextInt();
			
				for (int i = 0; i <= 10; i++) {
				System.out.println(num + " X " + i + " = " + (num * i));
			}
			
			entrada.close();
		}
	}