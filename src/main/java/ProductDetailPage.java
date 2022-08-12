import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    By addToCartLocator= By.id("add-to-wishlist-button-submit");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartLocator);
    }

    public void addToCart() {
    //liste ekleme işlemini yapıyoruz
    click(addToCartLocator);
    }
}
