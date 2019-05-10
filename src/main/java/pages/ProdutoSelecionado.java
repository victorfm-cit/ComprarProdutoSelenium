package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoSelecionado {
    private final String idbtnComprar = "ctl00_Conteudo_ctl26_rptLojistas_ctl00_lnkAdd";
    private WebDriver driver;

    public ProdutoSelecionado(WebDriver driver) {
        this.driver = driver;
    }

    public void btnAdicionarCarrinho() {
        driver.findElement(By.id(idbtnComprar)).click();
    }
}
