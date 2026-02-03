package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Demo Login Page
        driver.get("https://the-internet.herokuapp.com/login");

        // Create Page Object
        LoginPage loginPage = new LoginPage(driver);

        // Perform Login
        loginPage.login("tomsmith", "SuperSecretPassword!");

        // Validate Login
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("/secure")) {
            System.out.println("LOGIN TEST PASSED");
        } else {
            System.out.println("LOGIN TEST FAILED");
        }

        driver.quit();
    }
}
