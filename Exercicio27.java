package lista3;
import java.util.Scanner;
public class Exercicio27 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			float prod = 1, tot = 0, j = 1;
			
			while(j == 1) {
				prod = 1;
			System.out.println("• Lojas Tabajara");
			
			while(prod != 0) {
				
			for (int i = 0; prod != 0; i++) {
				System.out.print("  Produto "  + (i + 1) + ": R$ ");
				prod = entrada.nextFloat();
				tot += prod;
			}
			}
		
			System.out.println("  Total: R$ " + tot);
			
			System.out.print("  Dinheiro: R$ ");
			float din = entrada.nextFloat();
			
			System.out.println("  Troco: R$ " + (din - tot) + "\n");	
			}
			
			entrada.close();
		}
	}