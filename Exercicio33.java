package lista3;
import java.util.Scanner;
public class Exercicio33 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float juro;
		int p = 0;
		System.out.print("Digite o valor da sua dívida: ");
		float div = entrada.nextFloat();
		while(true) {
		System.out.print("Em quantas parcelas deseja pagar? (1, 3, 6, 9 ou 12) ");
		p = entrada.nextInt();
		if(p == 1) {
			juro = 0;
			break;
		}else if(p == 3) {
			juro = 10;
			break;
		}else if(p == 6) {
			juro = 15;
			break;
		}else if(p == 9) {
			juro = 20;
			break;
		}else if(p == 12) {
			juro = 25;
			break;
		}else {
			System.out.println("Digite um número de parcelas válido");	
		}
		}
		juro = (juro / 100) * div;
		div += juro;
		System.out.println("Valor da Dívida  Valor dos Juros  Quantidade das Parcelas  Valor da Parcela");
		System.out.println(div + "  " + juro + "  " + p + "  " + (div / p));
		
		entrada.close();
	}

}
