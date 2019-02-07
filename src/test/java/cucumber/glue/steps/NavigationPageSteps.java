package cucumber.glue.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java8.En;
import cucumber.glue.pageObjects.NavigationPageObjects;
import org.junit.Assert;

public class NavigationPageSteps implements En {

    private NavigationPageObjects navigationPageObjects;

    public NavigationPageSteps(NavigationPageObjects navigationPageObjects) {
        this.navigationPageObjects = navigationPageObjects;
    }

    @Given("I go to {string} page")
    public void iGoToPage(String urlName){
        navigationPageObjects.getPage(urlName);
   }

    @Then("I should be on {string} page")
    public void iShouldBeOnPage(CharSequence name){
        String currentUrl = navigationPageObjects.getUrl();
        Assert.assertTrue(currentUrl.contains(name));
    }
}
