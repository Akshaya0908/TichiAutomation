package Assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        // Open the browser
        driver.get("https://tichi-app-webapp-stage.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        //click signin
        WebElement signin=driver.findElement(By.xpath("//button[text()='Sign In']"));
        signin.click();

        // Enter email
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("prashanti9114@gmail.com");
        
        // Click continue
        WebElement continuecl=driver.findElement(By.xpath("//button[text()='Continue']"));
        continuecl.click();
        
        // Password
        WebElement pass=driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
        pass.sendKeys("Prash@123");

        // Click Sign Up
        WebElement login=driver.findElement(By.xpath("//button[text()='Login']"));
        login.click();
        Thread.sleep(4000);

        // Close browser
        driver.quit();
    }
}

	
