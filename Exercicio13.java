package lista3;
import java.util.Scanner;
public class Exercicio13 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int n = 0;
			float sum = 1;
			
			System.out.print("Digite um número inteiro: ");
			n = entrada.nextInt();
			
			System.out.print(n + "! = ");
			
			for (int i = n; i >= 1; i--) {
					sum = (sum * i);
					System.out.print(i + ".");
					}
					System.out.print("= " + sum);
			
			entrada.close();
		}
	}