package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PlayGame {

    private List<String> words = new ArrayList<>(Arrays.asList("cat","car", "fork","honey"));
        private Random random = new Random();


    public String wordToGuess (){
        var word = random.nextInt(words.size());
      //  System.out.println("word to guess is" + words.get(word));
        return words.get(word);

    }

}
