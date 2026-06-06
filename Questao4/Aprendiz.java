package Questao4;

public class Aprendiz implements Runnable {
    private Balcao balcao;
    private int desempenho;
    private int totalIngredientes;

    public Aprendiz(Balcao balcao, int desempenho, int totalIngredientes) {
        this.balcao = balcao;
        this.desempenho = desempenho;
        this.totalIngredientes = totalIngredientes;
    }

    @Override
    public void run() {
        try {
            int produzidos = 0;
            int iteracao = 1;

            while (produzidos < totalIngredientes) {
                for (int i = 1; i <= desempenho && produzidos < totalIngredientes; i++) {
                    Ingrediente ingrediente = new Ingrediente("Ingrediente " + iteracao + "." + i);
                    balcao.colocar(ingrediente);
                    produzidos++;
                }

                iteracao++;
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Aprendiz interrompido.");
        }
    }
}
