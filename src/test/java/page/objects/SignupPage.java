package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import waits.WaitForElement;
import static org.testng.AssertJUnit.assertTrue;
public class SignupPage extends BasePage{


    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/h2/b")
    private WebElement enter_account_inforamtion_text;

    @FindBy(xpath = "//*[@id=\"id_gender1\"]")
    private WebElement title;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"days\"]")
    private WebElement dateOfBirth1;

    @FindBy(xpath = "//*[@id=\"months\"]")
    private WebElement dateOfBirth2;

    @FindBy(xpath = "//*[@id=\"years\"]")
    private WebElement dateOfBirth3;


    @FindBy(xpath = "//*[@id=\"newsletter\"]")
    private WebElement signUp_for_our_new_newsletter_button;

    @FindBy(xpath = "//*[@id=\"optin\"]")
    private WebElement receive_special_offers_from_our_partners_button;

    @Step("Verify that 'ENTER ACCOUNT INFORMATION' is visible")
    public SignupPage Verify_that_ENTER_ACCOUNT_INFORMATION_is_visible(){
        log().info("Verify that 'ENTER ACCOUNT INFORMATION' is visible");
        WaitForElement.waitUntilElementIsVisible(enter_account_inforamtion_text);
        assertTrue(enter_account_inforamtion_text.isDisplayed());
        return this;
    }

    @Step("Fill details: Title, Name, Email, Password, Date of birth")
    public SignupPage Fill_details_Title_Name_Email_Password_Dateofbirth(){
        log().info("Fill details: Title, Name, Email, Password, Date of birth");
        title.click();
        password.sendKeys("lol");

        Select dateOfBirth1Select = new Select(dateOfBirth1);
        dateOfBirth1Select.selectByIndex(10);

        Select dateOfBirth2Select = new Select(dateOfBirth2);
        dateOfBirth2Select.selectByIndex(3);

        Select dateOfBirth3Select = new Select(dateOfBirth3);
        dateOfBirth3Select.selectByIndex(20);

        return this;
    }

    @Step("Select checkbox 'Sign up for our newsletter!'")
    public SignupPage Select_checkbox_Sign_up_for_our_newsletter(){
        log().info("Select checkbox 'Sign up for our newsletter!'");
        signUp_for_our_new_newsletter_button.click();
        return this;
    }

    @Step("Select checkbox 'Receive special offers from our partners")
    public SignupPage Select_checkbox_Receive_special_offers_from_our_partners(){
        log().info("Select checkbox 'Receive special offers from our partners");
        receive_special_offers_from_our_partners_button.click();
        return this;
    }
}
