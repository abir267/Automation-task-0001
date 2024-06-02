package Sample;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class cd {
    public static void main(String[] args) throws Exception {
        // System.setProperty("webdriver.chrome.driver","C:\\chrome-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://akhtar.com.bd/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
      //  driver.findElement(By.xpath("//div[@class='col-4 col-lg-4 d-flex justify-content-start align-items-center']//button[@aria-label='Toggle navigation']")).click();
       // WebElement dropdownElement = driver.findElement(By.xpath("//a[@class='d-flex align-items-center justify-content-center'][normalize-space()='Office']"));
        //dropdownElement.click();

        driver.findElement(By.cssSelector("div[class='col-4 col-lg-4 d-flex justify-content-center align-items-center'] i[class='fa fa-search fs-5']")).click();
        WebElement inputField = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        inputField.sendKeys("Alaric Rocking Chair");
        inputField.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WebElement cardElement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
        cardElement.click();
        Actions actions = new Actions(driver);

        WebElement dropdownElement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[1]/div/div[2]/div/div[1]/div[1]/div/select[1]"));
        actions.moveToElement(dropdownElement).click().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> dropdownOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"__nuxt\"]/div[2]/div[3]/div[1]/div/div[2]/div/div[1]/div[1]/div/select/option[2]")));
        for (WebElement option : dropdownOptions) {
           if (option.getText().equals("Mehghoni wood")) {
                option.click();
               break;

            }
        }
        WebElement dropdownElement2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/select[1]"));
        actions.moveToElement(dropdownElement2).click().perform();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> dropdownOptions1 = wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"__nuxt\"]/div[2]/div[3]/div[1]/div/div[2]/div/div[1]/div[2]/div/select/option[2]")));
        for (WebElement option : dropdownOptions1) {
            if (option.getText().equals("STANDRAD SIZE")) {
                option.click();
                break;

            }
        }
driver.findElement(By.xpath("//div[@class='col-6 col-lg-8 col-md-8 p-0 px-1']//button[@class='btn base_btn btn-secondary w-100 rounded-0 fs-7 my-2'][normalize-space()='ADD TO CART']")).click();

        System.out.println("Passed and added to the cart");

    }

}









    //}}

