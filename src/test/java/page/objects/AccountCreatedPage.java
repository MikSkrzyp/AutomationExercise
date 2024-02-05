package page.objects;

import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import io.qameta.allure.Step;
import navigation.ApplicationURLs;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class AccountCreatedPage extends BasePage{


    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2/b")
    private WebElement accountCreated;


    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    private WebElement continue_button;


    @Step("Verify that 'ACCOUNT CREATED!' is visible")
    public AccountCreatedPage Verify_that_ACCOUNT_CREATED_is_visible(){
        log().info("Verify that 'ACCOUNT CREATED!' is visible");
        WaitForElement.waitUntilElementIsVisible(accountCreated);
        assertTrue(accountCreated.isDisplayed());


        return this;
    }

    @Step("Click 'Continue' button")
    public HomePage Click_Continue_button(){
        log().info("Click 'Continue' button");
        continue_button.click();
        return new HomePage();
    }

}
