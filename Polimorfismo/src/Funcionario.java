
public class Funcionario {
	// atributos
	protected int matricula;
	protected String nome;
	protected double salarioBase;
	protected double horasMes;
	
	protected double horasTrabalhadas;
	
	// Construtor sem parametros
	public Funcionario() {	
	}
	
	// Construtor com parametros
	public Funcionario(int matricula, String nome, double salarioBase, double horasMes) {
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.horasMes = horasMes;
	}
	
	public void imprimeDados() {
		System.out.println("Matricula...: " + matricula);
		System.out.println("Nome........: " + nome);
		System.out.println("Salario base: R$ " + salarioBase);
	}
	
	public void definirHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double calcularSalario() {
		double salario = salarioBase * (horasTrabalhadas / horasMes); 
		return salario;
	}		
}
