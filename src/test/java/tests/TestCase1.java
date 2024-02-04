package tests;

import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import navigation.ApplicationURLs;
import org.testng.annotations.Test;
import page.objects.HomePage;

import  static navigation.ApplicationURLs.APPLICATION_URL;
public class TestCase1  extends TestBase{

    @Test
    @TmsLink("ID-1")
    @Description("The goal of this test is to check register user option")
    public void TestCase1Test(){
        DriverUtils.navigateToPage(APPLICATION_URL);

        HomePage homePage = new HomePage();
        homePage.assertThatWelcomeTextIsDisplayed();
        homePage
                .goToSignup_LoginPage()
                .Verify_NewUserSignup_is_visible()
                .Enter_name_and_email_address()
                .Click_Signup_button()
                .Verify_that_ENTER_ACCOUNT_INFORMATION_is_visible();


    }
}
