package lista3;
import java.util.Scanner;
public class Exercicio22 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int sumvot = 0, voto = 0, j = 0, m = 0, a = 0;
			
			System.out.println("Para presidente vote: 1- Jo�o, 2- Ana e 3- Maria\n");
			
			System.out.print("Digite o n�mero total de votantes: ");
			sumvot = entrada.nextInt();
				
			for (int i = 0; i < sumvot; i++) {
				System.out.print("Digite o seu voto eleitor "  + (i + 1) + ": ");
				voto = entrada.nextInt();
		
					while(voto > 3 || voto < 1) {
						System.out.print("Voto inv�lido!\nDigite novamente: ");
						voto = entrada.nextInt();
					}
				
				if(voto == 1) 
					j ++;
				
				else if(voto == 2) 
					a++;
				
				else 
					m++;	
			}
			
			System.out.println("\nRESULTADOS:\nCandidato Jo�o: " + j + "\nCandidata Ana: " + a + "\nCandidata Maria: " + m);
			entrada.close();
		}
	}