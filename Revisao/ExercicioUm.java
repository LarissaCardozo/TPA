package revisaoJava;
import java.util.Scanner;
public class ExercicioUm {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        System.out.println("Entre aqui com um número");
		num = scanner.nextInt();
		
		if (num>=0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
	}
	
}
