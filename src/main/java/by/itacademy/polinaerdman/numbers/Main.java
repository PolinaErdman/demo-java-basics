package by.itacademy.polinaerdman.numbers;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            String numberAsAString = TranslatorNumbersToWord.numberToWord(i);
            System.out.println(numberAsAString);
        }
    }
}
