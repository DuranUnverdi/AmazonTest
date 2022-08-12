import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteListPage extends BasePage {
    By deleteList= By.xpath("//input[@name='submit.deleteItem']");
    By deleteListCheck=By.xpath("//div[contains(text(),'Silindi')]");
    public DeleteListPage(WebDriver driver) {
        super(driver);
    }
    public void deletedList(){
        click(deleteList);
    }
    public boolean isCheckDeleteList(){
        return isDisplayed(deleteListCheck);
    }
}
