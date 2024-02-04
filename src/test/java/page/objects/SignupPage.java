package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;
import static org.testng.AssertJUnit.assertTrue;
public class SignupPage extends BasePage{


    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/h2/b")
    private WebElement enter_account_inforamtion_text;

    @Step("Verify that 'ENTER ACCOUNT INFORMATION' is visible")
    public SignupPage Verify_that_ENTER_ACCOUNT_INFORMATION_is_visible(){
        log().info("Verify that 'ENTER ACCOUNT INFORMATION' is visible");
        WaitForElement.waitUntilElementIsVisible(enter_account_inforamtion_text);
        assertTrue(enter_account_inforamtion_text.isDisplayed());
        return this;
    }
}
