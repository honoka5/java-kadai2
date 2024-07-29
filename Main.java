import javax.swing.*;
import java.awt.*;

public class main {
public class TapGame extends JFrame {
    public TapGame() {
        setTitle("Tap Game");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        GamePanel gamePanel = new GamePanel();
        add(gamePanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TapGame::new);
    }
}

    }
    

