package com.company;

import javax.swing.*;
import java.awt.*;

public class Visual extends JFrame {

    private JPanel mainPanel;
    private JPanel wordPanel;
    private JPanel userInputPanel;
    private JPanel picturePanel;
    private JPanel usedLettersPanel;
    private JPanel textUsedLettersPanel;
    private JTextField userInput;
    private JButton btnEnter;

    public Visual(String title) throws HeadlessException {
        super(title);

        this.mainPanel = mainPanel;

        this.setSize(400, 440);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void start() {
        init();
        this.setVisible(false);
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

        /* if(){
        picturePanel.add(new JLabel(new ImageIcon("C:\\Temp\\Picture1.PNG")));
        }else if(){
        picturePanel.add(new JLabel(new ImageIcon("C:\\Temp\\Picture2.PNG")));
        }else if(){
        picturePanel.add(new JLabel(new ImageIcon("C:\\Temp\\Picture3.PNG")));
        }else if(){
        picturePanel.add(new JLabel(new ImageIcon("C:\\Temp\\Picture4.PNG")));
        }else if(){
        picturePanel.add(new JLabel(new ImageIcon("C:\\Temp\\Picture5.PNG")));
        }else if(){
        picturePanel.add(new JLabel(new ImageIcon("C:\\Temp\\Picture6.PNG")));
        }else{
        picturePanel.add(new JLabel(new ImageIcon("C:\\Temp\\GameOver.PNG")));
         */


        userInput = new JTextField();
        userInput.setBounds(0, 200, 200, 100);

        textUsedLettersPanel = new JPanel();
        textUsedLettersPanel.setBackground(Color.WHITE);

        JLabel usedLetters = new JLabel("Used letters:");
        textUsedLettersPanel.add(usedLetters); // kā uztaisīt lielākus un vidū?
        textUsedLettersPanel.setBounds(200, 200, 200, 100);


        btnEnter = new JButton("Try this letter");
        btnEnter.setBounds(0, 300, 200, 100);

        usedLettersPanel = new JPanel();
        usedLettersPanel.setBackground(Color.BLUE);
        usedLettersPanel.setBounds(200, 300, 200, 100);

        //pievieno izmantotos burtus

        mainPanel.add(wordPanel);
        mainPanel.add(picturePanel);
        mainPanel.add(userInput);
        mainPanel.add(textUsedLettersPanel);
        mainPanel.add(usedLettersPanel);
        mainPanel.add(btnEnter);
        this.setContentPane(mainPanel);


    }


}
