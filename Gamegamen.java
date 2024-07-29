import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Gamegamen {


public class GamePanel extends JPanel {//ゲーム画面とユーザ情報
    private Character character;
    private int score = 0;
    private BufferedImage characterImage;

    public GamePanel() {
        try {
            characterImage = ImageIO.read(getClass().getResource("/character.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        character = new Character(characterImage, 100, 100);
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (character.isClicked(e.getX(), e.getY())) {
                    score++;
                    character.moveRandomly();
                    repaint();
                }
            }
        });

        Timer timer = new Timer(100, e -> {
            character.moveRandomly();
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        character.draw(g);
        g.setColor(Color.BLACK);
        g.drawString("Score: " + score, 10, 20);
    }
}

    
}
