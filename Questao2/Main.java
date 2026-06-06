package Questao2;

public class Main {
    public static void main(String[] args) {
        Personagem mago = new Personagem(400, 1000, 20, 80, TipoEnergia.MANA);
        Personagem guerreiro = new Personagem(700, 1400, 30, 100, TipoEnergia.ESTAMINA);

        Fogueira fogueira = new Fogueira(10);
        FonteMagica fonteMagica = new FonteMagica(8);
        Acampamento acampamento = new Acampamento(5);

        try {
            System.out.println("----- Restauração de vida -----");
            fogueira.restaurar(mago, 600);
            System.out.println("Vida atual do mago: " + mago.getVidaAtual());
            System.out.println();

            System.out.println("----- Restauração de mana -----");
            fonteMagica.restaurar(mago, 40);
            System.out.println("Mana atual do mago: " + mago.getEnergiaAtual());
            System.out.println();

            System.out.println("----- Restauração de estamina -----");
            acampamento.restaurar(guerreiro, 50);
            System.out.println("Estamina atual do guerreiro: " + guerreiro.getEnergiaAtual());
            System.out.println();

            System.out.println("----- Restauração de energia incompatível -----");
            fonteMagica.restaurar(guerreiro, 40);
            acampamento.restaurar(mago, 50); // Tem que colocar na linha de cima para printar, pois o erro para a execução.

        } catch (EnergiaIncompativelException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
    }
}