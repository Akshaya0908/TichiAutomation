package Assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupPage {

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
        email.sendKeys("akshayaes04@gmail.com");
        
        // Click continue
        WebElement continuecl=driver.findElement(By.xpath("//button[text()='Continue']"));
        continuecl.click();
        
        // First Name
        WebElement frstname=driver.findElement(By.xpath("//label[text()='First Name']/following-sibling::input"));
        frstname.sendKeys("Akshaya");

        // Last Name
        WebElement lstname=driver.findElement(By.xpath("//label[text()='Last Name']/following-sibling::input"));
        lstname.sendKeys("ES");

        // Mobile Number
        WebElement phno=driver.findElement(By.id("phoneNumber"));
        phno.sendKeys("9876543210");

        // Password
        WebElement pass=driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
        pass.sendKeys("Akshaya@123");

        // Confirm Password
        WebElement conpass=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
        conpass.sendKeys("Akshaya@123");

        // Accept Terms & Conditions
        WebElement checkbox = driver.findElement(By.xpath("//button[@role='checkbox']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", checkbox);

        // Click Sign Up
        WebElement signup=driver.findElement(By.xpath("//button[text()='Sign Up']"));
        signup.click();
        Thread.sleep(4000);

        // Close browser
        driver.quit();
        


	}

}
