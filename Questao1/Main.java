package Questao1;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica("Dedicado a ela", "Arthur Verocai", 213, "MPB");
        Podcast podcast = new Podcast("Os últimos de Rick and Morty", "Quadro em Branco", 4300, 5);
        AudioLivro audioLivro = new AudioLivro("O Estrangeiro", "Albert Camus", 7200, "Chico");

        musica.reproduzir();
        podcast.reproduzir();
        audioLivro.reproduzir();
        musica.reproduzir(1.5);

        musica.avaliar(5);
        musica.avaliar(5);
        musica.avaliar(5);
        musica.avaliar(4);
        musica.avaliar(5);

        audioLivro.avaliar(4);
        audioLivro.avaliar(5);
        audioLivro.avaliar(5);
        audioLivro.avaliar(5);
        audioLivro.avaliar(3);

        System.out.println("Média da música: " + musica.getMediaAvaliacoes());
        System.out.println("Média do audiolivro: " + audioLivro.getMediaAvaliacoes());
        System.out.println("Total de reproduções da plataforma: " + Midia.getTotalReproducoes());
    }
}
