package lista3;
import java.util.Scanner;
public class Exercicio06 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
	
				for (int i = 1; i <= 50; i++) {
					if(i % 2 == 1)
					System.out.print(i + "|");
				}
				
			entrada.close();
		}
	}