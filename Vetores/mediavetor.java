package vetores;

import java.util.Scanner;
public class mediavetor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[], b[], i;
		a = new int [TAM];
		b = new int [TAM];

		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = in.nextInt();
		}
		
		for (i=0; i<1; i++) {
			b[i] = a[i]+b[i]/10;
			System.out.println("A media é "+b[i]);
		}
	}

}
