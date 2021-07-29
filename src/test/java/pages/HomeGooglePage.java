package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeGooglePage {
    //Chamada do Navegador
    private WebDriver driver;
    public HomeGooglePage(WebDriver driver){
        this.driver = driver;
    }


    //Acoes
    public HomeGooglePage pesquisaGoogle(String frasePesquisa){
        WebElement campoPesquisa = driver.findElement(By.name("q"));
        campoPesquisa.sendKeys(frasePesquisa + Keys.ENTER);
        return this;
    }










}