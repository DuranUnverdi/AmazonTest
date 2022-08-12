import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CategoryPage extends BasePage {
    By allCategoriesLocator= By.id("searchDropdownBox");
    By secondPageLocator=By.xpath("//a[@aria-label='2 sayfasına git']");
    By computerChecked=By.xpath("//option[@value='search-alias=computers']");
    By secondPageChecked=By.xpath("//span[contains(text(),'10.000 üzeri sonuç arasından 25-48 arası gösterili')]");

    public CategoryPage(WebDriver driver) {
        super(driver);
    }
    public void selectCategory(){

        click(allCategoriesLocator);
        Select slc=new Select(find(allCategoriesLocator));
        slc.selectByVisibleText("Bilgisayarlar");

    }
    public void secondPage(){
        click(secondPageLocator);
    }
    public boolean isComputer() {
        //sepetteki ürün kontrolü
        return isDisplayed(computerChecked);
    }
    public boolean isCheckedSecondPage() {
        return isDisplayed(secondPageChecked);
    }
}
