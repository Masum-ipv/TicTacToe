
import javax.swing.JFrame;

/**
 *
 * @author acm
 */
public class runner extends JFrame {

    public static void main(String[] args) throws InterruptedException {
        playGround init = new playGround();
        init.setVisible(true);
        
        init.initComponents();
        init.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
