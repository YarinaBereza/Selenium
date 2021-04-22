package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver d = new ChromeDriver();
        d.get("http://syntaxtechs.com/selenium-practice/basic-radiobutton-demo.php");
        WebElement ageRadioButton = d.findElement(By.cssSelector("input[value = '0 - 5']"));

        boolean isAgeRadioButtonEnabled = ageRadioButton.isEnabled();
        System.out.println(isAgeRadioButtonEnabled);

        //check if is disabled
        if(isAgeRadioButtonEnabled){
            System.out.println("not enabled");
        }else{
            System.out.println("it is enabled");
        }

        boolean isAgeRadioValueDisplayed = ageRadioButton.isDisplayed();
        System.out.println(isAgeRadioValueDisplayed);

        boolean isAgeRadioButtonSelected = ageRadioButton.isSelected();
        System.out.println("Before clicking "+isAgeRadioButtonSelected);
        ageRadioButton.click();
        isAgeRadioButtonSelected = ageRadioButton.isSelected();
        System.out.println("After clicking "+isAgeRadioButtonSelected);

        d.quit();

    }
}
