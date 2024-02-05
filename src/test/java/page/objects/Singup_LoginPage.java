package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.testng.AssertJUnit.assertTrue;
import  page.objects.SignupPage;
public class Singup_LoginPage extends BasePage {


    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/h2")
    private WebElement NewUserSignup;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
    private WebElement name;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
    private WebElement signup_button;



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
        name.sendKeys("xyzz2");
        email.sendKeys("xyzz2@xyz.xyz");
        return this;
    }


    @Step("Click 'Signup' button")
    public SignupPage  Click_Signup_button(){
        log().info("Click 'Signup' button");
        signup_button.click();

        return  new SignupPage();
    }



}
