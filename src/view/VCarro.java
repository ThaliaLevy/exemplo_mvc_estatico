package view;

import java.util.Scanner;

import control.Carro;

public class VCarro {

	public void receberInformacoes(Scanner ler) {
		System.out.println("INFORMAÇÕES PARA CADASTRO \n------------------------- ");
		System.out.println("Nome: ");
		String nome = ler.next();
		System.out.println("Marca: ");
		String marca = ler.next();
		System.out.println("Placa: ");
		String placa = ler.next();
		System.out.println("Ano: ");
		int ano = ler.nextInt();
		
		//converter somente para validar se está vazio
		String anoString = String.valueOf(ano);

		if (nome.isEmpty() || marca.isEmpty() || placa.isEmpty() || anoString.isEmpty()) {
			System.out.println("Dados devem estar preenchidos!");
		} else {
			Carro c = new Carro(nome, placa, marca, ano);

			if (c.tratarDados() == true) {
				System.out.println("Cadastro realizado!");
			} else {
				System.out.println("Erro ao cadastrar.");
			}
		}

	}
}
