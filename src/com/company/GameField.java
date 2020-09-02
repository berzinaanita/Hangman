package com.company;

import java.util.ArrayList;
import java.util.List;

public class GameField {


    private List<Character> usedLetters = new ArrayList<>();
    private PlayGame game = new PlayGame();
    private int wrongGuesses = 0;
    private String wordToGuess = game.getNewRandomWord();
    private String wordToDisplay = getWordToDisplay(wordToGuess);


    //private  String wordGuess = game.wordToGuess();
    //private String word = game.newRandomWord;

    public int getWrongGuesses() {
        return wrongGuesses;
    }
    public String getWordToDisplay(String word) {

        var wordDisplay = new String(new char[word.length()]).replace("\0", "_");

        return wordDisplay;
    }

    public List<Character> getUsedLetters() {
        return usedLetters;
    }

    public void setUsedLetters(List<Character> usedLetters) {
        this.usedLetters = usedLetters;
    }

    public static GameField   startNewGame (){
        GameField field = new GameField();
        var word = field.wordToDisplay;
        System.out.println(word);
        return field;


    }

    public void hangMan (String guess) {

       // while (wrongGuesses <= 7) {
            var newWord = "";

            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess.charAt(0)) {
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

            if (wordToDisplay.equals(wordToGuess)) {
                System.out.println("Game won, you guess word:" + wordToGuess);
            } else {
                System.out.println(newWord);
            }
        System.out.println(guess);

        }


    public static void playGame(String guess, GameField field){

        field.hangMan(guess);
    }


}
