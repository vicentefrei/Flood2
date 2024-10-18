import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class imagem {
    private BufferedImage buffer;

    public imagem(String caminho) throws IOException {
        buffer = ImageIO.read(new File(caminho));
    }

    public void salvarImagem(String caminho) throws IOException {
        ImageIO.write(buffer, "png", new File(caminho));
    }

    public int getLargura() {
        return buffer.getWidth();
    }

    public int getAltura() {
        return buffer.getHeight();
    }

    public int getRGB(int x, int y) {
        return buffer.getRGB(x, y);
    }

    public void setRGB(int x, int y, int cor) {
        buffer.setRGB(x, y, cor);
    }

    public BufferedImage getBufferedImage() {
        return buffer;
    }
}
