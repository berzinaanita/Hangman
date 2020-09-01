package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PlayGame {

    private List<String> words = new ArrayList<>(Arrays.asList("cat","cary", "farks","haneyy"));
        private Random random = new Random();
        public String newRandomWord = wordToGuess();


    public String wordToGuess (){
        var word = random.nextInt(words.size());
        return words.get(word);

    }

    public String getWordToDisplay() {
        var wordDisplay = new String(new char[newRandomWord.length()]).replace("\0", "_");

        return wordDisplay;
    }


}
