package lista3;
import java.util.Scanner;
public class Exercicio07 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
	
			System.out.print("Digite dois números inteiros: ");
			int n1 = entrada.nextInt();
			int n2 = entrada.nextInt();
			
			for (int i = n1 + 1; i < n2; i++) {
				System.out.print(i + "|");
				}
			
			entrada.close();
			 
			 }
		}