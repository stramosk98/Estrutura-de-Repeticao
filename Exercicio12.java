package lista3;
import java.util.Scanner;
public class Exercicio12 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int a = 1, b = 0, aux = 0;
			
			System.out.print("Digite o n-ésimo termo: ");
			int n = entrada.nextInt();
			
			for (int i = 0; i < n; i++) {
				System.out.print(a + ", ");
				aux = a;
				a = a + b;
				b = aux;
			 } 
			
			 entrada.close();
			 
			 }
		}