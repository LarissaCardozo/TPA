package tparepositorio;
import java.util.Scanner;

public class vetorDois {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tam = 5;
        
        int[] A = new int[tam];

        System.out.println("Digite 5 números:");
        for (int i = 0; i<tam; i++) {
            System.out.print("Número "+ (i+1) +": ");
            A[i] = in.nextInt();
            
            System.out.println("Tabuada do número " + A[i] + ":");
                for (int j = 0; j <= 10; j++) {
                    int resultado = A[i] * j;
                    System.out.println(A[i] + " x " + j + " = " + resultado);
                }
        }
        in.close();
    }
}
