package lista3;
import java.util.Scanner;
public class Exercicio05 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
	
				for (int i = 1; i <= 20; i++) {
					System.out.println(i);
				}
				
				for (int i = 1; i <= 20; i++) {
				System.out.print(i + " | ");
			}
				
			entrada.close();
		}
	}