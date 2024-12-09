import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;

public class magento {

    //Main Class
    public static WebDriver driver;
    static String BaseURL = "https://magento.softwaretestingboard.com/";//set the BaseURL
    static JavascriptExecutor js;


    @BeforeTest
    public static void Websetup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",  "D:\\Software Testing All\\Selenium_Java\\New chromedriver\\chromedriver.exe");//set the location path of chromedriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BaseURL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(3000);
        js = (JavascriptExecutor) driver;
    }

    @Test(priority = 1)
    public static void magento_web() throws Exception {
        //Page_Scroll
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,650)", "");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,650)", "");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,650)", "");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,650)", "");
        Thread.sleep(2000);
        //Click_Luma
        driver.findElement(xpath("//header/div[2]/a[1]/img[1]")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public static void magento_Sign() throws Exception {
        //Click_Sign
        driver.findElement(xpath("//header/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
        Thread.sleep(2000);
        //Page_Scroll
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,650)", "");
        Thread.sleep(2000);
        //Sign_Email
        driver.findElement(xpath("//input[@id='email']")).click();
        driver.findElement(xpath("//input[@id='email']")).sendKeys("sahidhossain000@outlook.com");
        Thread.sleep(2000);
        //Sign_Password
        driver.findElement(xpath("//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/input[1]")).click();
        driver.findElement(xpath("//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/input[1]")).sendKeys("Admin2024@#$");
        //Sign_In
        driver.findElement(xpath("//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]")).click();
        Thread.sleep(2000);
        //Assertion
        Assert.assertEquals("Welcome, Sahid Hossain!", driver.findElement(By.xpath("//header/div[1]/div[1]/ul[1]/li[1]/span[1]")).getText());
        Thread.sleep(2000);
        driver.navigate().refresh();
    }

    @Test(priority = 3)
    public static void product_search_filter() throws Exception {
        //Click_Search
        driver.findElement(xpath("//input[@id='search']")).click();
        Thread.sleep(1000);
        driver.findElement(xpath("//input[@id='search']")).sendKeys("Montana Wind Jacket");
        Thread.sleep(2000);
        driver.findElement(xpath("//header/div[2]/div[2]/div[2]/form[1]/div[2]/button[1]")).click();
        Thread.sleep(2000);
        //Page_Scroll
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,730)", "");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-430)", "");
        Thread.sleep(2000);
        //Click_Filter
        driver.findElement(xpath("//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,430)", "");
        Thread.sleep(2000);

    }

    @Test(priority = 4)
    public static void product_Add_To_Cart() throws Exception {
        //Click_on_Size_XL
        driver.findElement(xpath("//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[2]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]")).click();
        Thread.sleep(2000);
        //Click_on_color_Black
        driver.findElement(xpath("//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[2]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]")).click();
        Thread.sleep(2000);
        //Click_on_Add_to_Cart
        driver.findElement(xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[2]/ol[1]/li[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]/span[1]")).click();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-430)", "");
        Thread.sleep(2000);
        //Click_on_Add_to_Cart
        driver.findElement(xpath("//header/div[2]/div[1]/a[1]")).click();
        Thread.sleep(2000);
        //Click_on_Proceed_to_Checkout
        driver.findElement(xpath("//button[@id='top-cart-btn-checkout']")).click();
        Thread.sleep(3000);
        //Assertion
        Assert.assertEquals("Shipping Address", driver.findElement(By.xpath("//div[contains(text(),'Shipping Address')]")).getText());
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public static void product_checkout() throws Exception {
        //checkout_Shipping_Address
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600)", "");
        Thread.sleep(2000);
        //Click_on_Next
        driver.findElement(xpath("//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[2]/div[1]/div[3]/form[1]/div[3]/div[1]/button[1]")).click();
        Thread.sleep(2000);
        //Page_Scroll
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(2000);
        //Click_on_Place_Order
        driver.findElement(xpath("//span[contains(text(),'Place Order')]")).click();
        Thread.sleep(2000);
        //Assertion
        Assert.assertEquals("Thank you for your purchase!", driver.findElement(By.xpath("//span[contains(text(),'Thank you for your purchase!')]")).getText());
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public static void Sign_Out() throws Exception {
        //Sign_Out
        driver.findElement(xpath("//header/div[1]/div[1]/ul[1]/li[2]/span[1]/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(xpath("//header/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[3]/a[1]")).click();
        Thread.sleep(2000);
        //Assertion
        Assert.assertEquals("You are signed out", driver.findElement(By.xpath("//span[contains(text(),'You are signed out')]")).getText());
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public static void magento_guest_Checkout() throws Exception {
        //Click_Search
        driver.findElement(xpath("//input[@id='search']")).click();
        Thread.sleep(1000);
        driver.findElement(xpath("//input[@id='search']")).sendKeys("Montana Wind Jacket");
        Thread.sleep(2000);
        driver.findElement(xpath("//header/div[2]/div[2]/div[2]/form[1]/div[2]/button[1]")).click();
        Thread.sleep(2000);
        //Page_Scroll
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,730)", "");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-430)", "");
        Thread.sleep(2000);
        //Click_Filter
        driver.findElement(xpath("//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,430)", "");
        Thread.sleep(2000);
        //Click_on_Size_XL
        driver.findElement(xpath("//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[2]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]")).click();
        Thread.sleep(2000);
        //Click_on_color_Black
        driver.findElement(xpath("//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[2]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]")).click();
        Thread.sleep(2000);
        //Click_on_Add_to_Cart
        driver.findElement(xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[2]/ol[1]/li[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]/span[1]")).click();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-430)", "");
        Thread.sleep(2000);
        //Click_on_Add_to_Cart
        driver.findElement(xpath("//header/div[2]/div[1]/a[1]")).click();
        Thread.sleep(2000);
        //Click_on_Proceed_to_Checkout
        driver.findElement(xpath("//button[@id='top-cart-btn-checkout']")).click();
        Thread.sleep(3000);
        //Assertion
        Assert.assertEquals("Shipping Address", driver.findElement(By.xpath("//div[contains(text(),'Shipping Address')]")).getText());
        Thread.sleep(2000);
        //Click_on_Email_Address
        driver.findElement(xpath("//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(xpath("//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")).sendKeys("sahidhossain000@outlook.com");
        Thread.sleep(2000);
        //Click_on_First Name
        driver.findElement(xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Shahid");
        Thread.sleep(2000);
        //Click_on_Last Name
        driver.findElement(xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[2]/div[1]/input[1]")).click();
        driver.findElement(xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Hossain");
        Thread.sleep(2000);
        //Click_on_Company
        driver.findElement(xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[3]/div[1]/input[1]")).click();
        driver.findElement(xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[3]/div[1]/input[1]")).sendKeys("RoBenDevs");
        Thread.sleep(2000);
        //Click_on_Address
        driver.findElement(xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Plot No. 1, 2nd Floor, Road No. 17, Block-C, Banani");
        Thread.sleep(2000);
        //Click_on_City
        driver.findElement(xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[4]/div[1]/input[1]")).click();
        driver.findElement(xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[4]/div[1]/input[1]")).sendKeys("Alabama");
        Thread.sleep(2000);
        //Click_on_State/Province
        Select dropdown = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[5]/div[1]/select[1]")));
        dropdown.selectByValue("1");
        Thread.sleep(2000);
        //Click_on_Zip/Postal_Code
        driver.findElement(xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[7]/div[1]/input[1]")).click();
        driver.findElement(xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[7]/div[1]/input[1]")).sendKeys("35062");
        Thread.sleep(2000);
        //Click_on_Phone_Number
        driver.findElement(xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[9]/div[1]/input[1]")).click();
        driver.findElement(xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[9]/div[1]/input[1]")).sendKeys("01677266742");
        Thread.sleep(2000);
        //Click_on_Shipping Methods
        driver.findElement(xpath("//tbody/tr[1]/td[1]/input[1]")).click();
        Thread.sleep(2000);
        //checkout_Shipping_Address
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600)", "");
        Thread.sleep(2000);
        //Click_on_Next
        driver.findElement(xpath("//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[2]/div[1]/div[3]/form[1]/div[3]/div[1]/button[1]")).click();
        Thread.sleep(2000);
        //Page_Scroll
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(2000);
        //Click_on_Place_Order
        driver.findElement(xpath("//span[contains(text(),'Place Order')]")).click();
        Thread.sleep(2000);
        //Assertion
        Assert.assertEquals("Thank you for your purchase!", driver.findElement(By.xpath("//span[contains(text(),'Thank you for your purchase!')]")).getText());
        Thread.sleep(2000);

    }



    @AfterTest
    public static void Test_Closure() {
        driver.quit();
    }


}
