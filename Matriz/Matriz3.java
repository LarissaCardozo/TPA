package tpaRepositorio;

public class Matriz3 {
		public static void main(String [] args) {
		
			int m[][], i, j, multiplo = 1;
			
			m = new int [4][4];
			m [0][0] = 2;
			
			
			for (i=0; i<4; i++) {
				for (j=0; j<4; j++) {
					multiplo = multiplo*2;
					m[i][j]= multiplo;
		 }
		}
			
		System.out.println("O resultado é:");	
		for (i=0; i<4; i++) {
			for (j=0; j<4; j++) {
					System.out.print("["+m[i][j]+"]");
	    if(m[i][j] == m[i][3] ) {
	 
	    System.out.println(" ");
			}
			}
		}
	}
}