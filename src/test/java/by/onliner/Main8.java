package by.onliner;

import java.util.ArrayList;
import java.util.List;

public class Main8 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Denis");
        names.add("Valeriy");
        names.add("Yan");
        names.add("Oleg");
        names.add("nikita");
        names.add("Yana");
        names.add("Vika");
        names.add("Viktor");

        List<String> nameFilter = names.stream().filter(x -> x.length() >= 5).toList();
        System.out.println(nameFilter);
    }
}
