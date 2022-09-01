package lista3;
import java.util.Scanner;
public class Exercicio21 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			
			int n = 0, idade = 0, tot = 0;
			float media = 0;
			
			System.out.print("Digite a quantidade de pessoas: ");
			n = entrada.nextInt();
				
			for (int i = 0; i < n; i++) {
				System.out.print("Idade da pessoa "  + (i + 1) + ": ");
				idade = entrada.nextInt();
				
				while(idade < 0 || idade > 150) {
					System.out.print("Idade inválida!\nDigite novamente: ");
					idade = entrada.nextInt();
				}
				tot += idade;
			}
			
			media = (tot / n);
			
				if(media > 0 && media <= 25)
					System.out.println("Turma jovem");
				
				else if(media > 25 && media <= 60)
					System.out.println("Turma adulta");
				
				else
					System.out.println("Turma idosa");
			
				entrada.close();
		}
	}