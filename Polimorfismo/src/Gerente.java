
public class Gerente extends Funcionario {
	private double bonus;
	
	public Gerente() {
		super();
	}
	
	public Gerente(int matricula, String nome, double salarioBase, double horasMes, double bonus) {
		super(matricula, nome, salarioBase, horasMes);
		this.bonus = bonus;
	}
	
	public double calcularSalario() {
		double salario = salarioBase * (horasTrabalhadas / horasMes); 
		salario = salario + bonus;
		return salario;
	}		
	
	public void definirBonus(double bonus) {
		this.bonus = bonus;
		System.out.println("[Gerente] O bonus foi atualizado para R$ " + bonus);
	}
}
