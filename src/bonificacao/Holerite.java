package bonificacao;

import java.util.Scanner;

public class Holerite {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a quantidade de funcionários: ");
		int numeroFuncionarios = entrada.nextInt();
		Funcionario[] funcionarios = new Funcionario[numeroFuncionarios];

		for (int i = 0; i < numeroFuncionarios; i++) {
			entrada.nextLine();
			funcionarios[i] = new Funcionario();
			System.out.println("Digite o nome do funcionário: ");
			funcionarios[i].setNome(entrada.nextLine());

			System.out.println("Digite o salário do funcionário: ");
			funcionarios[i].setSalario(entrada.nextDouble());

		}
		entrada.close();

		for (int j = 0; j < numeroFuncionarios; j++) {

			System.out.println("Funcionário: " + funcionarios[j].getNome());
			System.out.printf("Salário: R$ %.2f%n", funcionarios[j].getSalario());
			funcionarios[j].calcularSalario();

		}

	}

}
