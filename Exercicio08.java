package lista3;
import java.util.Scanner;
public class Exercicio08 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int sum = 0;
			
			System.out.print("Digite dois números inteiros: ");
			int n1 = entrada.nextInt();
			int n2 = entrada.nextInt();
			
			for (int i = n1 + 1; i < n2; i++) {
				System.out.print(i + "|");
				sum += i;
				}
			
			System.out.println("\nSoma dos números: " + sum);
			entrada.close();
			 
			 }
		}