package lista3;
import java.util.Scanner;
public class Exercicio26 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			float pao = 0;
			
			System.out.print("• Preço do pão: R$ ");
			pao = entrada.nextFloat();
			
			System.out.println("  Panificadora Pão de Ontem - Tabela de preços");
				
			for (int i = 0; i < 50; i++) {
				System.out.println("  " + (i + 1) + " - R$ " + (pao * (i + 1)));
			}
			
			entrada.close();
		}
	}