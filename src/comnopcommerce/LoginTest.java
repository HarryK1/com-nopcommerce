package comnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-1 - ProjectName : com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demo.nopcommerce.com/login?returnUrl=
 * %2F”
 * 7. Print the current url.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current url.
 * 11. Refresh the page.
 * 12. Enter the email to email field.
 * 13. Enter the password to password field.
 * 14. Click on Login Button.
 * 15. Close the browser.
 */

public class LoginTest {

    static String baseUrl = "https://demo.nopcommerce.com/";


    public static void main(String[] args) throws InterruptedException {

        //setup browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl); // open the URL into browser
        System.setProperty("web-driver.chrome.driver","drivers/chromedriver.exe");

        //print title of the page
        System.out.println(driver.getTitle());
        //print current Url
        System.out.println(driver.getCurrentUrl());
        //print page source
        System.out.println(driver.getPageSource());

        //maximise browser
        driver.manage().window().maximize();
        //we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        //navigate to url
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);

        //print current url
        System.out.println(driver.getCurrentUrl());

        //navigate to back page
        driver.navigate().back();

        //navigate to login page
        driver.navigate().to(loginUrl);

        //print current url
        System.out.println(driver.getCurrentUrl());

        //refresh the page
        driver.navigate().refresh();
        Thread.sleep(4000);


        //find login link element and click on it
       //WebElement loginLink = driver.findElement(By.xpath("//a[@class='ico-login']"));
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
       loginLink.click();
       Thread.sleep(4000);

        //find email field element and type the email
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("kellybutton10@gmail.com");
        Thread.sleep(4000);

        //find password field and type password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Kellydan1");
        Thread.sleep(4000);

        WebElement loginButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        loginButton.click();
        Thread.sleep(4000);

        driver.quit();

    }
}


