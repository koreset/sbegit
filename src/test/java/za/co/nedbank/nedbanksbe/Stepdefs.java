package za.co.nedbank.nedbanksbe;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Stepdefs extends BaseDef {
    private BaseDef base;

    public Stepdefs(BaseDef base) {
        this.base = base;
    }

//    @When("^User selects BUSINESS BUNDLE One option$")
//    public void user_selects_BUSINESS_BUNDLE_One_option() throws Exception {
//        Actions action = new Actions(base.driver);
//        action.moveToElement(base.driver.findElement(By.xpath("//div[@class='col-sm-12']/h3[text()='BUSINESS BUNDLE 1']"))).build().perform();
////        base.driver.findElement(By.xpath("//div[contains(@class,'row')]//div[3]//div[1]//div[1]//div[5]//div[1]//div[1]//button[text()='Select']")).click();
//    }


    @Given("^I go to a dummy url$")
    public void iGoToADummyUrl() throws Throwable {
        System.out.println("I go to a dummy url");
    }

    @When("^I click on some dummy link$")
    public void iClickOnSomeDummyLink() throws Throwable {
        System.out.println("I click on some dummy link");
    }


    @Then("^I should be welcomed warmly$")
    public void iShouldBeWelcomedWarmly() throws Throwable {
        System.out.println("I am welcomed warmly");
    }

//    @Then("^this step should fail$")
//    public void thisStepShouldFail() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
////        Assert.assertFalse(true);
//    }
}