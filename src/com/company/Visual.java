package com.company;

import javax.swing.*;
import java.awt.*;

public class Visual extends JFrame {

    private JPanel mainPanel;
    private JPanel wordPanel;
    private JPanel picturePanel;
    private JLabel usedLettersPanel;
    private JPanel textUsedLettersPanel;
    private JTextField userInput;
    private JButton btnEnter;
    GameField field = new GameField();

    public JTextField getUserInput() {
        return userInput;
    }

    public Visual(String title) throws HeadlessException {
        super(title);

        this.setSize(400, 440);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void start() {
        init();
        this.setVisible(true);
    }


    private void init() {
        mainPanel = new JPanel();
        mainPanel.setLayout(null);


        wordPanel = new JPanel();
        wordPanel.setBackground(Color.GRAY);
        wordPanel.setBounds(0, 0, 200, 200);

        picturePanel = new JPanel();
        picturePanel.setBackground(Color.WHITE);
        picturePanel.add(new JLabel(new ImageIcon("C:\\Temp\\StartPicture.PNG")));
        picturePanel.setBounds(200, 0, 200, 200);

        var wrongGuesses = field.getWrongGuesses();

        switch (wrongGuesses) {
            case 1:
                picturePanel.add(new JLabel(new ImageIcon("C:\\Temp\\Picture1.PNG")));
            case 2:
                picturePanel.add(new JLabel(new ImageIcon("C:\\Temp\\Picture2.PNG")));
            case 3:
                picturePanel.add(new JLabel(new ImageIcon("C:\\Temp\\Picture3.PNG")));
            case 4:
                picturePanel.add(new JLabel(new ImageIcon("C:\\Temp\\Picture4.PNG")));
            case 5:
                picturePanel.add(new JLabel(new ImageIcon("C:\\Temp\\Picture5.PNG")));
            case 6:
                picturePanel.add(new JLabel(new ImageIcon("C:\\Temp\\Picture6.PNG")));
            case 7:
                picturePanel.add(new JLabel(new ImageIcon("C:\\Temp\\GameOver.PNG")));
        }


        userInput = new JTextField();
        userInput.setBounds(0, 200, 200, 100);

        textUsedLettersPanel = new JPanel();


        JLabel usedLetters = new JLabel("Used letters:");
        textUsedLettersPanel.add(usedLetters); // kā uztaisīt lielākus un vidū?
        textUsedLettersPanel.setBounds(200, 200, 200, 100);

        btnEnter = new JButton("Try this letter");
        btnEnter.setBounds(0, 300, 200, 100);

        usedLettersPanel = new JLabel();
        usedLettersPanel.setBounds(200, 300, 200, 100);

//        var letters = field.getUsedLetters().toString();

//        JLabel arrayOfUsedLetters = new JLabel(letters);

//        usedLettersPanel.add(arrayOfUsedLetters); // vai šis list papildinās kaut kādā brīdī?


        mainPanel.add(wordPanel);
        mainPanel.add(picturePanel);
        mainPanel.add(userInput);
        mainPanel.add(textUsedLettersPanel);
        mainPanel.add(usedLettersPanel);
        mainPanel.add(btnEnter);
        this.setContentPane(mainPanel);


    }


}
