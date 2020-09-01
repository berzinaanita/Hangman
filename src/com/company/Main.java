package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var Visual = new Visual("Hangman");
        Visual.start();


        GameField.startNewGame();

        System.out.println(" Please enter letter:");
        Scanner input = new Scanner(System.in);
        System.out.println();
        var guess = input.next();
//
//        Visual userInput = new Visual(Visual.getUserInput().toString());
//        var guess = userInput.getUserInput();
//
//        GameField.playGame(guess.toString());

        GameField.playGame(guess);


    }
}
