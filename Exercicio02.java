package lista3;
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String user = "abc", senha = "abc";
		
		while(user.equals(senha)) {
			
		System.out.print("Digite seu nome de usu�rio: ");
		user = entrada.nextLine();
		
		System.out.print("Digite sua senha: ");
		senha = entrada.nextLine();
		
		if(user.equals(senha)) {
			System.out.println("Usu�rio e senha n�o podem ser iguais");
		}
		}
		
		entrada.close();
	}

}
