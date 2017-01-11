import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

public class playGround extends JFrame {

    int board[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    int turn = 0;

    private void button1ActionPerformed(ActionEvent e) {
        playerMove(0);
    }

    private void button2ActionPerformed(ActionEvent e) {

        playerMove(1);
    }

    private void button3ActionPerformed(ActionEvent e) {

        playerMove(2);
    }

    private void button4ActionPerformed(ActionEvent e) {

        playerMove(3);
    }

    private void button5ActionPerformed(ActionEvent e) {

        playerMove(4);
    }

    private void button6ActionPerformed(ActionEvent e) {

        playerMove(5);
    }

    private void button7ActionPerformed(ActionEvent e) {

        playerMove(6);
    }

    private void button8ActionPerformed(ActionEvent e) {

        playerMove(7);
    }

    private void button9ActionPerformed(ActionEvent e) {

        playerMove(8);
    }

    public void initComponents() {
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();

        //======== this ========
        setTitle("Tic Tac Toe");
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setText("");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });

        //---- button2 ----
        button2.setText("");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2ActionPerformed(e);
            }
        });

        //---- button3 ----
        button3.setText("");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3ActionPerformed(e);
            }
        });

        //---- button4 ----
        button4.setText("");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button4ActionPerformed(e);
            }
        });

        //---- button5 ----
        button5.setText("");
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button5ActionPerformed(e);
            }
        });

        //---- button6 ----
        button6.setText("");
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button6ActionPerformed(e);
            }
        });

        //---- button7 ----
        button7.setText("");
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button7ActionPerformed(e);
            }
        });

        //---- button8 ----
        button8.setText("");
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button8ActionPerformed(e);
            }
        });

        //---- button9 ----\
        button9.setText("");
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button9ActionPerformed(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button5, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button6, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(button7, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button8, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button9, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(11, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button6, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button7, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button8, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button9, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(15, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public void drawBoard(int move, boolean isComputer) {
        String pic;
        if (isComputer) {
            pic = "X";
        } else {
            pic = "O";
        }
        switch (move) {
            case 0:
                button1.setText(pic);
                break;
            case 1:
                button2.setText(pic);
                break;
            case 2:
                button3.setText(pic);
                break;
            case 3:
                button4.setText(pic);
                break;
            case 4:
                button5.setText(pic);
                break;
            case 5:
                button6.setText(pic);
                break;
            case 6:
                button7.setText(pic);
                break;
            case 7:
                button8.setText(pic);
                break;
            case 8:
                button9.setText(pic);
                break;
            default:
                break;
        }
    }

    public int win(int board[]) {
        //determines if a player has won, returns 0 otherwise.
        int wins[][] = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};
        int i;
        for (i = 0; i < 8; ++i) {
            if (board[wins[i][0]] != 0
                    && board[wins[i][0]] == board[wins[i][1]]
                    && board[wins[i][0]] == board[wins[i][2]]) {
                return board[wins[i][2]];
            }
        }
        return 0;
    }

    public int minimax(int board[], int player) {
        //How is the position like for player (their turn) on board?
        int winner = win(board);
        if (winner != 0) {
            return winner * player;
        }

        int move = -1;
        int score = -2;//Losing moves are preferred to no move
        int i;
        for (i = 0; i < 9; ++i) {//For all moves,
            if (board[i] == 0) {//If legal,
                board[i] = player;//Try the move
                int thisScore = -minimax(board, player * -1);
                if (thisScore > score) {
                    score = thisScore;
                    move = i;
                }//Pick the one that's worst for the opponent
                board[i] = 0;//Reset board after try
            }
        }
        if (move == -1) {
            return 0;
        }
        return score;
    }

    public int computerMove() {
        int move = -1;
        int score = -2;
        int i;
        for (i = 0; i < 9; ++i) {
            if (board[i] == 0) {
                board[i] = 1;
                int tempScore = -minimax(board, -1);
                board[i] = 0;
                if (tempScore > score) {
                    score = tempScore;
                    move = i;
                }
            }
        }
        //returns a score based on minimax tree at a given node.
        board[move] = 1;
        return move;
    }

    public void playerMove(int move) {
        board[move] = -1;
        drawBoard(move, false);
        drawBoard(computerMove(), true);
        if (turn++ < 3) {
            return;
        }
        switch (win(board)) {
            case 0:
                JOptionPane.showMessageDialog(null,"Match Draw","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);
                System.out.println("\n");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"You Lose","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);
                break;
            case -1:
                JOptionPane.showMessageDialog(null,"You Win","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);
                break;
        }
        System.exit(0);
    }

}
