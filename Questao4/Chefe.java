package Questao4;

public class Chefe implements Runnable {
    private Balcao balcao;
    private int desempenho;
    private int totalIngredientes;

    public Chefe(Balcao balcao, int desempenho, int totalIngredientes) {
        this.balcao = balcao;
        this.desempenho = desempenho;
        this.totalIngredientes = totalIngredientes;
    }

    @Override
    public void run() {
        try {
            int consumidos = 0;

            while (consumidos < totalIngredientes) {
                for (int i = 1; i <= desempenho && consumidos < totalIngredientes; i++) {
                    balcao.retirar(null);
                    consumidos++;
                }

                Thread.sleep(800);
            }
        } catch (InterruptedException e) {
            System.out.println("Chefe interrompido.");
        }
    }
}