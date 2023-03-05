package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
AmazonPage amazonPage=new AmazonPage();
    @Given("Amazon sayfasina gidilir")
    public void amazonSayfasinaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @Then("Amazon sayfasinda selenium aratilir")
    public void amazonSayfasindaSeleniumAratilir() {
        amazonPage.searchBox.sendKeys("selenium", Keys.ENTER);
    }

    @Then("Sonuclarda selenium oldugu test edilir")
    public void sonuclardaSeleniumOlduguTestEdilir() {
    }

    @Then("Sayfa kapatilir")
    public void sayfaKapatilir() {
    }
}
