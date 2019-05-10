import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ConcluirCompra;
import pages.Dashboard;
import pages.FormasDePagamento;
import pages.ProdutoSelecionado;

public class NewTesteCompra {
    private WebDriver driver;
    private Dashboard dashboard;
    private ProdutoSelecionado produtoSelecionado;
    private FormasDePagamento formasDePagamento;
    private ConcluirCompra concluirCompra;

    @Before
    public void before() {
       driver = new ChromeDriver();
       driver.get("https://www.casasbahia.com.br/");
       driver.manage().window().maximize();
       dashboard = new Dashboard(driver);
       produtoSelecionado = new ProdutoSelecionado(driver);
       formasDePagamento = new FormasDePagamento(driver);
       concluirCompra = new ConcluirCompra(driver);
    }

    @After
    public void after() {
        driver.quit();
    }

    @Test
    public void testarComprarProduct() {
         this.dashboard.clicarProdutoCompra();
         this.produtoSelecionado.btnAdicionarCarrinho();
         this.formasDePagamento.btnContinuarForPag();
         this.concluirCompra.btnCocluirCompra();
    }
}

