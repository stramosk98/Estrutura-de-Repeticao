package lista3;
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int num = 11;
		
		while(num <= 0 || num >= 10) {
			System.out.print("Digite um n�mero: ");
			num = entrada.nextInt();
			if(num <= 0 || num >= 10) {
			System.out.println("N�mero inv�lido");
			}
			}
		System.out.println("N�mero v�lido");
		entrada.close();
	}

}
