package lista3;
import java.util.Scanner;
public class Exercicio11 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int par = 0, impar = 0;
			
			for (int i = 0; i < 10; i++) {
				System.out.print("Digite o n�mero "  + (i + 1) + ": ");
				int n = entrada.nextInt();
				
				if(n % 2 == 0) 
					par++;
				
				else
					impar++;
			 } 
			
				System.out.println("\nQuantidade de n�meros pares: " + par + "\nQuantidade de n�meros �mpares: " + impar);
			 entrada.close();
			 
			 }
		}