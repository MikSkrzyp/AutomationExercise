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
                .Verify_that_ENTER_ACCOUNT_INFORMATION_is_visible()
                .Fill_details_Title_Name_Email_Password_Dateofbirth()
                .Select_checkbox_Sign_up_for_our_newsletter()
                .Select_checkbox_Receive_special_offers_from_our_partners()
                .Fill_details_First_name_Last_name_Company_Address_Address2_Country_State_City_Zipcode_Mobile_Number()
                .Click_Creat_Account_button()
                .Verify_that_ACCOUNT_CREATED_is_visible()
                .Click_Continue_button()
                .Verify_that_Logged_in_as_username_is_visible()
                .Click_DeleteAccount_button()
                .Verify_that_ACCOUNT_CREATED_is_visible_and_click_continue();



    }
}
