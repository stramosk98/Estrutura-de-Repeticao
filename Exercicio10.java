package lista3;
import java.util.Scanner;
public class Exercicio10 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			float sum = 1;
			
			System.out.print("Digite a base: ");
			float b = entrada.nextFloat();
			
			System.out.print("Digite o expoente: ");
			float e = entrada.nextFloat();
			
			for (int i = 0; i < e; i++) {
				sum *= b;
				}
		
				System.out.println("\nResultado: " + sum);
			 entrada.close();
			 
			 }
		}