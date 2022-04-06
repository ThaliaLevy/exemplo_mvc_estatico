package _principal;

import java.util.Scanner;

import view.VCarro;

public class principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("Digite a opção correspondente ao que deseja: ");
			System.out.println("1 - Criar cadastro;");
			System.out.println("2 - Localizar cadastro;");
			System.out.println("3 - Atualizar cadastro;");
			System.out.println("4 - Deleter cadastro;");
			System.out.println("0 - Finalizar programa.");
			opcao = ler.nextInt();

			switch (opcao) {
			case 1: {
				VCarro vc = new VCarro();
				vc.receberInformacoes(ler);
				break;
			}
			case 2: {
				//vc.localizar
				break;
			}
			case 3: {
				//vc.atualizar
				break;
			}
			case 4: {
				//vc.deletar
				break;
			}
			case 0: {
				System.out.println("Fechando o programa...");
				break;
			}
			default: {
				break;
			}

			}

		} while (opcao != 0);

		ler.close();
	}
}
