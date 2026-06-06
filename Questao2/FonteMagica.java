package Questao2;

public class FonteMagica implements Restauracao {
    private double eficiencia;

    public FonteMagica(double eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public void restaurar(Personagem personagem, double quantidadeRecuperada)
            throws EnergiaIncompativelException {

        if (personagem.getTipo() != TipoEnergia.MANA) {
            throw new EnergiaIncompativelException(
                    "Esse personagem não usa mana. Por conta disso ele não pode descansar na fonte magica."
            );
        }

        double energiaAntes = personagem.getEnergiaAtual();

        double novaEnergia = energiaAntes + quantidadeRecuperada;

        if (novaEnergia > personagem.getEnergiaMaxima()) {
            novaEnergia = personagem.getEnergiaMaxima();
        }

        personagem.setEnergiaAtual(novaEnergia);

        double energiaRecuperada = novaEnergia - energiaAntes;

        System.out.println("Mana restaurada.");
        calcularDuracao(energiaRecuperada);
    }

    @Override
    public void calcularDuracao(double quantidadeRecuperada) {
        double duracao = quantidadeRecuperada / eficiencia;

        System.out.println("Quantidade recuperada: " + quantidadeRecuperada);
        System.out.println("Duração do descanso: " + duracao + " segundos");
    }
}
