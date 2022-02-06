package bonificacao;

import java.util.Scanner;

public class Holerite {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a quantidade de funcion�rios: ");
		int numeroFuncionarios = entrada.nextInt();
		Funcionario[] funcionarios = new Funcionario[numeroFuncionarios];

		for (int i = 0; i < numeroFuncionarios; i++) {
			entrada.nextLine();
			funcionarios[i] = new Funcionario();
			System.out.println("Digite o nome do funcion�rio: ");
			funcionarios[i].setNome(entrada.nextLine());

			System.out.println("Digite o sal�rio do funcion�rio: ");
			funcionarios[i].setSalario(entrada.nextDouble());

		}
		entrada.close();

		for (int j = 0; j < numeroFuncionarios; j++) {

			System.out.println("Funcion�rio: " + funcionarios[j].getNome());
			System.out.printf("Sal�rio: R$ %.2f%n", funcionarios[j].getSalario());
			funcionarios[j].calcularSalario();

		}

	}

}
