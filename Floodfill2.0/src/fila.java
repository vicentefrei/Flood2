public class fila {
    private int[][] elementos;
    private int frente, tras;

    public fila(int capacidade) {
        elementos = new int[capacidade][2];
        frente = tras = 0;
    }

    public void enfileirar(int x, int y) {
        if (tras < elementos.length) {
            elementos[tras][0] = x;
            elementos[tras][1] = y;
            tras++;
        }
    }

    public int[] desenfileirar() {
        if (frente < tras) {
            int[] ponto = elementos[frente];
            frente++;
            return ponto;
        }
        return null;
    }

    public boolean estaVazia() {
        return frente == tras;
    }
}
