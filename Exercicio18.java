package lista3;
import java.util.Scanner;
public class Exercicio18 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int n = 0, div = 0;
			
			System.out.print("Digite um número inteiro: ");
			n = entrada.nextInt();
			
			for (int i = n; i >= 1; i--) {
					if(n % i == 0) {
						div++;	
						}	
					}
					
					if(div == 2) {
						System.out.println(n + " é primo");
						
					}else {
						System.out.println(n + " não é primo, pois é divisível por: ");
						for (int i = n; i >= 1; i--) {
								if(n % i == 0) {
									System.out.print(i + " ");
								}
						}
					}
			
			entrada.close();
		}
	}