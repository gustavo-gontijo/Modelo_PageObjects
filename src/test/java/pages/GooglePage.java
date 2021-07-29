package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
    //Chamada do Navegador
    private WebDriver driver;
    public GooglePage(WebDriver driver){
        this.driver = driver;
    }


    //Acoes
    public GooglePage novaPesquisaGoogle(String fraseNovaPesquisa){
        WebElement pesquisa = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        pesquisa.clear();
        pesquisa.sendKeys(fraseNovaPesquisa+Keys.ENTER);
        return this;
    }

    public String validaPesquisaGoogle() {
        return driver.findElement(By.xpath("//span[text()='Selenium']")).getText();
    }



}
