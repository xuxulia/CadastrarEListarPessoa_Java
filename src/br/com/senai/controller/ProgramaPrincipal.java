package br.com.senai.controller;
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PessoaService pessoaService = new PessoaService();

        while (true) {
            System.out.println("-------- Menu --------");
            System.out.println("1) Cadastrar");
            System.out.println("2) Listar");
            System.out.println("3) Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    pessoaService.cadastrarPessoa();
                    break;
                case 2:
                    pessoaService.listarPessoas();
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
            }
        }
    }
}

