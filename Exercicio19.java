package lista3;
import java.util.Scanner;
public class Exercicio19 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int n = 0, p = 0, div = 0;
			
			System.out.print("Digite a quantidade de números que deseja checar: ");
			n = entrada.nextInt();
			
			for (int i = 1; i <= n; i++) {
				p = 0; 
				div = 0;
					for (int j = i; j >= 1; j--) {
						div++;
						if(i % j == 0) {
							p++;	
						}	
					}
					
					if(p == 2) {
						System.out.println(i + " é primo, número de divisões: " + div);
					}else {
						System.out.println(i + " não é primo");
					}
			}
			
			entrada.close();
		}
	}