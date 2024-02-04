package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;


import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends  BasePage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/h2")
    private WebElement welcome_text;

    @Step("Assert that Welcome Text is dispalyed")
    public HomePage assertThatWelcomeTextIsDisplayed() {
        log().info("Assert that Welcome Text  is dispalyed");
        WaitForElement.waitUntilElementIsVisible(welcome_text);
        assertThat(welcome_text.getText()).isEqualTo("FEATURES ITEMS");
        return this;
    }
}
