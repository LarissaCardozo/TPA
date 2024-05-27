package herancaArea;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		Figura Figura = new Figura();
		
		System.out.println("Digite a altura da figura:");
		Figura.setAltura(in.nextInt());
		
		System.out.println("Digite a largura da figura:");
		Figura.setLargura(in.nextInt());
		
		Figura.calcularArea();
		Figura.exibirArea();

	
	//TRIANGULO
	Triangulo Triangulo = new Triangulo();
	
	System.out.println("Digite a altura do triângulo:");
	Triangulo.setAltura(in.nextInt());
	
	System.out.println("Digite o valor da base do triângulo");
	Triangulo.setBase(in.nextInt());
	
	Triangulo.calcularArea();
	Triangulo.exibirArea();
	
	//LOSANGO
	Losango Losango = new Losango();
	
	System.out.println("Digite a diagonal MAIOR do losango:");
	Losango.setDiagonalMaior(in.nextInt());
	
	System.out.println("Digite a diagonal MENOR do losango");
	Losango.setDiagonalMenor(in.nextInt());
	
	Losango.calcularArea();
	Losango.exibirArea();
	
	//QUADRADO
	Quadrado Quadrado = new Quadrado();
	
	System.out.println("Digite a altura do quadrado:");
	Quadrado.setAltura(in.nextInt());
	
	System.out.println("Digite a base da quadrado:");
	Quadrado.setLargura(in.nextInt());
	
	Quadrado.calcularArea();
	Quadrado.exibirArea();

	}
}

