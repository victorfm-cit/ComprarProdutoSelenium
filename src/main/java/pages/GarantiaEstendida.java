package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GarantiaEstendida extends PageBase{
    private final String idBtnContinuar = "#sectionContent > div > div.content-wrapper > a";
    private WebDriver driver;

    public GarantiaEstendida(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public void clicarBotaoContinuar() {
        driver.findElement(By.cssSelector(idBtnContinuar)).click();
    }
}
