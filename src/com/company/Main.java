package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class Main {
    public static final int MaxLives = 7; // max dzīvību skaitu nodefinēju kā konstanti

    public static void main(String[] args) {

        GameField newGame = GameField.startNewGame();
        int wrongGuesses = newGame.getWrongGuesses();
        List<Character> usedLetters = new ArrayList<>();

        while (wrongGuesses < MaxLives){ // cikls atkārtojas kamēr nav sasniegts max dzīvību skaits

            System.out.println(" Please enter letter:");
            Scanner input = new Scanner(System.in);
            System.out.println();
            var guess = input.next();

            GameField.playGame(guess, newGame);

            usedLetters.add(guess.charAt(0)); // nekādi nesaprotu kāpēc šeit nesaglabājas visi ievadītie burti.


            while(usedLetters.contains(guess)){ // ciklam vajadzētu pārbaudīt vai burts nav ievadīts atkārtoti, bet šis arī nestrādā
                System.out.println("This letter has already been used, try again: ");
                guess = input.next();
            }

        }


    }

}
