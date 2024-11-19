package by.onliner;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Artur");
        names.add("Stepan");
        names.add("Artur");
        names.add("Anastasia");
        names.add("Mark");

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Привет, " + names.get(i));
//        }

        for (String name:names){
            System.out.println(name);
        }
    }
}
