package assignment1;

import assignment2.FlipCoin;

public class Main {
    public static void main(String[] args) {
        //Calling methods from assignment 1 - LogicAndNumbersStuff
        LogicsAndNumbersStuff resultNumber = new LogicsAndNumbersStuff();
        System.out.println(resultNumber.diffMultipliedByC(3, 9, 5));

        LogicsAndNumbersStuff stayInBed = new LogicsAndNumbersStuff();
        System.out.println(stayInBed.canYouStayInBed(true, true));

        LogicsAndNumbersStuff arrayOfNumbers = new LogicsAndNumbersStuff();
        int[] numbers = {2, 3, 5, 6, 8};
        System.out.println(arrayOfNumbers.sumOfNumbers(numbers)); //sum
        System.out.println(arrayOfNumbers.averageOfNumber(numbers)); //average
//_____________________________________________________________________________________

        //Calling methods from assignment 1 - StringHandler
        StringHandler replaceChar = new StringHandler();
        System.out.println(replaceChar.stringManipulation("citron"));

        StringHandler reversedWord = new StringHandler();
        System.out.println(reversedWord.stringReverse("hello"));
    }
}

