package lista3;
import java.util.Scanner;
public class Exercicio26 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			float pao = 0;
			
			System.out.print("� Pre�o do p�o: R$ ");
			pao = entrada.nextFloat();
			
			System.out.println("  Panificadora P�o de Ontem - Tabela de pre�os");
				
			for (int i = 0; i < 50; i++) {
				System.out.println("  " + (i + 1) + " - R$ " + (pao * (i + 1)));
			}
			
			entrada.close();
		}
	}