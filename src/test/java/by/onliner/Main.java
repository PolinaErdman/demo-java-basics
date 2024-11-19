package by.onliner;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Faker faker = new Faker();
            User user = new User(faker.name().firstName(), faker.internet().password());

            LoginStep loginStep = new LoginStep();
            loginStep.fillLoginForm(user);
        }
    }
}
