import java.util.Scanner;

public class inversaovetores {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		final int TAM=10;
	    int vetorA[], vetorB[], i;
	    vetorA = new int[TAM];
	    vetorB = new int[TAM];
	 
	    
	    for (i=0; i<TAM; i++) {
	        System.out.print("Entre aqui com os números " + (i + 1) + " do vetor A: ");
	        vetorA[i] = in.nextInt();
	    }
	 
	    for (i=0;i<TAM;i++) {
	        vetorB[i] = vetorA[9 - i];
	    }
	 
	    System.out.println("Os números do vetor B são:");
	    for (i=0;i<TAM;i++) {
	        System.out.print(vetorB[i] + " ");
	        
	    }
	    System.out.println();
	 
			}
	 
		}