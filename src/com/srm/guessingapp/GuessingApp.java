package com.srm.guessingapp;

import java.util.Random;
import java.util.Scanner;

public class GuessingApp {
    private static final int MAX_ATTEMPTS = 5;
    private static final int MAX_HINTS = 2;

    private int targetNumber;
    private int attempts;
    private int hintCount;

    Scanner scanner = new Scanner(System.in);

    // Constructor
    public GuessingApp() {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1; // 1 to 100
        attempts = 0;
        hintCount = 0;
    }
}
