package lista3;
import java.util.Scanner;
public class Exercicio04 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
	
			float popA = 80000, popB = 200000, taxaA = 1.03f, taxaB = 1.015f;
			int ano = 0;
			
			while(popA <= popB) {
				popA *= taxaA;
				popB *= taxaB;
				ano++;
			}
			
			  System.out.print("Populaçao A: " + popA + "\nPopulaçao B: " + popB + "\nlevou " + ano + " anos");
				 
			entrada.close();
		}
	}