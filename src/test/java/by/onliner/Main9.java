package by.onliner;

import java.util.ArrayList;
import java.util.List;

public class Main9 {
    public static void main(String[] args) {
        List<Employee> users = new ArrayList<>();
        users.add(new Employee(42, "Oleg"));
        users.add(new Employee(22, "Olga"));
        users.add(new Employee(30, "Bob"));
        users.add(new Employee(39, "Mary"));

        List<Employee> filteredUsers = users.stream().filter(x -> x.getAge() > 20).toList();
        System.out.println(filteredUsers);
        List<Employee> filteredUsers2 = filterByAge(users, 20);
        System.out.println(filteredUsers2);
    }

    public static List<Employee> filterByAge(List<Employee> users, Integer age) {
        List<Employee> filteredUsers = new ArrayList<>();
        for (Employee user : users) {
            if(user.getAge() > age) {
                filteredUsers.add(user);
            }
        }
        return filteredUsers;
    }
}
