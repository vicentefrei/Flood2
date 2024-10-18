import java.awt.Color;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            imagem img = new imagem("src/Circle.png");

            flood floodFill = new flood();

            floodFill.floodFillComPilha(img.getBufferedImage(), 10, 10, Color.WHITE.getRGB());
            img.salvarImagem("src/Circle.png");

            floodFill.floodFillComFila(img.getBufferedImage(), 10, 10, Color.BLUE.getRGB());
            img.salvarImagem("src/Circle2.png");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
