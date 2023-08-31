package br.com.senai.entity;

    public class Pessoa {
        private String nome;
        private int idade;
        private double altura;

        public Pessoa(String nome, int idade, double altura) {
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura;
        }
    }

