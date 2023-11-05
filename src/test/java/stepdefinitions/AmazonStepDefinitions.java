package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
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
    public void amazonSayfasindaSeleniumAratilir() throws InterruptedException {

        amazonPage.searchBox.sendKeys("selenium", Keys.ENTER);
        Thread.sleep(2000);
    }

    @Then("Sonuclarda selenium oldugu test edilir")
    public void sonuclardaSeleniumOlduguTestEdilir() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("selenium"));
    }

    @Then("Sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }
}
