package lista3;
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String user = "abc", senha = "abc";
		
		while(user.equals(senha)) {
			
		System.out.print("Digite seu nome de usuário: ");
		user = entrada.nextLine();
		
		System.out.print("Digite sua senha: ");
		senha = entrada.nextLine();
		
		if(user.equals(senha)) {
			System.out.println("Usuário e senha não podem ser iguais");
		}
		}
		
		entrada.close();
	}

}
