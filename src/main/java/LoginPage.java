import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    By emailSend= By.id("ap_email");
    By paswordSend= By.id("ap_password");
    By emailClickButton=By.id("continue");
    By passwordClickButton=By.id("signInSubmit");
    By logEnter=By.id("nav-link-accountList");
    By checkLogin=By.id("glow-ingress-line1");
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void loginEnter(){
        click(logEnter);
    }
    public void logemailPage(String text){
            type(emailSend,text);
            click(emailClickButton);
    }
    public void logpasswordPage(String text){
        type(paswordSend,text);
        click(passwordClickButton);
    }
    public boolean isOnLogine() {
        return isDisplayed(checkLogin);
    }
}
