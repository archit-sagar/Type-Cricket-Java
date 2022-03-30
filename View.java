import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class View extends JFrame {

    private JLabel enterNumberJLabel = new JLabel("Enter 1-6: ");
    private JLabel bowlerUserLabel = new JLabel("Bowling: ");
    private JLabel bowler = new JLabel("User");
    private JLabel batterUserLabel = new JLabel("Batting: ");
    private JLabel batter = new JLabel("Computer");
    private JLabel batterLabel = new JLabel("Batter put:");
    private JLabel batterNumberLabel = new JLabel("0");
    private JLabel bowlerLabel = new JLabel("Bowler put:");
    private JLabel bowlerNumberLabel = new JLabel("0");
    private JLabel targetLabel = new JLabel("Target:");
    private JLabel targetScoreLabel = new JLabel("0");
    private JLabel playerLabel = new JLabel("Score:");
    private JLabel playerScoreJLabel = new JLabel("0");
    private JLabel inningsNumberLabel = new JLabel("Innings:");
    private JLabel inningsNumber = new JLabel("1");
    private JButton tossInfoButton = new JButton("Toss Info");
    private JButton enterNumberButton = new JButton("Play");
    private JButton changeInnings = new JButton("Change Innings");
    private JTextField numberTextField = new JTextField(4);

    private JPanel tossInfoPanel = new JPanel();
    private JPanel inputPanel = new JPanel();
    private JPanel scoreboardPanel1 = new JPanel();
    private JPanel scoreboardPanel2 = new JPanel();
    private JPanel inningsPanel = new JPanel();

    public View() {

        this.setTitle("Type Cricket");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.CYAN);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        tossInfoPanel.add(tossInfoButton);
        tossInfoPanel.add(changeInnings);
        tossInfoPanel.setBorder(BorderFactory.createTitledBorder("Toss Info"));
        this.add(tossInfoPanel);
        tossInfoPanel.setBackground(Color.CYAN);
        tossInfoPanel.setBorder(BorderFactory.createTitledBorder(new MatteBorder(1, 0, 0, 0, Color.BLACK), "Toss Info",
                TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 14), Color.BLACK));

        scoreboardPanel2.setLayout(null);
        scoreboardPanel2.add(bowlerUserLabel);
        scoreboardPanel2.add(bowler);
        scoreboardPanel2.add(batterUserLabel);
        scoreboardPanel2.add(batter);
        Dimension size2 = batterLabel.getMaximumSize();
        bowlerUserLabel.setBounds(270, 20, size2.width + 50, size2.height);
        bowler.setBounds(325, 20, size2.width + 50, size2.height);
        batterUserLabel.setBounds(420, 20, size2.width + 50, size2.height);
        batter.setBounds(470, 20, size2.width + 50, size2.height);
        scoreboardPanel2.setBackground(Color.CYAN);
        scoreboardPanel2.setBorder(BorderFactory.createTitledBorder(new MatteBorder(1, 0, 0, 0, Color.BLACK), "Roles",
                TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 14), Color.BLACK));
        this.add(scoreboardPanel2);

        inputPanel.add(enterNumberJLabel);
        inputPanel.add(numberTextField);
        inputPanel.add(enterNumberButton);
        inputPanel.setBackground(Color.CYAN);
        inputPanel.setBorder(BorderFactory.createTitledBorder(new MatteBorder(1, 0, 0, 0, Color.BLACK), "Input Area",
                TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 14), Color.BLACK));
        this.add(inputPanel);

        scoreboardPanel1.setLayout(null);
        scoreboardPanel1.add(batterLabel);
        scoreboardPanel1.add(batterNumberLabel);
        scoreboardPanel1.add(bowlerLabel);
        scoreboardPanel1.add(bowlerNumberLabel);
        Dimension size = batterLabel.getMaximumSize();
        batterLabel.setBounds(270, 20, size.width + 50, size.height);
        batterNumberLabel.setBounds(335, 20, size.width + 50, size.height);
        bowlerLabel.setBounds(420, 20, size.width + 50, size.height);
        bowlerNumberLabel.setBounds(490, 20, size.width + 50, size.height);
        scoreboardPanel1
                .setBorder(BorderFactory.createTitledBorder(new MatteBorder(1, 0, 0, 0, Color.BLACK), "Turn Events",
                        TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 14), Color.BLACK));
        scoreboardPanel1.setBackground(Color.CYAN);
        this.add(scoreboardPanel1);

        inningsPanel.setLayout(null);
        inningsPanel.add(playerLabel);
        inningsPanel.add(playerScoreJLabel);
        inningsPanel.add(targetLabel);
        inningsPanel.add(targetScoreLabel);
        inningsPanel.add(inningsNumberLabel);
        inningsPanel.add(inningsNumber);
        Dimension size1 = batterLabel.getMaximumSize();
        playerLabel.setBounds(217, 20, size1.width + 500, size1.height);
        playerScoreJLabel.setBounds(257, 20, size1.width + 50, size1.height);
        targetLabel.setBounds(367, 20, size1.width + 500, size1.height);
        targetScoreLabel.setBounds(412, 20, size1.width + 50, size1.height);
        inningsNumberLabel.setBounds(517, 20, size1.width + 50, size1.height);
        inningsNumber.setBounds(567, 20, size1.width + 50, size1.height);
        inningsPanel.setBackground(Color.CYAN);
        inningsPanel.setBorder(BorderFactory.createTitledBorder(new MatteBorder(1, 0, 0, 0, Color.BLACK), "Summary",
                TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 14), Color.BLACK));
        this.add(inningsPanel);

        tossInfoPanel.setPreferredSize(new Dimension(100, 30));
        scoreboardPanel2.setPreferredSize(new Dimension(100, 20));
        scoreboardPanel1.setPreferredSize(new Dimension(100, 20));
        inputPanel.setPreferredSize(new Dimension(100, 30));
        inningsPanel.setPreferredSize(new Dimension(100, 20));

        this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        this.add(Box.createVerticalGlue());
        this.pack();
        this.setSize(new Dimension(200, 200));
        this.setLocationRelativeTo(null);
        this.setBackground(Color.CYAN);
        this.setVisible(true);
    }

    private void setBorder(Border createEmptyBorder) {
    }

    public int getInput() {
        return Integer.parseInt(numberTextField.getText());
    }

    public void updateInnings(int target) {
        if (bowler.getText() == "Computer") {
            JOptionPane.showMessageDialog(this, "You cannot change innings!");
            return;
        }
        inningsNumber.setText(("2"));
        bowler.setText("Computer");
        batter.setText("User");
        targetScoreLabel.setText(String.valueOf(target));
        playerScoreJLabel.setText("0");
    }

    int updateScore(int score) {

        int compChoice = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
        int userNumber = Integer.parseInt(numberTextField.getText());
        if (userNumber < 1 || userNumber > 6) {
            JOptionPane.showMessageDialog(this, "You can only enter a number from 1 to 6.");
            return (-4);
        }

        if (compChoice == userNumber) {
            int targetChase = Integer.parseInt(playerScoreJLabel.getText()) + 1;
            playerScoreJLabel.setText("0");
            targetScoreLabel.setText(String.valueOf(targetChase));
            if (inningsNumber.getText() == "1") {
                JOptionPane.showMessageDialog(this, "OUT! Innings Break!");
                int scoreTarget = Integer.parseInt(playerScoreJLabel.getText()) + 1;
                targetScoreLabel.setText(String.valueOf(scoreTarget));
                playerScoreJLabel.setText("0");
                inningsNumber.setText("2");
                batterNumberLabel.setText("0");
                bowlerNumberLabel.setText("0");
                return (-1);
            } else {
                if (playerScoreJLabel.getText() == targetScoreLabel.getText()) {
                    JOptionPane.showMessageDialog(this, "BAD LUCK! You got out and drew the game...");
                } else {
                    JOptionPane.showMessageDialog(this, "OUT! You lost hehe xD");
                }
                return (-2);
            }
        }
        if (inningsNumber.getText() == "1") {
            batterNumberLabel.setText(String.valueOf(compChoice));
            bowlerNumberLabel.setText(String.valueOf(userNumber));
            playerScoreJLabel.setText(String.valueOf(score + compChoice));
            return (score + compChoice);
        } else {
            bowlerNumberLabel.setText(String.valueOf(compChoice));
            batterNumberLabel.setText(String.valueOf(userNumber));
            playerScoreJLabel.setText(String.valueOf(score + userNumber));
            if (Integer.parseInt(playerScoreJLabel.getText()) > Integer.parseInt(targetScoreLabel.getText())) {
                JOptionPane.showMessageDialog(this, "CONGRATS! You won!");
                System.exit(0);
            }
            return (score + userNumber);
        }
    }

    void displayChangeInnings(){
        JOptionPane.showMessageDialog(this, 
                "Looks like you gave up. The computer felt bad for you and accepted to declare. :P");
    }

    void displayTossInfo() {
        JOptionPane.showMessageDialog(this,
                "You have been put into bowl first. Skittle out the opponent and become the hero by winning the match. \nEverything depends on you! No pressure :)");
    }

    void displayError(String error) {
        JOptionPane.showMessageDialog(this, error);
    }

    void updateInningsListener(ActionListener listenForUpdateButton) {
        changeInnings.addActionListener(listenForUpdateButton);
    }

    void updatePlayerScoreListener(ActionListener listenForScoreButton) {
        enterNumberButton.addActionListener(listenForScoreButton);
    }

    void displayTossInfoListener(ActionListener listenForTossButton) {
        tossInfoButton.addActionListener(listenForTossButton);
    }
}