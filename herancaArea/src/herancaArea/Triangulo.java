package herancaArea;

public class Triangulo extends Figura {
	
	private int base;
	
	//GET SET
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	//MÉTODOS
	
	@Override
	public int calcularArea() {
		return setArea((this.getAltura()*this.getBase()/2));
	}
	
	public void exibirArea() {
		System.out.println("A área do triângulo é :"+getArea());
		System.out.println(" ");
	}
}