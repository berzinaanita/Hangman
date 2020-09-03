package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class Main {
    public static final int MaxLives = 7; // max dzīvību skaitu nodefinēju kā konstanti

    public static void main(String[] args) {

        GameField newGame = GameField.startNewGame();
        int wrongGuesses = newGame.getWrongGuesses();


        while (wrongGuesses < MaxLives){ // cikls atkārtojas kamēr nav sasniegts max dzīvību skaits

            System.out.println(" Please enter letter:");
            Scanner input = new Scanner(System.in);
            System.out.println();
            var guess = input.next();

            GameField.playGame(guess, newGame);



        }


    }

}
