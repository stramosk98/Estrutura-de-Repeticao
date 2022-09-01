package lista3;
import java.util.Scanner;
public class Exercicio25 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("• Lojas Quase Dois - Tabela de preços");
				
			for (int i = 0; i < 50; i++) {
				System.out.println("  " + (i + 1) + " - R$ " + (1.99 * (i + 1)));
			}
			
			entrada.close();
		}
	}