import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Stack;

public class HomePage extends BasePage {
    By cartCountLocator= By.xpath("//a[@id='itemEditLabel_I3P2AG4OCMOY56']");
    By cardContainerLocator=By.xpath("//a[normalize-space()='Listenizi Görüntüleyin']");
    By cardCheckProduct=By.xpath("//div[@class='a-fixed-right-grid-inner']");

    SearchBox searchBox;
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox=new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isCheckProduct() {
        //sepetteki ürün kontrolü
        return isDisplayed(cardCheckProduct);
    }

    public void goToCart() {
        //listeye gidiyoruz
        click(cardContainerLocator);
    }

}
