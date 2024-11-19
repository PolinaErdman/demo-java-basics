package by.onliner;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Denis");
        names.add("Oleg");
        names.add("nikita");
        names.add("Yana");
        names.add("Vika");

        names.stream()
                .filter(name -> !name.startsWith("O"))
                .forEach((name) -> {
            System.out.println("Hello, " + name);
        });
        //System.out.println(names);

//        String name;
//        for (int i = 0; i < names.size(); i++) {
//            name = names.get(i).toUpperCase();
//            names.set(i, name);
//        }
//        System.out.println(names);
    }
}
