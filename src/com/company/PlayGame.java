package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PlayGame {

    private List<String> words = new ArrayList<>(Arrays.asList("CAR","CAT", "AUTUMN", "CANDLE", "CLOUDS", "WORLD", "SCRUM", "AGILE" ));
        private Random random = new Random();
        public String newRandomWord = wordToGuess();



        public String getNewRandomWord() {
        return newRandomWord;
    }


    public String wordToGuess (){
        var word = random.nextInt(words.size());

        return words.get(word);

    }


}
