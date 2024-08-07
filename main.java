import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // 画面サイズを取得
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // 各サブクラスのインスタンスを作成
        Plant sub1 = new Carnivorous();
        Plant sub2 = new Plant2();
        Plant sub3 = new Tairiku();

        // 各サブクラスのGUIを作成して表示
        sub1.createAndShowGUI(screenWidth - 450, screenHeight / 2 - 150);  // 右
        sub2.createAndShowGUI((screenWidth - 400) / 2, screenHeight / 2 - 150);  // 中央
        sub3.createAndShowGUI(50, screenHeight / 2 - 150);  // 左
    }
}
