package cucumber.glue.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.glue.pageObjects.NavigationPageObjects;
import org.junit.Assert;

public class NavigationPageSteps {

    private NavigationPageObjects navigationPageObjects;

    public NavigationPageSteps(NavigationPageObjects navigationPageObjects) {
        this.navigationPageObjects = navigationPageObjects;
    }

    @Given("I go to (.*?) page")
    public void iGoToPage(String urlName){
        navigationPageObjects.getPage(urlName);
   }

    @Then("I should be on (.*?) page")
    public void iShouldBeOnPage(String name){
        String currentUrl = navigationPageObjects.getUrl();
        Assert.assertTrue(currentUrl.contains(name));
    }
}
