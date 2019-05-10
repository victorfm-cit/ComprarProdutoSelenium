package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
    private final String idCelularCompra = "5642026";
    private WebDriver driver;

    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }
    public void clicarProdutoCompra() {
        driver.findElement(By.id(idCelularCompra)).click();
    }

}
