package Questao1;

import java.util.ArrayList;

public class Musica extends Midia implements Avaliavel {
    private String genero;
    private ArrayList<Integer> notas;

    public Musica(String titulo, String autor, int duracaoEmSegundos, String genero) {
        super(titulo, autor, duracaoEmSegundos);
        this.genero = genero;
        this.notas = new ArrayList<>();
    }

    @Override
    public void reproduzir() {
        System.out.println("Tocando a música: " + titulo + " - " + autor);
        incrementarReproducoes();
    }

    public void reproduzir(double velocidade) {
        System.out.println("Tocando a música: " + titulo + " em velocidade " + velocidade + "x");
        incrementarReproducoes();
    }

    @Override
    public String tipoDeMidia() {
        return "Música";
    }

    @Override
    public void avaliar(int nota) {
        if (nota >= 1 && nota <= 5) {
            notas.add(nota);
        } else {
            System.out.println("Nota inválida. A nota deve estar entre 1 e 5.");
        }
    }

    @Override
    public double getMediaAvaliacoes() {
        if (notas.isEmpty()) {
            return 0.0;
        }

        int soma = 0;

        for (int nota : notas) {
            soma += nota;
        }

        return (double) soma / notas.size();
    }
}
