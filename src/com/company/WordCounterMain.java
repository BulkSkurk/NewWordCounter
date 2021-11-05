package com.company;

public class WordCounterMain {

    public static void main(String[] args) {

        WordCounter myWordCounter = new WordCounter(" ");

        System.out.println("Welcome! Please write however many words you prefer.");
        System.out.println("To quit and see amounts please write stop followed by the enter key");

        while (myWordCounter.setStopped() == false) {
            myWordCounter.scanWord();
            myWordCounter.setStopped();
            myWordCounter.setAmountOfRows();
            myWordCounter.setAmountOfWords();
            myWordCounter.removeStopText();
            myWordCounter.setLongestWord();
            myWordCounter.setLongestWordWord();
            myWordCounter.setAmountOfCharacters();

            if (myWordCounter.setStopped() == true) {
                myWordCounter.printAll();
            }
        }
    }
}
