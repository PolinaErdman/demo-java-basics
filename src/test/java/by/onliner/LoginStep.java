package by.onliner;

public class LoginStep {
    public void fillLoginForm(String name, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.fillName(name);
        loginPage.fillPassword(password);
    }

    public void fillLoginForm(User user) {
        fillLoginForm(user.getName(), user.getPassword());
    }
}
