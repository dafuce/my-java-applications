package physics;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public final int WIDTH = 600;
    public final int HEIGHT = 600;

    public Graphics g;


    private final char[][] stage =
            {
                    {'b','b','b','b','b'},
                    {'b','s','b','f','b'},
                    {'b','e','b','e','b'},
                    {'b','e','e','e','b'},
                    {'b','b','b','b','b'}
            };
    public static int NROWS;
    public static int NCOLS;

    private final int tileWidth;
    private final int tileHeight;

    /*
    Values: 'e' = empty
            'b' = wall block
            's' = start
            'f' = finish
     */
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

        NROWS = stage.length;
        NCOLS = stage[0].length;

        tileWidth = WIDTH/NCOLS;
        tileHeight = HEIGHT/NROWS;

        System.out.println(NCOLS);

    }
    public void paint(Graphics g){
        super.paint(g);

        for(int row = 0; row < NROWS; row++){
            for (int col = 0; col < NCOLS; col++){
                Color color;
                switch (stage[row][col]){
                    case 'b': color = Color.BLACK;
                        break;
                    case 's': color = Color.YELLOW;
                        break;
                    case 'f': color = Color.GREEN;
                        break;
                    default:
                        color = Color.WHITE;
                }
                g.setColor(color);
                g.fillRect(tileWidth*col, tileHeight*row, tileWidth,tileHeight);
                g.setColor(Color.BLACK);
                g.drawRect(tileWidth*col, tileHeight*row, tileWidth,tileHeight);
            }
        }
    }
}
