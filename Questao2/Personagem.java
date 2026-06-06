package Questao2;

public class Personagem {
    private double vidaAtual;
    private double vidaMaxima;
    private double energiaAtual;
    private double energiaMaxima;
    private TipoEnergia tipo;

    public Personagem(double vidaAtual, double vidaMaxima, double energiaAtual, double energiaMaxima, TipoEnergia tipo) {
        this.vidaAtual = vidaAtual;
        this.vidaMaxima = vidaMaxima;
        this.energiaAtual = energiaAtual;
        this.energiaMaxima = energiaMaxima;
        this.tipo = tipo;
    }

    public double getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(double vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public double getVidaMaxima() {
        return vidaMaxima;
    }

    public double getEnergiaAtual() {
        return energiaAtual;
    }

    public void setEnergiaAtual(double energiaAtual) {
        this.energiaAtual = energiaAtual;
    }

    public double getEnergiaMaxima() {
        return energiaMaxima;
    }

    public TipoEnergia getTipo() {
        return tipo;
    }
}