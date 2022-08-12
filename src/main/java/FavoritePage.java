import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FavoritePage extends BasePage{
    By movetoElement=By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
    By goList=By.xpath("//div[@id='nav-flyout-wl-items']//a[1]//span[1]");
    Actions action = new Actions(driver);
    public FavoritePage(WebDriver driver) {
        super(driver);
        action=new Actions(driver);

    }


public void hoverAccountList(){
    action.moveToElement(find(movetoElement)).perform();
}
public void goAccountList(){
        click(goList);
}



}
