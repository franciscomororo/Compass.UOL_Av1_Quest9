package bonificacao;

public class Funcionario {
	private String nome;
	private double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void calcularSalario() {
		
		if (salario <= 1000) {
			System.out.printf("Bonus: R$ %.2f%n", 0.2 * salario);
			salario = salario + (0.2 * salario);
			System.out.printf("Salário Liquido: R$ %.2f%n%n", salario);
		} else if (salario > 1000 && salario < 2000) {
			System.out.printf("Bonus: R$ %.2f%n", 0.1 * salario);
			salario = salario + (0.1 * salario);
			System.out.printf("Salário Liquido: R$ %.2f%n%n", salario );
		} else {
			System.out.printf("Desconto: R$ %.2f%n", 0.1 * salario);
			salario = salario - (0.1 * salario);
			System.out.printf("Salário Liquido: R$ %.2f%n%n", salario);
		}
		
	}

}
