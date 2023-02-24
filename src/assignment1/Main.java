package assignment1;

import assignment2.FlipCoin;

public class Main {
    public static void main(String[] args) {
        LogicsAndNumbersStuff number1 = new LogicsAndNumbersStuff();
        System.out.println(number1.diffMultipliedByC(3, 9, 5));

        LogicsAndNumbersStuff stayInBed = new LogicsAndNumbersStuff();
        System.out.println(stayInBed.canYouStayInBed(true, false));

        LogicsAndNumbersStuff arrayOfNumbers = new LogicsAndNumbersStuff();
        System.out.println(arrayOfNumbers.sumOfNumbers());

        StringHandler replaceChar = new StringHandler();
        System.out.println(replaceChar.stringManipulation("citron"));

        StringHandler reversedWord = new StringHandler();
        System.out.println(reversedWord.stringReverse("hello"));


        //assignment 2
        FlipCoin randomFlip = new FlipCoin();
        System.out.println(randomFlip.flipCoin());
    }
}

