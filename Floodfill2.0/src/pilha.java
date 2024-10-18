public class pilha {
    private int[][] elementos;
    private int topo;

    public pilha(int capacidade) {
        elementos = new int[capacidade][2];
        topo = -1;
    }

    public void empilhar(int x, int y) {
        if (topo < elementos.length - 1) {
            topo++;
            elementos[topo][0] = x;
            elementos[topo][1] = y;
        }
    }

    public int[] desempilhar() {
        if (topo >= 0) {
            int[] ponto = elementos[topo];
            topo--;
            return ponto;
        }
        return null;
    }

    public boolean estaVazia() {
        return topo == -1;
    }
}
