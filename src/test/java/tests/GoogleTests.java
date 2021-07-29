package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.GooglePage;
import pages.HomeGooglePage;
import utils.BrowserUtils;


public class GoogleTests {
    private WebDriver driver;

    //Chamada das Page
    HomeGooglePage homeGooglePage;
    BrowserUtils browserUtils;
    GooglePage googlePage;


    @BeforeMethod
    public void before(){
        driver = browserUtils.newInstanceChrome();
    }

    @Test
    public void pesquisa(){
        //Instancias das PAGE
        homeGooglePage = new HomeGooglePage(driver);
        googlePage = new GooglePage(driver);

        //Variaveis
        String pesquisaGooge = "Hello Word";
        String novaPesquisaGoogle = "Selenium";

        //Tests
        homeGooglePage.pesquisaGoogle(pesquisaGooge);
        googlePage.novaPesquisaGoogle(novaPesquisaGoogle);

        //Validacao
        Assert.assertEquals(googlePage.validaPesquisaGoogle(),novaPesquisaGoogle);

    }

    @AfterMethod
    public void after(){
        driver.close();
    }
}
