package by.onliner;

import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Denis");
        names.add("Oleg");
        names.add("nikita");
        names.add("Yana");
        names.add("Vika");
        names.add("Viktor");

        List <String> filteredNames = names.stream().filter((name) -> {
           return  name.startsWith("V");
        }).toList();

        System.out.println(filteredNames);
    }
}
