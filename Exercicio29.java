package lista3;
import java.util.Scanner;

public class Exercicio29 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i = 1, j = 0;
		
		System.out.print("Digite o número da tabuada que desejar: ");
		int tab = entrada.nextInt();
		
		while(i > j) {
		System.out.print("Iniciar a multiplicar a partir do N°: ");
		i = entrada.nextInt();
		
		System.out.print("Parar de multiplicar no N°: ");
		j = entrada.nextInt();
		
		if(i > j) {
			System.out.println("\nO número inicial não pode ser maior que o final\n");
		}
		}
		
		for (int k = i; k <= j; k++) {
			System.out.println(tab + " X " + k + " = " + (tab * k));
		}
		
		entrada.close();
	}
}