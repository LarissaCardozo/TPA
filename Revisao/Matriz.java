package revisaoJava;

public class Matriz {
	public static void main(String[] args) {
		double[][] notas = {
				{10.0, 7.0, 9.0, 9.5},
				{9.0, 8.0, 7.0, 9.0},
				{8.0, 9.0, 10.0, 7.9},
	};
		
	for(int i=0; i<notas.length; i++) {
		System.out.print("Aluno "+ (i+1) +" Notas: ");

		for(int j=0; j<notas[i].length; j++) {
			System.out.print( notas[i][j] +"; ");
	}
		System.out.println();
	}
}
}