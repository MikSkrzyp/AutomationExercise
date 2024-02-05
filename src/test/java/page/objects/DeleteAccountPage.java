package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

import static org.testng.AssertJUnit.assertTrue;

public class DeleteAccountPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2/b")
    private WebElement account_deleted;


    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    private WebElement continue_button;


    @Step("Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button")
    public DeleteAccountPage Verify_that_ACCOUNT_DELETED_is_visible_and_click_continue(){
        log().info("Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button");
        WaitForElement.waitUntilElementIsVisible(account_deleted);
        assertTrue(account_deleted.isDisplayed());
        continue_button.click();


        return this;
    }
}
