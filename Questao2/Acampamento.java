package Questao2;

public class Acampamento implements Restauracao {
    private double eficiencia;

    public Acampamento(double eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public void restaurar(Personagem personagem, double quantidadeRecuperada)
            throws EnergiaIncompativelException {

        if (personagem.getTipo() != TipoEnergia.ESTAMINA) {
            throw new EnergiaIncompativelException(
                    "Esse personagem não usa estamina. Por conta disso não pode descansar no acampamento."
            );
        }

        double energiaAntes = personagem.getEnergiaAtual();

        double novaEnergia = energiaAntes + quantidadeRecuperada;

        if (novaEnergia > personagem.getEnergiaMaxima()) {
            novaEnergia = personagem.getEnergiaMaxima();
        }

        personagem.setEnergiaAtual(novaEnergia);

        double energiaRecuperada = novaEnergia - energiaAntes;

        System.out.println("Estamina restaurada com sucesso.");
        calcularDuracao(energiaRecuperada);
    }

    @Override
    public void calcularDuracao(double quantidadeRecuperada) {
        double duracao = quantidadeRecuperada / eficiencia;

        System.out.println("Quantidade recuperada: " + quantidadeRecuperada);
        System.out.println("Duração do descanso: " + duracao + " segundos");
    }
}