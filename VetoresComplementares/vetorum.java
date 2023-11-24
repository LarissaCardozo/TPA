package tparepositorio;
import java.util.Scanner;

public class vetorum {
	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        // definindo tam vetor
	        int tam = 20;

	        // definindo A e B
	        int[] A = new int[tam];
	        int[] B = new int[tam];

	        // lendo A
	        System.out.println("Digite os elementos do vetor A:");

	        for (int i = 0; i < tam; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            A[i] = in.nextInt();
	        }

	        // separando 
	        int par = 0;
	        int impar = tam / 2; // se tam é ímpar

	        for (int i = 0; i < tam; i++) {
	            if (A[i] % 2 == 0) {
	                B[par] = A[i];
	                par++;
	            } else {
	                B[impar] = A[i];
	                impar++;
	            }
	        }

	        // printando B par
	        System.out.println("Números pares:");
	        for (int i = 0; i < tam / 2; i++) {
	            System.out.print(B[i] + " ");
	        }

	        // printando B impar
	        System.out.println("\nNúmeros impares:");
	        for (int i = tam / 2; i < tam; i++) {
	            System.out.print(B[i] + " ");
	        }

	        in.close();
	    }
	}

