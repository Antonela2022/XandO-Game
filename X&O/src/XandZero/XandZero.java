package XandZero;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class XandZero {

    private JFrame frame;
    private JPanel panel;
    private JPanel panel_1;
    private JPanel panel_2;
    private JPanel panel_3;
    private JPanel panel_4;
    private JPanel panel_5;
    private JPanel panel_6;
    private JPanel panel_7;
    private JPanel panel_8;
    private JPanel panel_9;
    private JPanel panel_10;
    private JPanel panel_11;
    private JPanel panel_12;
    private JPanel panel_13;
    private JPanel panel_14;
    private JPanel panel_15;

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    private int count = 0;
    public boolean isNoWin = false;

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JTextField txtCountX;
    private JTextField txtCountO;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    XandZero window = new XandZero();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public XandZero() {
        initialize();
    }

    void resetTable() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }

    void checkTheWinner(String firstValue, String secondValue, String thirdValue) {
        int dialogButton;
        if (firstValue.equals("X") && secondValue.equals("X") && thirdValue.equals("X")) {
            dialogButton = JOptionPane.showConfirmDialog(null, "Player X wins", "XandZero", JOptionPane.INFORMATION_MESSAGE);
            if (dialogButton == JOptionPane.YES_OPTION) {
                count = 0;
                resetTable();
            }
            xCount++;
            gameScore();
            return;
        }

        if (firstValue.equals("O") && secondValue.equals("O") && thirdValue.equals("O")) {
            dialogButton = JOptionPane.showConfirmDialog(null, "Player O wins", "XandZero", JOptionPane.INFORMATION_MESSAGE);
            if (dialogButton == JOptionPane.YES_OPTION) {
                count = 0;
                resetTable();
            }
            oCount++;
            gameScore();
            return;
        }
        isNoWin = true;
    }
    
    
    void checkEquality() {
        if(isNoWin == true && count == 9) {
            int dialogButton = JOptionPane.showConfirmDialog(null, "Nobody wins", "XandZero", JOptionPane.INFORMATION_MESSAGE);
            if (dialogButton == JOptionPane.YES_OPTION) {
                count = 0;
                resetTable();
            }
            gameScore();
        }
    } 

    private void winningGame() {
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();

        // lines
        checkTheWinner(b1, b2, b3);
        checkTheWinner(b4, b5, b6);
        checkTheWinner(b7, b8, b9);

        // columns
        checkTheWinner(b1, b4, b7);
        checkTheWinner(b2, b5, b8);
        checkTheWinner(b3, b6, b9);

        // diagonal
        checkTheWinner(b1, b5, b9);
        checkTheWinner(b3, b5, b7);
        
        // equality
        checkEquality();
    }

    void gameScore() {
        txtCountX.setText(String.valueOf(xCount));
        txtCountO.setText(String.valueOf(oCount));

    }

    void choosePlayer() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }

    void initializePanel() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1200, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0));

        panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 1));
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(3, 5, 2, 2));

        panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_1);
        panel_1.setLayout(new BorderLayout(0, 0));

        panel_2 = new JPanel();
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));

        panel_3 = new JPanel();
        panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_3);
        panel_3.setLayout(new BorderLayout(0, 0));

        panel_4 = new JPanel();
        panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_4);
        panel_4.setLayout(new BorderLayout(0, 0));

        panel_5 = new JPanel();
        panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_5);
        panel_5.setLayout(new BorderLayout(0, 0));

        panel_6 = new JPanel();
        panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_6);
        panel_6.setLayout(new BorderLayout(0, 0));

        panel_7 = new JPanel();
        panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_7);
        panel_7.setLayout(new BorderLayout(0, 0));

        panel_8 = new JPanel();
        panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_8);
        panel_8.setLayout(new BorderLayout(0, 0));

        panel_9 = new JPanel();
        panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_9);
        panel_9.setLayout(new BorderLayout(0, 0));

        panel_10 = new JPanel();
        panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_10);
        panel_10.setLayout(new BorderLayout(0, 0));

        panel_11 = new JPanel();
        panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_11);
        panel_11.setLayout(new BorderLayout(0, 0));

        panel_12 = new JPanel();
        panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_12);
        panel_12.setLayout(new BorderLayout(0, 0));

        panel_13 = new JPanel();
        panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_13);
        panel_13.setLayout(new BorderLayout(0, 0));

        panel_14 = new JPanel();
        panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_14);
        panel_14.setLayout(new BorderLayout(0, 0));

        panel_15 = new JPanel();
        panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_15);
        panel_15.setLayout(new BorderLayout(0, 0));

    }

    void checkValueButton(JButton button) {
        button.setBackground(new Color(255, 255, 255));
        button.setFont(new Font("Tahoma", Font.BOLD, 96));
        if (button.getText().isEmpty()) {
            button.setText(startGame);
            if (startGame.equalsIgnoreCase("X")) {
                button.setForeground(Color.BLACK);
            } else {
                button.setForeground(Color.GRAY);
            }
            ++count;
        }
        choosePlayer();
        winningGame();
    }

    private void initialize() {
        initializePanel();

        // button 1
        btn1 = new JButton();
        btn1.setBackground(new Color(255, 255, 255));
        btn1.addActionListener((ActionEvent e) -> {
            checkValueButton(btn1);
        });
        btn1.setFont(new Font("Tahoma", Font.BOLD, 96));
        panel_1.add(btn1, BorderLayout.CENTER);

        // button 2
        btn2 = new JButton();
        btn2.addActionListener((ActionEvent e) -> {
            checkValueButton(btn2);
        });
        btn2.setFont(new Font("Tahoma", Font.BOLD, 96));
        panel_2.add(btn2, BorderLayout.CENTER);

        // button 3
        btn3 = new JButton();
        btn3.setBackground(new Color(255, 255, 255));
        btn3.addActionListener((ActionEvent e) -> {
            checkValueButton(btn3);
        });
        btn3.setFont(new Font("Tahoma", Font.BOLD, 96));
        panel_3.add(btn3, BorderLayout.CENTER);

        // label 1
        JLabel lblNewLabel = new JLabel("Player X:");
        lblNewLabel.setBackground(new Color(255, 228, 225));
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("Snap ITC", Font.BOLD, 38));
        panel_4.add(lblNewLabel, BorderLayout.CENTER);

        txtCountX = new JTextField();
        txtCountX.setBackground(new Color(255, 228, 225));
        txtCountX.setHorizontalAlignment(SwingConstants.CENTER);
        txtCountX.setFont(new Font("Times New Roman", Font.BOLD, 62));
        txtCountX.setText("0");
        panel_5.add(txtCountX, BorderLayout.CENTER);
        txtCountX.setColumns(10);

        // button 4
        btn4 = new JButton();
        btn4.setBackground(new Color(255, 255, 255));
        btn4.addActionListener((ActionEvent e) -> {
            checkValueButton(btn4);
        });
        btn4.setFont(new Font("Tahoma", Font.BOLD, 96));
        panel_6.add(btn4, BorderLayout.CENTER);

        // button 5
        btn5 = new JButton();
        btn5.setBackground(new Color(255, 255, 255));
        btn5.addActionListener((ActionEvent e) -> {
            checkValueButton(btn5);
        });
        btn5.setFont(new Font("Tahoma", Font.BOLD, 96));
        panel_7.add(btn5, BorderLayout.CENTER);

        // button 6
        btn6 = new JButton();
        btn6.setBackground(new Color(255, 255, 255));
        btn6.addActionListener((ActionEvent e) -> {
            checkValueButton(btn6);
        });
        btn6.setFont(new Font("Tahoma", Font.BOLD, 96));
        panel_8.add(btn6, BorderLayout.CENTER);

        // label 2
        JLabel lblNewLabel_1 = new JLabel("Player O:");
        lblNewLabel_1.setBackground(new Color(240, 240, 240));
        lblNewLabel_1.setFont(new Font("Snap ITC", Font.BOLD, 38));
        panel_9.add(lblNewLabel_1, BorderLayout.CENTER);

        txtCountO = new JTextField();
        txtCountO.setBackground(new Color(255, 228, 225));
        txtCountO.setFont(new Font("Times New Roman", Font.BOLD, 62));
        txtCountO.setText("0");
        txtCountO.setHorizontalAlignment(SwingConstants.CENTER);
        panel_10.add(txtCountO, BorderLayout.CENTER);
        txtCountO.setColumns(10);

        // button 7
        btn7 = new JButton();
        btn7.setBackground(new Color(255, 255, 255));
        btn7.addActionListener((ActionEvent e) -> {
            checkValueButton(btn7);
        });
        btn7.setFont(new Font("Tahoma", Font.BOLD, 96));
        panel_11.add(btn7, BorderLayout.CENTER);

        // button 8
        btn8 = new JButton();
        btn8.setBackground(new Color(255, 255, 255));
        btn8.addActionListener((ActionEvent e) -> {
            checkValueButton(btn8);
        });
        btn8.setFont(new Font("Tahoma", Font.BOLD, 96));
        panel_12.add(btn8, BorderLayout.CENTER);

        // button 9
        btn9 = new JButton();
        btn9.setBackground(new Color(255, 255, 255));
        btn9.addActionListener((ActionEvent e) -> {
            checkValueButton(btn9);
        });
        btn9.setFont(new Font("Tahoma", Font.BOLD, 96));
        panel_13.add(btn9, BorderLayout.CENTER);

        // button Reset
        JButton btnReset = new JButton("Reset");
        btnReset.setBackground(new Color(128, 0, 0));
        btnReset.setForeground(new Color(255, 255, 255));
        btnReset.addActionListener((ActionEvent e) -> {
            resetTable();
        });
        btnReset.setFont(new Font("Times New Roman", Font.BOLD, 70));
        panel_14.add(btnReset, BorderLayout.CENTER);

        // button Exit
        JButton btnExit = new JButton("Exit");
        btnExit.setBackground(new Color(128, 0, 0));
        btnExit.setForeground(new Color(255, 255, 255));
        btnExit.addActionListener((ActionEvent e) -> {
            frame = new JFrame("Exit");
            if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "XandZero",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {

                System.exit(0);
            }
        });
        btnExit.setFont(new Font("Times New Roman", Font.BOLD, 70));
        panel_15.add(btnExit, BorderLayout.CENTER);
    }
}
