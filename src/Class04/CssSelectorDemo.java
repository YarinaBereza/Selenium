package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver d = new ChromeDriver();
        d.get("http://syntaxtechs.com/selenium-practice/index.php");
        WebElement startPracticingButton = d.findElement(By.cssSelector("a#btn_basic_example"));
        startPracticingButton.click();
        Thread.sleep(2000);
        WebElement simpleForm = d.findElement(By.xpath("(//a[text() = 'Simple Form Demo'])[2]"));
        simpleForm.click();
        Thread.sleep(2000);
        WebElement massageTextBox = d.findElement(By.cssSelector("input[placeholder ^= 'Please enter']"));
        massageTextBox.sendKeys("practice makes perfect");
        WebElement showMassageButton = d.findElement(By.cssSelector("button[onclick = 'showInput();']"));
        showMassageButton.click();

        d.quit();

    }

}
