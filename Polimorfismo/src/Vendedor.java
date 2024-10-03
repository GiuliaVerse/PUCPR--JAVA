
public class Vendedor extends Funcionario {
	private double percComissao;
	private double valorVendas;
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(int matricula, String nome, double salarioBase, double horasMes, double percComissao) {
		super(matricula, nome, salarioBase, horasMes);
		this.percComissao = percComissao;
	}
	
	public double calcularSalario() {
		double salario = salarioBase * (horasTrabalhadas / horasMes);
		salario = salario + salario * percComissao;
		return salario;
	}		
	
	public void definirValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
		System.out.println("[Vendedor] Valor de vendas no mes: R$ " + valorVendas);
	}
}
