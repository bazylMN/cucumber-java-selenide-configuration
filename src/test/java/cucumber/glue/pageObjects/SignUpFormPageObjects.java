package cucumber.glue.pageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SignUpFormPageObjects {

    private static final String USER_LOGIN = "user[login]";
    private static final String USER_EMAIL = "user[email]";
    private static final String USER_PASSWORD = "user[password]";

    public void signUp(String login, String email, String password) {
        sendKeysForInputWithAttributeName(USER_LOGIN, login);
        sendKeysForInputWithAttributeName(USER_EMAIL, email);
        sendKeysForInputWithAttributeName(USER_PASSWORD, password);
    }

    public String shouldSeeLoginData() {
        return javaScriptGetData(USER_LOGIN);
    }

    public String shouldSeeEmailData() {
        return javaScriptGetData(USER_EMAIL);
    }

    public String shouldSeePasswordData() {
        return javaScriptGetData(USER_PASSWORD);
    }

    private void sendKeysForInputWithAttributeName(String inputSelector, String keyToSend){
        $(By.id(inputSelector)).sendKeys(keyToSend);
    }

    private String javaScriptGetData(String data){
        return executeJavaScript("return document.getElementById('"+ data +"').value");
    }
}
