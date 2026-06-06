package Questao2;

public class Fogueira implements Restauracao {
    private double eficiencia;

    public Fogueira(double eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public void restaurar(Personagem personagem, double quantidadeRecuperada) {
        double vidaAntes = personagem.getVidaAtual();

        double novaVida = vidaAntes + quantidadeRecuperada;

        if (novaVida > personagem.getVidaMaxima()) {
            novaVida = personagem.getVidaMaxima();
        }

        personagem.setVidaAtual(novaVida);

        double vidaRecuperada = novaVida - vidaAntes;

        System.out.println("Vida restaurada.");
        calcularDuracao(vidaRecuperada);
    }

    @Override
    public void calcularDuracao(double quantidadeRecuperada) {
        double duracao = quantidadeRecuperada / eficiencia;

        System.out.println("Quantidade recuperada: " + quantidadeRecuperada);
        System.out.println("Duração do descanso: " + duracao + " segundos");
    }
}