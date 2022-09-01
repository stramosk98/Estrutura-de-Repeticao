package lista3;
import java.util.Scanner;
public class Exercicio16 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int n = 1, maior = 0, menor = 0, sum = 0;
			System.out.println("Digite '0' para encerrar o programa!\n");
			
			while(n != 0) {
				
			for (int i = 0; n != 0; i++) {
				System.out.print("Digite o valor "  + (i + 1) + ": ");
				n = entrada.nextInt();
				sum += n;
				
				if(n == 0) {
					break;
				}

				if(i == 0) {
					maior = n;
					menor = n;
				}else {
					
				if(n > maior) {
					maior = n;
				} 
				
				if(n < menor) {
					menor = n;
				}
			}
			}
			}
	
			System.out.println("\nMaior valor: " + maior + "\nMenor valor: " + menor + "\nSoma dos valores: " + sum);
			
			entrada.close();
		}
	}