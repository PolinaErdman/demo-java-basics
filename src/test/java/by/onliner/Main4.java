package by.onliner;

import java.util.*;

public class Main4 {
    public static List<String> sort(List<String> list){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith("J")) {
                result.add(list.get(i));
            }
        }
        return result;
    }
    public static List<String> sortBy(List<String> list, String firstLetter){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith(firstLetter)) {
                result.add(list.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        System.out.println(names.add("Artur"));
        System.out.println(names.add("Stepan"));
        System.out.println(names.add("Gartur"));
        System.out.println(names.add("Anastasia"));
        System.out.println(names.add("Mark"));
        System.out.println(names);

//        for (String name : names) {
//            System.out.println("Hello, " + name);
//        }

//        names.stream().forEach(System.out::println);

//        List<String> sortedNames = new ArrayList<>();
//        sortedNames = sort(names);
//        System.out.println(sortedNames);
//        sortedNames = sortBy(sort(names, "B");
//        System.out.println(sortedNames);
        }
    }
