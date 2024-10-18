import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class flood {
    public static void floodFillComPilha(BufferedImage imagem, int x, int y, int novaCor) {
        int corFundo = imagem.getRGB(x, y);
        if (corFundo == novaCor) return;

        Stack<int[]> pilha = new Stack<>();
        pilha.push(new int[]{x, y});

        while (!pilha.isEmpty()) {
            int[] ponto = pilha.pop();
            int px = ponto[0];
            int py = ponto[1];

            if (px >= 0 && px < imagem.getWidth() && py >= 0 && py < imagem.getHeight() && imagem.getRGB(px, py) == corFundo) {
                imagem.setRGB(px, py, novaCor);

                pilha.push(new int[]{px + 1, py});
                pilha.push(new int[]{px - 1, py});
                pilha.push(new int[]{px, py + 1});
                pilha.push(new int[]{px, py - 1});
            }
        }
    }

    public static void floodFillComFila(BufferedImage imagem, int x, int y, int novaCor) {
        int corFundo = imagem.getRGB(x, y);
        if (corFundo == novaCor) return;

        Queue<int[]> fila = new LinkedList<>();
        fila.add(new int[]{x, y});

        while (!fila.isEmpty()) {
            int[] ponto = fila.poll();
            int px = ponto[0];
            int py = ponto[1];

            if (px >= 0 && px < imagem.getWidth() && py >= 0 && py < imagem.getHeight() && imagem.getRGB(px, py) == corFundo) {
                imagem.setRGB(px, py, novaCor);

                fila.add(new int[]{px + 1, py});
                fila.add(new int[]{px - 1, py});
                fila.add(new int[]{px, py + 1});
                fila.add(new int[]{px, py - 1});
            }
        }
    }
}
