package lista3;
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String nome = "abc", sexo = "g", civil = "l";
		int idade = 151;
		float sal = -1;
		
		while(nome.length() <= 3) {
			
		System.out.print("Digite seu nome: ");
		nome = entrada.nextLine();
		
		if(nome.length() <= 3) {
			System.out.println("O nome precisa ter mais de 3 letras\n");
			}
		}
		
		while(idade < 0 || idade > 150) {
			System.out.print("Digite a sua idade: ");
			idade = entrada.nextInt();
			
			if(idade < 0 || idade > 150) {
				System.out.println("A idade não pode ser menor que 0 e nem maior que 150\n");
			}
		}
		
		while(sal < 0) {
			System.out.print("Digite seu salário: ");
			sal = entrada.nextFloat();
			
			if(sal < 0) {
				System.out.println("O salário não pode ser menor que zero\n");
			}
		}
		
			entrada.nextLine();
			
		while (true) {
			System.out.print("Digite seu sexo('f' ou 'm'): ");
			sexo = entrada.nextLine();
			
			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				break;
			}else {
				System.out.println("Character inválido\n");
			}
		}
		
		while(true) {
			System.out.print("Digite seu estado civil('s', 'c', 'v', 'd'): ");
			civil = entrada.nextLine();
			
			if(civil.equalsIgnoreCase("s") || civil.equalsIgnoreCase("c") || civil.equalsIgnoreCase("v") || civil.equalsIgnoreCase("d")) {
				break;
			}else {
				System.out.println("Character inválido\n");
			}
		}
		
		System.out.println("\nTodas informações foram validadas!\nNome: " + nome + "\nIdade: " + idade + "\nSalário: R$" + sal + "\nSexo: " + sexo + "\nEstado Civil: " + civil);
		
		
		entrada.close();
	}

}
