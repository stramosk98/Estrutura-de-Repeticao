package lista3;
import java.util.Scanner;

public class Exercicio32 {
	public static void main(String[] args) {

			Scanner entrada = new Scanner (System.in);
			int maior = 0, menor = 0, sum = 0, sumAci = 0, cont = 0;
			float media = 0, mediaAci = 0;
			String[] cid = new String [6];
			String cidB = "", cidS = "";
			int[] cod = new int [6];
			int[] car = new int [6];
			int[] aci = new int [6];
			
			cid[1] = "Florianópolis"; cid[2] = "São Paulo"; cid[3] = "Palmas"; cid[4] = "Bélem"; cid[5] = "Tocantins";
			
			for (int i = 1; i < 6; i++) {
				System.out.print("\nInforme o código respectivo de " + cid[i] + ": ");
				cod[i] = entrada.nextInt();
				
				System.out.print("Informe o número de carros de passeio (em 1999), respectivos de " + cid[i] + ": ");
				car[i] = entrada.nextInt();
				sum += car[i];
				
				System.out.print("Informe o número de acidentes de trânsito com vítimas (em 1999), respectivos de " + cid[i] + ": ");
				aci[i] = entrada.nextInt();	
				
				if(car[i] < 2000) {
					sumAci += aci[i];
					cont++;
				}
				
				if(i == 1) {
					menor = aci[i];
					maior = aci[i];
					cidB = cid[i];
					cidS = cid[i];
					
				}else {
					
					if(aci[i] > maior) {
						maior = aci[i];
						 cidB = cid[i];
					}
					
					if(aci[i] < menor) {
						menor = aci[i];
						 cidS = cid[i];
					}
				}
			}
			
			media = (sum / 5);
			mediaAci = (sumAci / cont);
			
			System.out.println("\nMaior índice de acidentes pertence a cidade de " + cidB + " com " + maior + " acidentes \nMenor índice de acidentes pertence a cidade de " + cidS + " com " + menor + " acidentes");
			System.out.println("Média de carros das cinco cidades: " + media);
			System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " + mediaAci);
			
			entrada.close();
	 }
	}