package view;

import java.util.Scanner;

import control.Carro;

public class VCarro {

	public void receberInformacoes(Scanner ler) {
		System.out.println("Digite: \nNome: ");
		String nome = ler.nextLine();
		System.out.println("Marca: ");
		String marca = ler.nextLine();
		System.out.println("Placa: ");
		String placa = ler.nextLine();
		System.out.println("Ano: ");
		int ano = ler.nextInt();

		Carro c = new Carro(nome, placa, marca, ano);

		if (c.tratarDados() == true) {
			System.out.println("Cadastro realizado!");
		} else {
			System.out.println("Erro ao cadastrar.");
		}
	}
}
