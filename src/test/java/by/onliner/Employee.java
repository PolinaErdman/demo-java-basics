package by.onliner;

import java.util.Objects;

public class Employee {
    private String name;
    private int age;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee user2 = (Employee) o;
        return age == user2.age && Objects.equals(name, user2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
