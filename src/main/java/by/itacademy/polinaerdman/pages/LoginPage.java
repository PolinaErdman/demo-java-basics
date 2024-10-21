package by.itacademy.polinaerdman.pages;

public class LoginPage extends BasePage {
    protected String LOGIN_PAGE = BASE_URL + "/форма логина";
    protected String title = "Форма логина";

    public void open() {
        System.out.println("Пользователь открыл страницу " + LOGIN_PAGE);
    }

    public String getTitle() {
        return title;
    }
}
