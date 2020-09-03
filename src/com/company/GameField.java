package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.spi.AbstractResourceBundleProvider;

public class GameField {


    private List<Character> usedLetters = new ArrayList<>();
    private PlayGame game = new PlayGame();
    private int wrongGuesses = 0;
    private String wordToGuess = game.getNewRandomWord();
    private String wordToDisplay = getWordToDisplay(wordToGuess);
    private int guessedLetters = 0;


    public int getWrongGuesses() {
        return wrongGuesses;
    }

    public String getWordToDisplay(String word) {

        var wordDisplay = new String(new char[word.length()]).replace("\0", "_");

        return wordDisplay;
    }



    public static GameField startNewGame() {
        GameField field = new GameField();
        var word = field.wordToDisplay;
        System.out.println(word);
        return field;

    }

    public void hangMan(String guess) {

 //     while (wrongGuesses <= Main.MaxLives) {
        var newWord = "";

        for (var letter:usedLetters ) {
            if (letter == guess.charAt(0)){
                System.out.println("This letter has already been used, try again: ");
                return;
            }

        }

            for (int i = 0; i < wordToGuess.length(); i++) {

                if (wordToGuess.charAt(i) == guess.charAt(0)) {
                    newWord += guess.charAt(0);

            } else if ( wordToDisplay.charAt(i) != '_'){
                newWord += wordToGuess.charAt(i);

            } else {
                    newWord += "_";
                }
            }




            if (!convertWordToGuessToList().contains(guess.charAt(0))) {
                ++wrongGuesses;
                System.out.println(" You have made " + wrongGuesses +
                        " wrong guesses, guesses left: " + (Main.MaxLives - wrongGuesses));


                if(wrongGuesses == Main.MaxLives){
                    System.out.println("Game over!");
                    System.out.println(" Do you want to play another game? (Y/N)");

                    //parādās Game over, bet cikls neapstājas.
                    //return;
                }

                // un te atkarībā no nepareizo atbilžu skaita, vajadzētu vienoties klāt hangman bildem

            } else {
                wordToDisplay = newWord;
            }

        if (wordToDisplay.equals(wordToGuess)) {
            System.out.println("Game won, you guess word:" + wordToGuess);
        } else {
            System.out.println(newWord);
        }

        usedLetters.add(guess.charAt(0));
        System.out.println(" You have used letters:" + usedLetters);

    }

    public List<Character> convertWordToGuessToList() { // izveidoju šo, lai dabūtu to wrongGuesses
        char[] wordToGuessToCharArray = wordToGuess.toCharArray();
        List<Character> wordCharList = new ArrayList<>();

        for (var ch:wordToGuessToCharArray) {
            wordCharList.add(ch);
        }
        return wordCharList;
    }
//    }


    public static void playGame(String guess, GameField field) {

        field.hangMan(guess);
    }


}
