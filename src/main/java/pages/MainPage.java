package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'зарегистрируйтесь')]")
    WebElement registration;

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        WebElement closePopUp = wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.xpath(".//*[contains(@src, 'closePopImg')]"))));
        closePopUp.click();
        /*WebElement re = wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.xpath("//a[contains(text(),'зарегистрируйтесь')]"))));*/
        this.register();
    }

    public void register(){ //or use a parameter?
        registration.click();
    }

}
