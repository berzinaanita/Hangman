package com.company;

import java.util.ArrayList;
import java.util.List;

public class GameField {


    private List<Character> usedLetters = new ArrayList<>();
    private PlayGame game = new PlayGame();

    public int getWrongGuesses() {
        return wrongGuesses;
    }

    private int wrongGuesses = 0;


    public String getWordToDisplay() {
        var word = game.wordToGuess();
        var wordDisplay = new String(new char[word.length()]).replace("\0", "_");

        return wordDisplay;
    }


    public List<Character> getUsedLetters() {
        return usedLetters;
    }

    public void setUsedLetters(List<Character> usedLetters) {
        this.usedLetters = usedLetters;
    }

    public static void startNewGame (){
        GameField field = new GameField();
         var word = field.getWordToDisplay();
        System.out.println(word);
    }

    public void hangMan (String guess){
        var newWord = "";
        var word = game.wordToGuess();
        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i) == guess.charAt(0)){
                newWord += guess.charAt(0);

        } else if (newWord.charAt(i) != '_'){
                newWord += word.charAt(i);

            }else {
                newWord += "_";
            }

        }

        var wordDisplay = getWordToDisplay();

        if (wordDisplay.equals(word)){
            ++ wrongGuesses;
            System.out.println(wrongGuesses);
            // un te atkarībā no nepareizo atbilžu skaita, vajadzētu vienoties klāt hangman bildem

        } else {
            wordDisplay = newWord;
        }

        if (wordDisplay.equals(word)){
            System.out.println("Game won, you guess word:" + word);
        }

    }

    public static void playGame(String guess){
        GameField field = new GameField();
        field.hangMan(guess);
    }


}
