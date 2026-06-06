package Questao3;

public class Professor extends Funcionario implements Bonificavel {
    private int titulacao;

    public Professor(String nome, String cpf, double salarioBase, int titulacao) {
        super(nome, cpf, salarioBase);
        this.titulacao = titulacao;
    }

    @Override
    public double calcularSalarioLiquido() {
        double salarioComAdicional = salarioBase + (salarioBase * 0.10 * titulacao);
        return salarioComAdicional * 0.89;
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.05 * titulacao;
    }
}
