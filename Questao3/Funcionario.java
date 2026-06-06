package Questao3;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    protected double salarioBase;

    private static int totalFuncionarios = 0;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        totalFuncionarios++;
    }

    public abstract double calcularSalarioLiquido();

    public void aumentarSalario(double valor) {
        salarioBase += valor;
    }

    public void aumentarSalario(double valor, boolean ehPercentual) {
        if (ehPercentual) {
            salarioBase += salarioBase * (valor / 100);
        } else {
            aumentarSalario(valor);
        }
    }

    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}