import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    By username = By.name("email");
    By password = By.name("password");
    By loginbutton = By.xpath("//input[@value='Login']");

    public  LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void Enterusername(String unamevalue)
    {
        driver.findElement(username).sendKeys(unamevalue);
    }

    public void Enterpassword(String pwdvalue)
    {
        driver.findElement(password).sendKeys(pwdvalue);
    }
    public void LoginButton()
    {
        driver.findElement(loginbutton).click();
    }

}
