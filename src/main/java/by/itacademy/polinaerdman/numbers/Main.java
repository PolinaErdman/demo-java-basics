package by.itacademy.polinaerdman.numbers;

public class Main {
    public static void main(String[] args) {
        int number = 0;
        String numberAsAString = numberToWord(number);

        System.out.println(numberAsAString);
    }
    private static String numberToWord(int number) {
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
            default: return "Not a digit!";
        }
    }
}
