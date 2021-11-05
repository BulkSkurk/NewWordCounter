package com.company;

import java.util.Scanner;

public class WordCounter {

    private String scannedWord;
    private String longestWordWord = "";
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
        System.out.println("Total amount of written words before stop: " + totalAmountOfWords);
        System.out.println("Total amount of written characters excluding stop: " + totalAmountOfLetters);
        System.out.println("Total amount of rows written excluding stop : " + totalAmountOfRows);
    }

    public int setLongestWord() {
        String[] scannedWordsArray = scannedWord.split(" ");

        for (int i = 0; i < scannedWordsArray.length; i++) {

            if (scannedWordsArray[i].length() > longestWordAmount) {
                longestWordAmount = scannedWordsArray[i].length();
            }

        }
        return longestWordAmount;
    }

    public String setLongestWordWord() {
        String[] scannedWordsArray = scannedWord.split(" ");

        for (int i = 0; i < scannedWordsArray.length; i++) {

            if (scannedWordsArray[i].length() > longestWordWord.length()) {
                longestWordWord = scannedWordsArray[i];
            }
        }
        return longestWordWord;
    }


    public int setAmountOfWords() {
        String[] scannedWordsArray = scannedWord.split(" ");

        for (int i = 0; i < scannedWordsArray.length; i++) {

            totalAmountOfWords++;
            if(scannedWordsArray[i].contains("stop")){
                totalAmountOfWords--;
                i = scannedWordsArray.length;
            }
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

    public String removeStopText() {

        if (scannedWord.contains("stop")) {
            String tempString = scannedWord.replace("stop", "");
            scannedWord = tempString;

        }
        return scannedWord;


    }
}
