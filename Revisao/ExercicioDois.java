package revisaoJava;
import java.util.Scanner;
public class ExercicioDois {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        System.out.println("Entre aqui com um número");
		num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
	}
	
}