import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {
    WebDriver driver ;
    //Burada herseferinde aynı işlemleri yapmamak için base bir sınıf oluşturuldu ve diğer pageler bu kısımdan kalıtım aldı

    public BasePage(WebDriver driver){
        this.driver = driver ;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    //Webelemnt listesi
    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }
    //Tıklama
    public void click(By locator){
        find(locator).click();
    }
    //elementi bul ve yaz
    public void type(By locator , String text){
        find(locator).sendKeys(text);
    }
    //görünüp görünmediğinin kontrolü
    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }
}
