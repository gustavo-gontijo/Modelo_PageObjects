import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTests {
    private WebDriver driver;

    @BeforeMethod
    public void before(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://Google.com");
    }






    @Test
    public void buscaGoogle(){
        WebElement campoPesquisa = driver.findElement(By.name("q"));
        campoPesquisa.sendKeys("Hello Word");
    }





    @AfterMethod
    public void after(){
        //driver.close();
    }


}
