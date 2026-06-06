package Questao1;

public class Podcast extends Midia {
    private int episodio;

    public Podcast(String titulo, String autor, int duracaoEmSegundos, int episodio) {
        super(titulo, autor, duracaoEmSegundos);
        this.episodio = episodio;
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo podcast: " + titulo + " - episódio " + episodio);
        incrementarReproducoes();
    }

    @Override
    public String tipoDeMidia() {
        return "Podcast";
    }
}
