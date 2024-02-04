package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.testng.AssertJUnit.assertTrue;

public class Singup_LoginPage extends BasePage {


    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/h2")
    private WebElement NewUserSignup;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
    private WebElement name;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
    private WebElement email;

    @Step("Verify 'New User Signup!' is visible")
    public Singup_LoginPage Verify_NewUserSignup_is_visible(){
        log().info("Verify 'New User Signup!' is visible");
        WaitForElement.waitUntilElementIsVisible(NewUserSignup);
        assertTrue(NewUserSignup.isDisplayed());


        return this;
    }
    @Step(" Enter name and email address")
    public Singup_LoginPage Enter_name_and_email_address(){
        log().info(" Enter name and email address");
        name.sendKeys("lol");
        email.sendKeys("lol@lol.com");
        return this;
    }
}
