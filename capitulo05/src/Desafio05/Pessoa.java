/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio05;

/**
 *
 * @author ficdev
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);
        pessoa.exibirDetalhes();
    }
}
