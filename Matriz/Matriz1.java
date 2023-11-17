package tpaRepositorio;

public class Matriz1 {
    public static void main(String[] args) 
    {
    	int[][] matriz = {
                {1, 2, 3, 0},
                {4, 5, 6, 0},
                {7, 8, 9, 0}
    };

        // soma de cada linha e preenche a última coluna
        for (int i=0; i<3; i++) {
            int soma = 0;
            for (int j = 0; j <4; j++) {
                soma += matriz[i][j];
            }
            matriz[i][3] = soma;
        }

        for (int i=0; i<3; i++) {
            for (int j = 0; j <4; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
    }
}
