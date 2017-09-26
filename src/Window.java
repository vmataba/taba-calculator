import javax.swing.*;
import java.awt.*;

/**
 * Created by victor on 9/26/17.
 */
public class Window extends JFrame {

    private JPanel panel = null;
    private JTextField screen = null;
    private JButton[] buttons = null;
    private Font font = null;

    public Window(String title){
        this.setTitle(title);
        this.setLocationRelativeTo(null);
        this.setSize(330,500);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        this.render();

        this.setVisible(true);
    }

    private void render () {

        font = new Font("Tahoma",Font.BOLD,20);

        screen = new JTextField();
        screen.setPreferredSize(new Dimension(310,50));
        screen.setBorder(BorderFactory.createSoftBevelBorder(0));
        screen.setFont(font);

        panel = new JPanel();
        panel.setBackground(Color.GRAY);

        panel.add(screen);
        this.add(panel);


    }
}
