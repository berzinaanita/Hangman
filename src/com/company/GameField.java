package com.company;

import java.util.ArrayList;
import java.util.List;

public class GameField {

    private String wordToDisplay;
    private List<Character> usedLetters = new ArrayList<>();
    private PlayGame game = new PlayGame();


    public String getWordToDisplay() {
        var word = game.wordToGuess();
        var wordDisplay = new String(new char[word.length()]).replace("\0", "_");

        return wordDisplay;
    }

    public void setWordToDisplay(String wordToDisplay) {
        this.wordToDisplay = wordToDisplay;
    }

    public List<Character> getUsedLetters() {
        return usedLetters;
    }

    public void setUsedLetters(List<Character> usedLetters) {
        this.usedLetters = usedLetters;
    }


}
