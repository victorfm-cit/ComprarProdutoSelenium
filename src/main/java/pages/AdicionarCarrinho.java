package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdicionarCarrinho {
    private final String idBtnComprar = "btnAdicionarCarrinho";
    private WebDriver driver;

    public AdicionarCarrinho(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarBtnComprar() {
        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id(idBtnComprar)));
        driver.findElement(By.id(idBtnComprar)).click();
    }
}