package cucumber.glue.pageObjects;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

public class NavigationPageObjects {

    public void getPage(String urlName) {
        open(urlName);
    }

    public String getUrl() {
        return url();
    }
}
