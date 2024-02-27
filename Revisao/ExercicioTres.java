package revisaoJava;
import java.util.Scanner;

public class ExercicioTres {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhaC = 2002;
        int senha;
        
        while (true) {
        	System.out.println("Digite a senha:");
            senha = scanner.nextInt();	
        	
        	if (senha==senhaC) {
        	System.out.println("Acesso permitido");	
        	break;
        }
        	else {
        		System.out.println("Senha Invadlida");
        	}
}
	}
}
