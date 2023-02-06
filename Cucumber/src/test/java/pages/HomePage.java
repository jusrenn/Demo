package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    @FindBy(name = "query")
    public WebElement searchBox;

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
