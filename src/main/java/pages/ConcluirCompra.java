package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConcluirCompra extends PageBase{
    private final String idBtnConluirCompra = "concluirCompra";
    private WebDriver driver;

    public ConcluirCompra(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void btnConcluirCompra() {
        WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className(idBtnConluirCompra)));
        driver.findElement(By.className(idBtnConluirCompra)).click();
    }
}