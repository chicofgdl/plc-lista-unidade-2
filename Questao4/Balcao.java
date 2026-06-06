package Questao4;

import java.util.LinkedList;
import java.util.Queue;

public class Balcao {
    private String nome;
    private int capacidade;
    private Queue<Ingrediente> ingredientes;

    public Balcao(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.ingredientes = new LinkedList<>();
    }

    public synchronized void colocar(Ingrediente ingrediente) throws InterruptedException {
        while (ingredientes.size() == capacidade) {
            System.out.println(nome + " cheio. Aprendiz aguardando espaço...");
            wait();
        }

        ingredientes.add(ingrediente);
        System.out.println("Ingrediente colocado no " + nome + ": " + ingrediente.getNome());

        notifyAll();
    }

    public synchronized void retirar(Ingrediente ingrediente) throws InterruptedException {
        while (ingredientes.isEmpty()) {
            System.out.println(nome + " vazio. Chefe aguardando ingrediente...");
            wait();
        }

        Ingrediente retirado = ingredientes.poll();
        System.out.println("Ingrediente retirado do " + nome + ": " + retirado.getNome());

        notifyAll();
    }
}