package cucumber.glue.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.glue.dataTableMapping.SignUpFormDataTableMapping;
import cucumber.glue.pageObjects.SignUpFormPageObjects;
import io.cucumber.datatable.DataTable;

import static org.assertj.core.api.Assertions.assertThat;

public class SignUpFormPageSteps {

    private SignUpFormPageObjects signUpFormPageObjects;
    private SignUpFormDataTableMapping dataMap;

        public SignUpFormPageSteps(SignUpFormPageObjects signUpFormPageObjects, SignUpFormDataTableMapping dataMap) {
        this.signUpFormPageObjects = signUpFormPageObjects;
        this.dataMap = dataMap;
    }

    @When("I fill form fields with data$")
    public void iFillFormFieldsWithData(DataTable fields) {
        dataMap.writeDataToMap(fields);
        signUpFormPageObjects.signUp(
                dataMap.get().get("login").toString(),
                dataMap.get().get("email").toString(),
                dataMap.get().get("password").toString());
    }

    @Then("I should see form with filled fields")
    public void iShouldSeeFormWithFilledFields() {
        assertThat(signUpFormPageObjects.shouldSeeLoginData()).isEqualTo(dataMap.get().get("login"));
        assertThat(signUpFormPageObjects.shouldSeeEmailData()).isEqualTo(dataMap.get().get("email"));
        assertThat(signUpFormPageObjects.shouldSeePasswordData()).isEqualTo(dataMap.get().get("password"));

    }
}
