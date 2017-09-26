import javax.swing.*;

/**
 * Created by victor on 9/26/17.
 */
public class Window extends JFrame {

    public Window(String title){
        this.setTitle(title);
        this.setLocationRelativeTo(null);
        this.setSize(330,500);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
