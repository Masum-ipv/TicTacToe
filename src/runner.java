
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.omg.CORBA.ORB;

/**
 *
 * @author acm
 */
public class runner extends JFrame {

    public int player;
    public static playGround board = new playGround();

    public static void main(String[] args) {
        runner init = new runner();
        init.setVisible(true);
        board.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private runner() {
        super("Tic Tac Toe");
        setSize(250, 250);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Who play first?");
        JButton computer = new JButton("Computer");
        JButton user = new JButton("User");

        computer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                board.setVisible(true);
                player = 2;
                
            }
        });
        
        user.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                board.setVisible(true);
                player = 1;
            }
        });
        add(computer);
        add(user);
        add(label);
    }
}
