import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public abstract class Plant {
    public void createAndShowGUI(int x,int y) {
        JFrame frame = new JFrame(getTitle());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocation(x, y);  // 位置を設定

        JButton button = new JButton(getButtonLabel());
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showImage(x,y);
            }
        });

        JPanel panel = new JPanel();
        panel.add(button);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    private void showImage(int x,int y) {
        JFrame imageFrame = new JFrame(getTitle());
        imageFrame.setSize(400, 400);
        imageFrame.setLocation(x, y);
        ImageIcon imageIcon = new ImageIcon(getImagePath());
        JLabel label = new JLabel(imageIcon);
        imageFrame.getContentPane().add(label);
        imageFrame.setVisible(true);
    }

    protected abstract String getTitle();
    protected abstract String getButtonLabel();
    protected abstract String getImagePath();
}
