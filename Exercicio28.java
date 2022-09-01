package lista3;
import java.util.Scanner;
public class Exercicio28 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int temp = 1, maior = 0, menor = 0, tot = 0, cont = 0;
			float media = 0;
			
			System.out.println("Digite '0' para encerrar o programa!\n");
			
			while(temp != 0) {
				
			for (int i = 0; temp != 0; i++) {
				System.out.print("Temperatura "  + (i + 1) + ": ");
				temp = entrada.nextInt();
				tot += temp;
				
				if(temp == 0) {
					break;
				}
				
				cont++;

				if(i == 0) {
					maior = temp;
					menor = temp;
				}else {
					
				if(temp > maior) {
					maior = temp;
				} 
				
				if(temp < menor) {
					menor = temp;
				}
			}
			}
			}
			
			media = (tot / (float)cont);
			System.out.println("\nMaior temperatura: " + maior + "\nMenor temperatura: " + menor + "\nMedia de temperatura: " + media);
			
			entrada.close();
		}
	}