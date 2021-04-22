package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
//fill out the form
//click on register
//close the browser
public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Yarina");
        driver.findElement(By.name("customer.lastName")).sendKeys("Bereza");
        driver.findElement(By.id("customer.address.street")).sendKeys("Wells Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Chicago");
        driver.findElement(By.id("customer.address.state")).sendKeys("Illinois");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("60610");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("096852578");
        driver.findElement(By.id("customer.ssn")).sendKeys("6574");
        driver.findElement(By.id("customer.username")).sendKeys("YarinaBereza");
        driver.findElement(By.id("customer.password")).sendKeys("yarina123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("yarina123");
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);
        driver.quit();



    }
}
