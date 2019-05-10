package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConcluirCompra {
    private final String idBtnConcluirCompra = "#sectionContent > div.fullCart > div > div:nth-child(13) > a";
    private WebDriver driver;

    public ConcluirCompra(WebDriver driver) {
        this.driver = driver;
    }

    public void btnCocluirCompra() {
        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(idBtnConcluirCompra)));
        driver.findElement(By.cssSelector(idBtnConcluirCompra)).click();
    }
}
