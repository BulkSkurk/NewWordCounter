package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WordCounterTest {
    @Test
    public void testArrayLongestWord() {
        //Arrange
        String word = "Hej jag gillar frukt";
        WordCounter myWordCounter = new WordCounter(word);

        //Act
        myWordCounter.setLongestWord();
        int actual1 = myWordCounter.setLongestWord();

        //Assert
        int expected1 = 6;
        assertEquals(expected1, actual1);
    }

    @Test
    public void testArrayAmountOfWords() {
        //Arrange
        String word = "Hej jag gillar frukt";
        WordCounter myWordCounter = new WordCounter(word);

        //Act
        int actual1 = myWordCounter.setAmountOfWords();

        //Assert
        int expected1 = 4;
        assertEquals(expected1, actual1);
    }

    @Test
    public void testArrayAmountOfCharacters() {
        //Arrange
        String word = "fyra är sex";
        WordCounter myWordCounter = new WordCounter(word);

        //Act
        int actual1 = myWordCounter.setAmountOfCharacters();

        //Assert
        int expected1 = 11;
        assertEquals(expected1, actual1);
    }

    @Test
    public void testArrayAmountOfRows() {
        //Arrange
        String word = "fyra är sex";
        WordCounter myWordCounter = new WordCounter(word);

        //Act
        myWordCounter.setAmountOfRows();
        int actual1 = myWordCounter.setAmountOfRows();

        //Assert
        int expected1 = 2;
        assertEquals(expected1, actual1);
    }

    @Test
    public void testIsNotStopped() {
        //Arrange
        String word = "fyra är sex";
        WordCounter myWordCounter = new WordCounter(word);

        //Act
        boolean actual1 = myWordCounter.setStopped();

        //Assert
        boolean expected1 = false;

        assertEquals(expected1, actual1);

    }

    @Test
    public void testIsStopped() {
        //Arrange
        String word = "fyra är sex stop";
        WordCounter myWordCounter = new WordCounter(word);

        //Act
        boolean actual1 = myWordCounter.setStopped();

        //Assert
        boolean expected1 = true;

        assertEquals(expected1, actual1);

    }

    @Test
    public void testLongestWordActualWord() {
        //Arrange
        String word = "fyra är sex vitkålspudding";
        WordCounter myWordCounter = new WordCounter(word);

        //Act
        String actual1 = myWordCounter.setLongestWordWord();

        //Assert
        String expected1 = "vitkålspudding";

        assertEquals(expected1, actual1);

    }
    @Test
    public void testRemoveStopFromString() {
        //Arrange
        String word = "fyra är sex vitkålspudding stop";
        WordCounter myWordCounter = new WordCounter(word);

        //Act
        myWordCounter.removeStopText();
        String actual1 = myWordCounter.removeStopText();

        //Assert
        String expected1 = "fyra är sex vitkålspudding ";

        assertEquals(expected1, actual1);

    }
}
