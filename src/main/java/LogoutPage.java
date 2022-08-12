import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage {
    By logoutAccountLocator= By.xpath("//span[contains(text(),'Çıkış Yap')]");
    By logoutChecked=By.xpath("//h1[@class='a-spacing-small']");
    public LogoutPage(WebDriver driver) {
        super(driver);
    }
    public void logoutAccount(){
        click(logoutAccountLocator);
    }
    public boolean isCheckLogout(){
        return isDisplayed(logoutChecked);
    }
}
