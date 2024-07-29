import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;


public class Plane {//キャラクターと位置を管理

public class Character {
    private int x, y;
    private BufferedImage image;
    private static final int MOVE_STEP = 5;
    private Random random = new Random();

    public Character(BufferedImage image, int initialX, int initialY) {
        this.image = image;
        this.x = initialX;
        this.y = initialY;
        moveRandomly();
    }

    public void moveRandomly() {
        x += random.nextInt(MOVE_STEP * 2) - MOVE_STEP;
        y += random.nextInt(MOVE_STEP * 2) - MOVE_STEP;
    }

    public void draw(Graphics g) {
        g.drawImage(image, x, y, null);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, image.getWidth(), image.getHeight());
    }

    public boolean isClicked(int clickX, int clickY) {
        return getBounds().contains(clickX, clickY);
    }
}

}
