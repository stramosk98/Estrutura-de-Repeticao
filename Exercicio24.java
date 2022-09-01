package lista3;
import java.util.Scanner;
public class Exercicio24 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int cd = 0;
			float media = 0, val = 0, tot = 0;
			
			System.out.print("Quantos CDs o colecionador possui: ");
			cd = entrada.nextInt();
				
			for (int i = 0; i < cd; i++) {
				System.out.print("Valor do CD "  + (i + 1) + ": ");
				val = entrada.nextFloat();
				tot += val;
			}
			
			media = (tot / (float)cd);
			System.out.println("\nValor total investido: R$ " + tot + "\nValor medio gasto nos CDs: R$ " + media);
			
			entrada.close();
		}
	}