package lista3;
import java.util.Scanner;

public class Exercicio36 {
	public static void main(String[] args) {

			Scanner entrada = new Scanner (System.in);
			int v = 0;
			float percNul = 0, percBra = 0, tot = 0;
			int[] c = new int [7];
			
			while(true) {	
			System.out.println("Digite seu voto, sabendo que:\n1- João, 2- Maria, 3- José, 4- Joana, 5- Nulo, 6- Em Branco");
			v = entrada.nextInt();
		
			if(v == 0) {
			break;
			}
			
			tot++;
			
			for (int i = 1; i < 7; i++) {
				if(v == i) {
					c[i]++;
			  }
			 }
			}
		
			percNul = ((c[5] / tot) * 100);
			percBra = ((c[6] / tot) * 100);
			
			System.out.println("\nTotal de votos para cada candidato:\nCanditado João: " + c[1] + "\nCanditada Maria: " + c[2] + "\nCanditado José: " + c[3] + "\nCanditada Joana: " + c[4] + "\nVoto nulo: " + c[5] + "\nEm Branco: " + c[6]);
			System.out.println("Percentagem de votos nulos sobre o total de votos: " + Math.round(percNul)  + "%\nPercentagem de votos brancos sobre o total de votos: " + Math.round(percBra) + "%");
			
			entrada.close();
	 }
	}