package Questao3;

public class Reitor extends Funcionario implements Bonificavel {
    private double gratificacaoCargo;

    public Reitor(String nome, String cpf, double salarioBase, double gratificacaoCargo) {
        super(nome, cpf, salarioBase);
        this.gratificacaoCargo = gratificacaoCargo;
    }

    @Override
    public double calcularSalarioLiquido() {
        double salarioComGratificacao = salarioBase + gratificacaoCargo;
        return salarioComGratificacao * 0.89;
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.20;
    }
}
