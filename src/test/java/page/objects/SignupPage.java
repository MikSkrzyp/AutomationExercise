package page.objects;

import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    @FindBy(xpath = "//*[@id=\"first_name\"]")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id=\"last_name\"]")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id=\"company\"]")
    private WebElement company;

    @FindBy(xpath = "//*[@id=\"address1\"]")
    private WebElement address;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement country;

    @FindBy(xpath = "//*[@id=\"state\"]")
    private WebElement state;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement city;

    @FindBy(xpath = "//*[@id=\"zipcode\"]")
    private WebElement zipcode;

    @FindBy(xpath = "//*[@id=\"mobile_number\"]")
    private WebElement mobilenumber;

    @FindBy(css = "#form > div > div > div > div > form > button")
    private WebElement createAccount_button;
    @FindBy(xpath = "/ins/span/svg/path")
    private WebElement ad;

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
        password.sendKeys("xyz");

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

    @Step("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public SignupPage Fill_details_First_name_Last_name_Company_Address_Address2_Country_State_City_Zipcode_Mobile_Number(){
        log().info("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number");
        firstName.sendKeys("xyz");
        lastName.sendKeys("xyz");
        company.sendKeys("xyz Company");
        address.sendKeys("xyz street 25");
        Select countrySelect = new Select(country);
        countrySelect.selectByValue("Canada");
        state.sendKeys("xyz state");
        city.sendKeys("xyz city");
        zipcode.sendKeys("9999-9999");
        mobilenumber.sendKeys("99999999999");

        return this;
    }
    @Step("Click 'Create Account button'")
    public AccountCreatedPage Click_Creat_Account_button(){
        log().info("Click 'Create Account button'");

        new Actions(DriverManager.getWebDriver()).sendKeys(Keys.PAGE_DOWN).perform();


        WaitForElement.waitUntilElementIsVisible(createAccount_button);



        Actions actions = new Actions(DriverManager.getWebDriver());
        actions.moveToElement(createAccount_button);


        createAccount_button.click();
        return new AccountCreatedPage();
    }

}
