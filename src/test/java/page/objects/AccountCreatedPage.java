package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class AccountCreatedPage extends BasePage{


    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2/b")
    private WebElement accountCreated;


    @Step("Verify that 'ACCOUNT CREATED!' is visible")
    public AccountCreatedPage Verify_that_ACCOUNT_CREATED_is_visible(){
        log().info("Verify that 'ACCOUNT CREATED!' is visible");
        WaitForElement.waitUntilElementIsVisible(accountCreated);
        assertTrue(accountCreated.isDisplayed());


        return this;
    }

}
