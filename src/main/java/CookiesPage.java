import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CookiesPage extends BasePage {
    By acceptCookiesLocator=By.id("sp-cc-accept");
    public CookiesPage(WebDriver driver) {
        super(driver);
    }
    public void acceptCookies(){
        if(isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }
}
