package physics;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public final int WIDTH = 600;
    public final int HEIGHT = 600;

    public Graphics g;

    Window(){
        setTitle("Physics Demo");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        add(panel);
        panel.setBackground(Color.BLACK);
        Graphics g = getGraphics();

    }
}
