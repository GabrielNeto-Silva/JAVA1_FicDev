/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorDeTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao, int prioridade) {
        Tarefa novaTarefa = new Tarefa(descricao, prioridade);
        tarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void marcarComoConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            Tarefa tarefa = tarefas.get(indice);
            tarefa.setConcluida(true);
            System.out.println("Tarefa marcada como concluída!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void exibirTarefas() {
        System.out.println("Lista de tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            System.out.println(i + " - " + tarefa.getDescricao() + " (Prioridade: " + tarefa.getPrioridade() + ", Concluída: " + tarefa.isConcluida() + ")");
        }
    }

    public static void main(String[] args) {
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== GERENCIADOR DE TAREFAS =====");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Marcar tarefa como concluída");
            System.out.println("3. Exibir tarefas");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Digite a prioridade da tarefa (1-5): ");
                    int prioridade = scanner.nextInt();
                    gerenciador.adicionarTarefa(descricao, prioridade);
                    break;
                case 2:
                    System.out.print("Digite o índice da tarefa a ser marcada como concluída: ");
                    int indice = scanner.nextInt();
                    gerenciador.marcarComoConcluida(indice);
                    break;
                case 3:
                    gerenciador.exibirTarefas();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
