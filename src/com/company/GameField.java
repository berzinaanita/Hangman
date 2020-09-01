package com.company;

import java.util.ArrayList;
import java.util.List;

public class GameField {


    private List<Character> usedLetters = new ArrayList<>();
    private PlayGame game = new PlayGame();
    private int wrongGuesses = 0;
    //private String word = game.newRandomWord;
    private String wordToDisplay = game.getWordToDisplay();

    /*public String getWordToDisplay() {
        var word = game.wordToGuess();
        var wordDisplay = new String(new char[word.length()]).replace("\0", "_");

        return wordDisplay;
    }*/


    public List<Character> getUsedLetters() {
        return usedLetters;
    }

    public void setUsedLetters(List<Character> usedLetters) {
        this.usedLetters = usedLetters;
    }

    public static String  startNewGame (){
        GameField field = new GameField();
        var word = field.wordToDisplay;
        System.out.println(word);
        return word;

    }

    public void hangMan (String guess) {

       // while (wrongGuesses <= 7) {
            var newWord = "";

            for (int i = 0; i < game.newRandomWord.length(); i++) {
                if (game.newRandomWord.charAt(i) == guess.charAt(0)) {
                    newWord += guess.charAt(0);

          /*  } else if (newWord.charAt(i) != '_'){
                newWord += word.charAt(i);

            }*/
                } else {
                    newWord += "_";
                }

            }



            if (wordToDisplay.equals(newWord)) {
                ++wrongGuesses;
                System.out.println(wrongGuesses);
                // un te atkarībā no nepareizo atbilžu skaita, vajadzētu vienoties klāt hangman bildem

            } else {
                wordToDisplay = newWord;
            }

            if (wordToDisplay.equals(game.newRandomWord)) {
                System.out.println("Game won, you guess word:" + game.newRandomWord);
            } else {
                System.out.println(newWord);
            }
        System.out.println(guess);

        }


    public static void playGame(String guess){
        GameField field = new GameField();
        field.hangMan(guess);
    }


}
