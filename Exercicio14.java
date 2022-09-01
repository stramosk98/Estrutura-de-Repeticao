package lista3;
import java.util.Scanner;
public class Exercicio14 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int m = 1, n = 1, v = 0;
			
			System.out.print("Valor da série: ");
			v = entrada.nextInt();
			
			System.out.print("S = ");
			
			for(int i = 0; i < v; i++) {
				System.out.print(n + "/" + m + " + ");
				n++;
				m += 2;
			}
			
			entrada.close();
		}
	}