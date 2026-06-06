package Questao4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("CASO 1: Balcão com pouco espaço");
        executarCaso(new Balcao("Balcão pequeno", 2), 2, 2, 10);

        System.out.println("\nCASO 2: Capacidade de produção dos aprendizes muito superior a de chefes");
        executarCaso(new Balcao("Balcão de produção alta", 5), 5, 1, 15);

        System.out.println("\nCASO 3: Capacidade de consumo dos chefes muito superior à dos aprendizes");
        executarCaso(new Balcao("Balcão de consumo alto", 5), 1, 5, 15);
    }

    public static void executarCaso(Balcao balcao, int desempenhoAprendiz, int desempenhoChefe, int totalIngredientes)
            throws InterruptedException {

        Thread aprendiz = new Thread(new Aprendiz(balcao, desempenhoAprendiz, totalIngredientes));
        Thread chefe = new Thread(new Chefe(balcao, desempenhoChefe, totalIngredientes));

        aprendiz.start();
        chefe.start();

        aprendiz.join();
        chefe.join();
    }
}
