import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class test_Add_Product extends BaseTest {
    CategoryPage categoryPage;
    HomePage homePage ;
    ProductsPage productsPage ;
    ProductDetailPage productDetailPage ;
    CartPage cartPage ;
    LoginPage loginPage ;
    CookiesPage cookiesPage ;
    FavoritePage favoritePage;
    DeleteListPage deleteListPage;
    LogoutPage logoutPage;
    @Test
    @Order(1)
    public void accept_cookies(){

        cookiesPage = new CookiesPage(driver);
        cookiesPage.acceptCookies();


    }
    @Test
    @Order(2)
    public void amazon_login(){

        loginPage = new LoginPage(driver);
        loginPage.loginEnter();
        loginPage.logemailPage("duranunverdi1905@gmail.com");
        loginPage.logpasswordPage("063698Drn");
        Assertions.assertTrue(loginPage.isOnLogine());

    }
    @Test
    @Order(3)
    public void search_a_category(){

        categoryPage = new CategoryPage(driver);
        categoryPage.selectCategory();
        Assertions.assertTrue(categoryPage.isComputer() ,"computer not selected!");
    }
    @Test
    @Order(4)
    public void search_a_product(){
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("msi");
        //sayfada olup olmadığının kontrolünü yapıcak
        Assertions.assertTrue(productsPage.isOnProductPage() ,"Not on products page!");
    }
    @Test
    @Order(5)
    public void search_a_second_page(){

        categoryPage.secondPage();
        Assertions.assertTrue(categoryPage.isCheckedSecondPage() ,"Not on second page!");
    }
    @Test
    @Order(6)
    public void select_a_product(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(1);
    }

    @Test
    @Order(7)
    public void add_product_to_list(){
        productDetailPage.addToCart();

    }

    @Test
    @Order(8)
    public void go_to_list(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(homePage.isCheckProduct());

    }
    @Test
    @Order(9)
    public void go_to_account_favorite(){
        favoritePage=new FavoritePage(driver);
        favoritePage.hoverAccountList();
        favoritePage.goAccountList();
        Assertions.assertTrue(homePage.isCheckProduct());
    }
    @Test
    @Order(10)
    public void go_to_delete_list(){
        deleteListPage=new DeleteListPage(driver);
        deleteListPage.deletedList();
        Assertions.assertTrue(deleteListPage.isCheckDeleteList());
    }
    @Test
    @Order(11)
    public void amazon_logout(){
        logoutPage=new LogoutPage(driver);
        favoritePage.hoverAccountList();
        logoutPage.logoutAccount();
        Assertions.assertTrue(logoutPage.isCheckLogout());
    }


}
