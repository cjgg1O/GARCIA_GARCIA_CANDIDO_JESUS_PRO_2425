import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mandelbrot extends JPanel {
    private final int MAX_ITER = 570;
    private final double ZOOM = 150;

    public void paint(Graphics g) {
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                double zx = 0, zy = 0, cX = (x - 400) / ZOOM, cY = (y - 300) / ZOOM;
                int iter = MAX_ITER;
                while (zx * zx + zy * zy < 4 && iter > 0) {
                    double tmp = zx * zx - zy * zy + cX;
                    zy = 2.0 * zx * zy + cY;
                    zx = tmp;
                    iter--;
                }
                g.setColor(iter > 0 ? new Color(iter | (iter << 8)) : Color.BLACK);
                g.drawLine(x, y, x, y);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mandelbrot Set");
        Mandelbrot mandelbrot = new Mandelbrot();
        frame.add(mandelbrot);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}