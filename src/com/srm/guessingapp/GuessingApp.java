package com.srm.guessingapp;

import java.util.Random;
import java.util.Scanner;

public class GuessingApp {
    private static final int MAX_ATTEMPTS = 5;
    private static final int MAX_HINTS = 2;

    private int targetNumber;
    private int attempts;
    private int hintCount;

    Scanner sc = new Scanner(System.in);

    // Constructor
    public GuessingApp() {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1; // 1 to 100
        attempts = 0;
        hintCount = 0;
    }

    public void startGame() {
        System.out.println("🎮 Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts\n");

        boolean isWon = false;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your guess: ");

            try {
                int guess = sc.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Correct! You won in " + attempts + " attempts.");
                    isWon = true;
                    break;
                } else if (guess > targetNumber) {
                    System.out.println("Too High!");
                } else {
                    System.out.println("Too Low!");
                }

                generateHint();

            } catch (Exception e) {
                System.out.println(" Invalid input! Enter numbers only.");
                sc.next(); // clear input
            }
        }

    }
}
