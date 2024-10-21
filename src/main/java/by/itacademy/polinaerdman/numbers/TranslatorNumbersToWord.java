package by.itacademy.polinaerdman.numbers;

public class TranslatorNumbersToWord {
    public static String numberToWord(int number) {
        switch (number) {
            case 0 : return "zero";
            case 1 : return "one";
            case 2 : return "two";
            case 3 : return "three";
            case 4 : return "four";
            case 5 : return "five";
            case 6 : return "six";
            case 7 : return "seven";
            case 8 : return "eight";
            case 9 : return "nine";
            default: return "The value is not in the range 0 to 9!";
        }
    }
}
