package tpaRepositorio;

import java.util.Random;
public class Matriz2 {
	public static void main(String[] args) {
		Random in = new Random();
		
		int matriz[][] = new int [3][3];
		
		int i, j, menor=Integer.MAX_VALUE, maior=Integer.MIN_VALUE ;
		int linhaMaior = in.nextInt();
		int colunaMaior= in.nextInt();
		int colunaMenor= in.nextInt();
		int linhaMenor = in.nextInt();
		
		for (i=0; i<3; i++) {
			for (j=0; j<3; j++) {
				matriz[i][j] = in.nextInt(50);
				 if (matriz[i][j]>maior) {
					 maior = matriz[i][j];
					 linhaMaior = i;
					 colunaMaior = j;
				 } else  if (matriz[i][j]<menor) {
						 menor = matriz[i][j];
						 linhaMenor = i;
						 colunaMenor = j;
				 }
			}
		}
		for (i=0; i<3; i++) {
			for (j=0; j<3; j++) {
				if(j==0) {
					System.out.print("["+matriz[i][j]+" ");
				}else if(j==2) {
					System.out.print(matriz[i][j]+"]\n");
				} else {
						System.out.print(""+ matriz[i][j]);	
				}
			}
		}
				System.out.println("\nO maior número é: " + maior);
				System.out.println("O menor número é: " + menor);
			   System.out.println("\nO maior número está na posição: " +linhaMaior+ ", "+colunaMaior);
			   System.out.println("O menor número está na posição: " +linhaMenor+ ", "+colunaMenor);
		}			
}