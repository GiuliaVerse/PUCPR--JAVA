
public class Main {

	public static void calcularSalarios(Funcionario f) {
		System.out.println("\nCalculando salario...");
		f.imprimeDados();
		System.out.println("Salario calculado: R$" + f.calcularSalario());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario lista[] = new Funcionario[3];
		
		lista[0] = new Gerente(1, "Giulia", 2000, 200, 1000); // Bonus: R$ 1000,00
		lista[1] = new Estagiario(2, "Paulo", 1000, 120, 50);  // Vale transporte: R$ 50,00
		lista[2] = new Vendedor(3, "Jose", 1500, 200, 0.15);    // Comissao: 15%
		
		// Chama métodos específicos de acordo com a instancia
		for( Funcionario f : lista ) {
			// se é uma instancia de Gerente
			if( f instanceof Gerente ) {
				// type cast para Gerente
				((Gerente) f).definirBonus(500); 
				
				// Chama médodo da classe Funcionario;
				f.definirHorasTrabalhadas(200);
			}
			// se é uma instancia de Estagiario
			if( f instanceof Estagiario ) {
				// type cast para Estagiario
				((Estagiario) f).definirDiasTransporte(22);
				
				// Chama médodo da classe Funcionario;
				f.definirHorasTrabalhadas(120);
			}
			// se é uma instancia de Vendedor
			if( f instanceof Vendedor ) {
				// type cast para Vendedor
				((Vendedor) f).definirValorVendas(15000);

				// Chama médodo da classe Funcionario;
				f.definirHorasTrabalhadas(200);
			}
		}		

		// Calcula o salário de todos os funcionários da lista
		for( Funcionario f : lista ) {
			calcularSalarios(f);
		}
		
	}

}
 