package lista3;
import java.util.Scanner;
public class Exercicio20 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			
			int n = 0;
			float media = 0, nota = 0, tot = 0;
			
			System.out.print("Digite a quantidade de notas: ");
			n = entrada.nextInt();
			
			for (int i = 0; i < n; i++) {
				System.out.print("Informe o valor da nota "  + (i + 1) + ": ");
				nota = entrada.nextInt();
				tot += nota;
			}
			
			media = (tot / n);
			
			System.out.println("Média das notas: " + media);
			
			entrada.close();
		}
	}