package Questao3;

public class TecnicoAdministrativo extends Funcionario {
    private int nivel;

    public TecnicoAdministrativo(String nome, String cpf, double salarioBase, int nivel) {
        super(nome, cpf, salarioBase);
        this.nivel = nivel;
    }

    @Override
    public double calcularSalarioLiquido() {
        double salarioComAdicional = salarioBase + (nivel * 200);
        return salarioComAdicional * 0.89;
    }
}
