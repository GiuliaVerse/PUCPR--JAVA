
public class Estagiario extends Funcionario {
	private double valorTransporte;
	private int diasTransporte;
	
	public Estagiario() {
		super();
	}
	
	public Estagiario(int matricula, String nome, double salarioBase, double horasMes, double valorTransporte) {
		super(matricula, nome, salarioBase, horasMes);
		this.valorTransporte = valorTransporte;
	}
	
	public double calcularSalario() {
		double salario = salarioBase * (horasTrabalhadas / horasMes);
		salario = salario + valorTransporte * diasTransporte;
		return salario;
	}		
	
	public void definirDiasTransporte(int diasTransporte) {
		this.diasTransporte = diasTransporte;
		
		System.out.println("[Estagi�rio] Dias de transporte no mês: " + diasTransporte);
	}
}
