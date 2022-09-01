package lista3;
import java.util.Scanner;

public class Exercicio31 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int LIN = 10;
		int codA = 0, codB = 0, maior = 0, menor = 0 ;
		int[] cod = new int [LIN];
		int[] alt = new int [LIN];
		
		for (int i = 0; i < LIN; i++) {
			System.out.print("Digite o código do aluno n° "  + (i + 1) + ": ");
			cod[i] = entrada.nextInt();
			System.out.print("Digite a altura em CMs do aluno n° "  + (i + 1) + ": ");
			alt[i] = entrada.nextInt();
			
			if(i == 0) {
				maior = alt[i];
				codA = cod[i];
				menor = alt[i];
				codB = cod[i];
			}else {
				
			if(alt[i] > maior) {
				maior = alt[i];
				codA = cod[i];
			} 
			if(alt[i] < menor) {
				menor = alt[i];
				codB = cod[i];
			}
		}
		}
		
		System.out.println("\nCódigo do maior aluno: " + codA + " com altura de: " + maior + "\nCódigo do menor aluno: " + codB + " com altura de: " + menor);
		
		entrada.close();
	}
}