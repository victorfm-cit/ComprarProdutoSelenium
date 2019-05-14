package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EscolherPruduto extends PageBase{
    private final String idProdutoSelecionado = "nm-product-img-link";
    private WebDriver driver;

    public EscolherPruduto(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public void clicarProdutoSelecionado() {
        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.className(idProdutoSelecionado)));
        driver.findElement(By.className(idProdutoSelecionado)).click();
    }
}