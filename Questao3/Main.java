package Questao3;

public class Main {
    public static void main(String[] args) {
        Funcionario professor = new Professor("Andre", "111.111.111-11", 5000, 3);
        Funcionario tecnico = new TecnicoAdministrativo("Chico", "222.222.222-22", 6000, 4);
        Funcionario reitor = new Reitor("Alberto", "333.333.333-33", 10000, 5000);

        Funcionario[] funcionarios = { professor, tecnico, reitor };

        System.out.println("Salários líquidos iniciais:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + ": R$ " + funcionario.calcularSalarioLiquido());
        }

        System.out.println();

        professor.aumentarSalario(500);
        System.out.println("Após aumento fixo do professor:");
        System.out.println(professor.getNome() + ": R$ " + professor.calcularSalarioLiquido());

        System.out.println();

        tecnico.aumentarSalario(10, true);
        System.out.println("Após aumento percentual do técnico:");
        System.out.println(tecnico.getNome() + ": R$ " + tecnico.calcularSalarioLiquido());

        System.out.println();

        System.out.println("Bônus dos funcionários bonificáveis:");
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Bonificavel) {
                Bonificavel bonificavel = (Bonificavel) funcionario;
                System.out.println(funcionario.getNome() + ": R$ " + bonificavel.calcularBonus());
            }
        }

        System.out.println();

        System.out.println("Quantidade de funcionários cadastrados: " + Funcionario.getTotalFuncionarios());
    }
}
