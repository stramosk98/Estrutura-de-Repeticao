package lista3;
import java.util.Scanner;
public class Exercicio23 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int turma = 0, aluno = 0, tot = 0;
			float media = 0;
			
			System.out.print("Digite a quantidade de turmas: ");
			turma = entrada.nextInt();
				
			for (int i = 0; i < turma; i++) {
				System.out.print("Quantidade de alunos na turma "  + (i + 1) + ": ");
				aluno = entrada.nextInt();
		
					while(aluno > 40) {
						System.out.print("Uma turma não deve ter mais de 40 alunos\nDigite novamente: ");
						aluno = entrada.nextInt();
					}
				
				tot += aluno;
			}
			
			media = (tot / (float)turma);
			System.out.println("\nNúmero médio de alunos por turma: " + media);
			
			entrada.close();
		}
	}