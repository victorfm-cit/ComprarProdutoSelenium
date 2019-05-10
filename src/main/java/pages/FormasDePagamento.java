package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormasDePagamento {
    private final String idBtnContinuar = "#sectionContent > div > div.content-wrapper > a";
    private WebDriver driver;

    public FormasDePagamento(WebDriver driver) {
        this.driver = driver;
    }

    public void btnContinuarForPag() {
//        WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(idBtnContinuar)));
        driver.findElement(By.cssSelector(idBtnContinuar)).click();
    }
}
