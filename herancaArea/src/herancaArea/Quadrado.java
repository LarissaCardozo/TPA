package herancaArea;

public class Quadrado extends Figura {
	
	@Override
	public int calcularArea() {
		return setArea((getAltura())*getLargura());
	}
	
	public void exibirArea() {
		System.out.println("A área do quadrado é: "+getArea());
		System.out.println(" ");
	}	

}
