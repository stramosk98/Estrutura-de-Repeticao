package lista3;
import java.util.Scanner;

public class Exercicio34 {
	public static void main(String[] args) {

			Scanner entrada = new Scanner (System.in);
			int n = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0;

			while(n >= 0) {	
				System.out.print("Informe um n�mero positivo: ");
				n = entrada.nextInt();
				
				if(n >= 0 && n <= 25) {
					n1++;
				}else if(n >= 26 && n <= 50) {
					n2++;
				}else if(n >= 51 && n <= 75) {
					n3++;
				}else if(n >= 76 && n <= 100) {
					n4++;
				}
			}
			
			System.out.println("\n[0-25]   = " + n1 + " N�mero(s)\n[26-50]  = " + n2 + " N�mero(s)\n[51-75]  = " + n3 + " N�mero(s)\n[76-100] = " + n4 + " N�mero(s)");
			
			entrada.close();
	 }
	}