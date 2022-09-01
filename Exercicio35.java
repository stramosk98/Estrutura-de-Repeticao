package lista3;
import java.util.Scanner;

public class Exercicio35 {
	public static void main(String[] args) {

			Scanner entrada = new Scanner (System.in);
			int v = 0, menu, u = 0;
			float tot = 0, cq = 0, bs = 0, bo = 0, ham = 0, che = 0, re = 0;
			
			while(true) {	
			System.out.println("\nOQUE DESEJA FAZER?\n");
			System.out.println("1 - FAZER UM PEDIDO");
			System.out.println("2 - VER COMANDA");
			System.out.println("3 - ENCERRAR PEDIDO");
			System.out.print("usuário: ");
			menu = entrada.nextInt();
			
			if(menu == 1) {
				while(true) {
					System.out.println("\n    ITEM       		CÓDIGO\n"
						+ "Cachorro Quente 	100\r\n"
				  		+ "Bauru Simples  	 	101\r\n"
				  		+ "Bauru com ovo 	 	102\r\n"
				  		+ "Hambúrguer    	 	103\r\n"
				  		+ "Cheeseburguer 	 	104\r\n"
				  		+ "Refrigerante  		105");
					
				System.out.print("\nDigite o código do item: ");
				v = entrada.nextInt();
				
				while(v >= 100 && v <= 106) {
				
					System.out.print("\nQuantas unidades do item o cliente deseja? ");
					u = entrada.nextInt();
					break;
				}
					if(v == 100) {
						cq += (u * 1.20);
						System.out.println("\n" + u + " unidade(s) de Cachorro Quente adicionado(s)");
					}else if(v == 101) {
						bs += (u * 1.30);
						System.out.println("\n" + u + " unidade(s) de Bauru Simples adicionado(s)");
					}else if(v == 102) {
						bo += (u * 1.50);
						System.out.println("\n" + u + " unidade(s) de Bauru com ovo adicionado(s)");
					}else if(v == 103) {
						ham += (u * 1.20);
						System.out.println("\n" + u + " unidade(s) de Hambúrguer adicionado(s)");
					}else if(v == 104) {
						che += (u * 1.30);
						System.out.println("\n" + u + " unidade(s) de Cheeseburguer adicionado(s)");
					}else if(v == 105) {
						re += (u * 1);
						System.out.println("\n" + u + " unidade(s) de Refrigerante adicionado(s)");
					}else {
					System.out.println("\nCódigo não encontrado\n");
					}
					
				System.out.print("\nDeseja adicionar um novo item? 1 - SIM, 2 - NÃO\nusuário: ");
				int r = entrada.nextInt();
				if(r == 2) {
					break;
			  }
			 }
			}	
			if(menu == 2) {
				tot = (cq + bs + bo + ham + che + re);
				System.out.println("\n   	-->COMANDA<--\n"
						+ "Cachorro Quente  	" + Math.round((cq / 1.20)) + "x  R$" + cq + "\r\n"
				  		+ "Bauru Simples  	 	" + Math.round((bs / 1.30)) + "x  R$" + bs + "\r\n"
				  		+ "Bauru com ovo 	 	" + Math.round((bo / 1.50)) + "x  R$" + bo + "\r\n"
				  		+ "Hambúrguer    	 	" + Math.round((ham / 1.20)) + "x  R$" + ham + "\r\n"
				  		+ "Cheeseburguer 	 	" + Math.round((che / 1.30)) + "x  R$" + che + "\r\n"
				  		+ "Refrigerante  		" + Math.round((re / 1)) + "x  R$" + re + "\r\n"
				  		+ "Total à pagar: R$" + tot);
			}
			
			if(menu == 3) {
				System.out.println("\nAgradecemos a preferência");
			break;
			}
			}
	
			entrada.close();
	 }
	}