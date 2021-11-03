package com.company;

import java.util.Scanner;

public class WordCounter {

    private String scannedWord;
    private String longestWordWord = " ";
    private int longestWordAmount;
    private int totalAmountOfLetters;
    private int totalAmountOfWords;
    private int totalAmountOfRows;
    private boolean loopStopper;

    Scanner scan = new Scanner(System.in);

    public WordCounter(String myScannedWord) {
        scannedWord = myScannedWord;
    }

    public String scanWord() {
        scannedWord = scan.nextLine();
        return scannedWord;
    }

    public void printAll() {
        System.out.println("The longest word is: " + longestWordAmount + " letters long!");
        System.out.println("The longest word is: " + longestWordWord);
        System.out.println("Total amount of written words: " + totalAmountOfWords);
        System.out.println("Total amount of written characters: " + totalAmountOfLetters);
        System.out.println("Total amount of rows written excluding stop : " + totalAmountOfRows);
    }

    public int setLongestWord() {
        String[] scannedWordsArray = scannedWord.split(" ");

        for (int i = 0; i < scannedWordsArray.length; i++) {

            if (scannedWordsArray[i].length() > longestWordAmount && !scannedWord.contains("stop")) {
                longestWordAmount = scannedWordsArray[i].length();
            }

        }
        return longestWordAmount;
    }

    public String setLongestWordWord() {
        String[] scannedWordsArray = scannedWord.split(" ");

        for (int i = 0; i < scannedWordsArray.length; i++) {

            if (scannedWordsArray[i].length() > longestWordWord.length() && !scannedWord.contains("stop")) {
                longestWordWord = scannedWordsArray[i];
            }
        }
        return longestWordWord;
    }


    public int setAmountOfWords() {
        String[] scannedWordsArray = scannedWord.split(" ");

        for (int i = 0; i < scannedWordsArray.length; i++) {

            totalAmountOfWords++;
        }
        return totalAmountOfWords;
    }

    public int setAmountOfCharacters() {
        for (int i = 0; i < scannedWord.length(); i++) {
            totalAmountOfLetters++;

        }
        return totalAmountOfLetters;
    }

    public int setAmountOfRows() {
        if (!scannedWord.contains("stop")) {
            totalAmountOfRows = totalAmountOfRows + 1;
        }

        return totalAmountOfRows;

    }

    public boolean setStopped() {
        if (scannedWord.contains("stop")) {
            loopStopper = true;
        }
        return loopStopper;
    }

    public void removeStopText() {
        totalAmountOfWords = totalAmountOfWords - 1;
        totalAmountOfLetters = totalAmountOfLetters - 4;
    }
}
