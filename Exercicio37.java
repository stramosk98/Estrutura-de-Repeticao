package lista3;
import java.util.Scanner;

public class Exercicio37 {
	public static void main(String[] args) {

			Scanner entrada = new Scanner (System.in);
			int p = 0, j = 0; 
			float m = 0; 
			int[] aluno = new int[10];
			String r = "";
			String[] gq = new String[11];
			
			System.out.println("Professor, preencha o GABARITO\n");
			for (int i = 1; i < 11; i++) {
				System.out.print("Quest�o" + i + ": ");
				gq[i] = entrada.next();
			}
			
			entrada.nextLine();
			
			while(true) {
				j++;
				System.out.println("Aluno " + j);
			System.out.print("Responda as quest�es da prova apenas com (a, b, c, d, e)\n");
			for (int i = 1; i < 11; i++) {
				System.out.print("Quest�o" + i + ": ");
				r = entrada.nextLine();
				if(r.equals(gq[i])) {
					System.out.println("Correto");
					p++;
					m++;
				}else {
					System.out.println("Errada, resposta correta: " + gq[i]);
				}
			}
			System.out.println("Pontua��o final: " + p + " do aluno: " + j);
			aluno[j] = p;
			p = 0;
			System.out.println("Outro aluno ir� utilizar o sistema?('S' ou 'N')");
			String s = entrada.nextLine();
			
			if(s.equalsIgnoreCase("N")) {
			break;
			}
			}
			int maior = aluno[1];
			int menor = aluno[1];
			
			for (int i = 1; i < j; i++) {
				if(aluno[i] > maior) {
					maior = aluno[i];
				}else if(aluno[i] < menor) {
					menor = aluno[i];
			}
			}
			m = (m / j);
			
			System.out.println("\nMaior acerto: " + maior + ", e menor acerto: " + menor + "\nTotal de alunos que utilizaram o sistema: " + j + "\nMedia das notas: " + m);
		
			entrada.close();
	}
	}