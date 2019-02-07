package cucumber.glue.hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import static java.lang.Boolean.parseBoolean;

public class SelenideConfiguration {

    private final String REPORTS_FOLDER =  "target";

    public void getBrowser(){
        String browser = System.getProperty("selenide.browser", "chrome");
        boolean headless = parseBoolean(System.getProperty("selenide.headless", "false"));

        Configuration.browser = browser;
        Configuration.headless = headless;
        Configuration.startMaximized = false;
        Configuration.screenshots = true;
        Configuration.reportsFolder = REPORTS_FOLDER;
    }

    public void closeSession(){
        WebDriverRunner.closeWebDriver();
    }
}
