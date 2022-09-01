package lista3;
import java.util.Scanner;
public class Exercicio15 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int a = 37, b = 38, c = 1;
			float sum = 0;
			
			System.out.print("S = ");
			
			for(int i = 0; i < 37; i++) {
				System.out.print("(" + a + "*" + b + ")/" + c + " + ");
				sum += ((a * b) / c);
				a--;
				b--;
				c++;
				
			}
			
			System.out.println("\nSoma = " + sum);
			
			entrada.close();
		}
	}