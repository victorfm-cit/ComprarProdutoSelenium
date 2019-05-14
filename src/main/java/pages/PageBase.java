package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PageBase {
    private final String idBarraBusca = "strBusca";
    private WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarBarraBuscar() {
        driver.findElement(By.id(idBarraBusca)).click();
    }
    public void escreverBarraBusca(String pesquisar) {
        driver.findElement(By.id(idBarraBusca)).sendKeys(pesquisar, Keys.ENTER);
    }
}
