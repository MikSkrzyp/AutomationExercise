package page.objects;

import driver.manager.DriverUtils;
import io.qameta.allure.Step;
import navigation.ApplicationURLs;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;
import page.objects.Singup_LoginPage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.AssertJUnit.assertTrue;

public class HomePage extends  BasePage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/h2")
    private WebElement welcome_text;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    private WebElement signup_login_button;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
    private WebElement logged_as;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    private WebElement deleteAccount_button;

    @Step("Assert that Welcome Text is dispalyed")
    public HomePage assertThatWelcomeTextIsDisplayed() {
        log().info("Assert that Welcome Text  is dispalyed");
        WaitForElement.waitUntilElementIsVisible(welcome_text);
        assertThat(welcome_text.getText()).isEqualTo("FEATURES ITEMS");
        return this;
    }

    @Step("Go To Signup Login Page")
    public Singup_LoginPage goToSignup_LoginPage(){
        log().info("Go To Signup Login Page");
        signup_login_button.click();

        return new Singup_LoginPage();
    }


    @Step("Verify that 'Logged in as username' is visible\n")
    public HomePage Verify_that_Logged_in_as_username_is_visible(){
        log().info("Verify that 'Logged in as username' is visible");
        DriverUtils.navigateToPage(ApplicationURLs.APPLICATION_URL);
        WaitForElement.waitUntilElementIsVisible(logged_as);
        assertTrue(logged_as.isDisplayed());
        return this;
    }

    @Step("Click 'Delete Account' button")
    public DeleteAccountPage Click_DeleteAccount_button(){
        log().info("Click 'Delete Account' button");
        deleteAccount_button.click();
        return  new DeleteAccountPage();
    }

}
