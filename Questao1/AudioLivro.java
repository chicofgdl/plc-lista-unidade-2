package Questao1;

import java.util.ArrayList;

public class AudioLivro extends Midia implements Avaliavel {
    private String narrador;
    private ArrayList<Integer> notas;

    public AudioLivro(String titulo, String autor, int duracaoEmSegundos, String narrador) {
        super(titulo, autor, duracaoEmSegundos);
        this.narrador = narrador;
        this.notas = new ArrayList<>();
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo audiolivro: " + titulo + ", narrado por " + narrador);
        incrementarReproducoes();
    }

    @Override
    public String tipoDeMidia() {
        return "Audiolivro";
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
