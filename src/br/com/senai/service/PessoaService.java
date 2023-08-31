package br.com.senai.service;

import br.com.senai.entity.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaService {
    private List<Pessoa> pessoas;

    public PessoaService() {
        pessoas = new ArrayList<>();
    }

    public void cadastrarPessoa() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Informe a idade da pessoa: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.print("Informe a altura da pessoa: ");
            double altura = Double.parseDouble(scanner.nextLine());

            pessoas.add(new Pessoa(nome, idade, altura));

            System.out.print("Deseja cadastrar outra pessoa? (sim/não): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("não")) {
                break;
            }
        }
    }

    public void listarPessoas() {
        System.out.println("Pessoas cadastradas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}

