package StepDefinitions;

import Pages.LocatorPage;
import Pages.Parent;
import Utilities.DriverCenter;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AllStepDefinitions extends Parent {

    LocatorPage lp =new LocatorPage();
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        DriverCenter.getDriver().get("https://test.mersys.io/");
    }
    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        lp.mySendKeys(lp.username,"turkeyts");
        lp.mySendKeys(lp.password,"TechnoStudy123");
        lp.myClick(lp.loginbutton);
    }
    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
     lp.verifyContainsText(lp.textTechnoStudy,"Techno Study");

    }
    @And("Click on the element in LocatorPage")
    public void clickOnTheElementInLocatorPage(DataTable Buttons) {
        List<String> ButtonsList =Buttons.asList(String.class);
        for (int i=0;i<ButtonsList.size();i++){
        WebElement linkWebElement =lp.getWebELement(ButtonsList.get(i));
        lp.myClick(linkWebElement);
        }

    }
    @And("User sending the knowladge")
    public void userSendingTheKnowladge (DataTable Dt){
    List<List<String>> knowladges =Dt.asLists(String.class);

        for (int i = 0; i < knowladges.size(); i++) {
            WebElement e =lp.getWebELement(knowladges.get(i).get(0));
            String word =knowladges.get(i).get(1);
            lp.mySendKeys(e,word);
        }
    }

    @Then("Success massage should be displayed")
    public void successMassageShouldBeDisplayed(){
    lp.verifyContainsText(lp.successMessage,"success");
    }

    @And("Customer delete the element from LocatorPage")
    public void customerDeleteTheElementFromLocatorPage(DataTable Dt) {
    List<String> deletelist=Dt.asList(String.class);

        for (int i = 0; i < deletelist.size(); i++) {
            lp.DeleteItem(deletelist.get(i));
            
        }
    }
        @And("Create a User")
        public void createAUser(DataTable Dt) {
            List<List<String>> knowladges = Dt.asLists(String.class);

            for (int i = 0; i < knowladges.size(); i++) {
                WebElement e = lp.getWebELement(knowladges.get(i).get(0));
                String word = knowladges.get(i).get(1);
                lp.mySendKeys(e, word);
            }
        }

    }
