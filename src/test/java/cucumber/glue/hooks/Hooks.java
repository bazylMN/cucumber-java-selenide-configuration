package cucumber.glue.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    private SelenideConfiguration selenideConfiguration;

    public Hooks(SelenideConfiguration selenideConfiguration) {
        this.selenideConfiguration = selenideConfiguration;
    }

    @Before
    public void BeforeScenario() {
        selenideConfiguration.getBrowser();
    }

    @After
    public void AfterScenario() {
        selenideConfiguration.closeSession();
    }
}
