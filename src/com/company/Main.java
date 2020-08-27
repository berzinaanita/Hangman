package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        GameField.startNewGame();

        System.out.println(" Plesase enter letter:");
        Scanner input = new Scanner(System.in);
        System.out.println();
        var guess = input.next();

        GameField.playGame(guess);






    }
}
