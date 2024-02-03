package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

import static generic.assertions.AssertWebElement.assertThat;

public class HomePage extends  BasePage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/h2")
    private WebElement welcome_text;

    @Step("Assert that Welcome Text {message} is dispalyed")
    public HomePage assertThatWelcomeTextIsDisplayed(String message) {
        log().info("Assert that Welcome Text {} is dispalyed",message);
        WaitForElement.waitUntilElementIsVisible(welcome_text);
        assertThat(welcome_text).isDisplayed().hasText(message);
        return this;
    }
}
