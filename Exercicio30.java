package lista3;
import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[] args) {

			Scanner entrada = new Scanner (System.in);
			float maior = 0, menor = 0, sumAlt = 0, sumPeso = 0, cont = 0, maiorP = 0, menorP = 0, mediaAlt = 0, mediaPeso = 0, altC = 0, altD = 0, pesoA = 0, pesoB = 0;
			int codA = 0, codB = 0, codC = 0, codD = 0, j = 10;
			int[] cod = new int [6];
			float[] alt = new float [6];
			float[] peso = new float [6];
					
			for (int i = 1; i < j; i++) {	
				System.out.print("\nInforme o seu código de cliente: ");
				cod[i] = entrada.nextInt();
				
				if(cod[i] == 0){
					break;	
					
				}else {
					
					System.out.print("Informe sua altura: ");
				alt[i] = entrada.nextFloat();
				sumAlt += alt[i];
		
				System.out.print("Informe seu peso: ");
				peso[i] = entrada.nextFloat();
				sumPeso += peso[i];
				
				if(i == 1) {
					maior = alt[i];
					codA = cod[i];
					pesoA = peso[i];
					menor = alt[i];
					codB = cod[i];
					pesoB = peso[i];
					maiorP = peso[i];
					codC = cod[i];
					menorP = peso[i];
					codD = cod[i];
					
				}else {
					
					if(alt[i] > maior) {
						maior = alt[i];
						codA = cod[i];
						pesoA = peso[i];
					}
					
					if(alt[i] < menor) {
						menor =alt[i];
						codB = cod[i];
						pesoB = peso[i];
					}
					
					if(peso[i] > maiorP) {
						maiorP = peso[i];
						codC = cod[i];
						altC = alt[i];
					}
					
					if(peso[i] < menorP) {
						menorP =peso[i];
						codD = cod[i];
						altD = alt[i];
					}
				 }
				}
				
				j++;
				cont++;
			}
			
			mediaPeso = (sumPeso / cont);
			mediaAlt = (sumAlt / cont);
			
			System.out.println("Valores do cliente mais alto, código: " + codA + ", Altura: " + maior + " e peso: " + pesoA);
			System.out.println("Valores do cliente mais baixo, código: " + codB + ", Altura: " + menor + " e peso: " + pesoB);
			System.out.println("Valores do cliente mais gordo, código: " + codC + ", Altura: " + altC + " e peso: " + maiorP);
			System.out.println("Valores do cliente mais magro, código: " + codD + ", Altura: " + altD + " e peso: " + menorP);
			System.out.println("Média das alturas dos clientes: " + mediaAlt + " Média do peso dos clientes: " + mediaPeso);
			
			entrada.close();
	 }
	}