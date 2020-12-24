package br.com.Accenture.ProjetoBDD.Steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import br.com.Accenture.ProjetoBDD.Pages.PageCadastroInicial;
import br.com.Accenture.ProjetoBDD.Pages.PageCadastroQuartaPagina;
import br.com.Accenture.ProjetoBDD.Pages.PageCadastroQuintaPagina;
import br.com.Accenture.ProjetoBDD.Pages.PageCadastroSegundaPagina;
import br.com.Accenture.ProjetoBDD.Pages.PageCadastroTerceiraPagina;
import br.com.Accenture.ProjetoBDD.Utilitarios.DriverFactory;
import br.com.Accenture.ProjetoBDD.Utilitarios.SmartWaits;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepCadastroVeiculo {

	private WebDriver driver;
	private DriverFactory factory = new DriverFactory();
	private PageCadastroInicial pageCadastroInicial = new PageCadastroInicial(driver);
	private PageCadastroSegundaPagina pageCadastroSegundaPagina = new PageCadastroSegundaPagina(driver);
	private PageCadastroTerceiraPagina pageCadastroTerceiraPagina = new PageCadastroTerceiraPagina(driver);
	private PageCadastroQuartaPagina pageCadastroQuartaPagina = new PageCadastroQuartaPagina(driver);
	private PageCadastroQuintaPagina pageCadastroQuintaPagina = new PageCadastroQuintaPagina(driver);
	
	@Given("^estou na pagina que comeca o cadastro$")
	public void estouNaPaginaQueComecaOCadastro() throws Throwable {
		driver = factory.abrirChrome("http://sampleapp.tricentis.com/101/app.php");
		new SmartWaits(driver).esperarPaginaCarregar();
		pageCadastroInicial = PageFactory.initElements(driver, PageCadastroInicial.class);
		pageCadastroSegundaPagina = PageFactory.initElements(driver, PageCadastroSegundaPagina.class);
		pageCadastroTerceiraPagina = PageFactory.initElements(driver, PageCadastroTerceiraPagina.class);
		pageCadastroQuartaPagina = PageFactory.initElements(driver, PageCadastroQuartaPagina.class);
		pageCadastroQuintaPagina = PageFactory.initElements(driver, PageCadastroQuintaPagina.class);
	}
	
	@When("^usuario preenche dados do veiculo$")
	public void usuarioPreencheDadosDoVeiculo() throws Throwable {
	    pageCadastroInicial.preencherDadosPaginaInicial();
	}

	@When("^preenche dados do segurado$")
	public void preencheDadosDoSegurado() throws Throwable {
	   pageCadastroSegundaPagina.preecherDadosSegundaPagina();
	}

	@When("^preenche dados do produto$")
	public void preencheDadosDoProduto() throws Throwable {
	    pageCadastroTerceiraPagina.preencherDadosTerceiraPagina();
	}

	@When("^seleciona opcao de preco$")
	public void selecionaOpcaoDePreco() throws Throwable {
	    pageCadastroQuartaPagina.preencherDadosQuartaPagina();
	}

	@When("^preenche informacoes de cadastro$")
	public void preencheInformacoesDeCadastro() throws Throwable {
	    pageCadastroQuintaPagina.preencherDadosQuintaPagina();
	}

	@Then("^valida que email foi enviado$")
	public void validaQueEmailFoiEnviado() throws Throwable {
	    String mensagemConfirmacao = pageCadastroQuintaPagina.validarConfirmacao();
	    assertEquals("Sending e-mail success!", mensagemConfirmacao);
		factory.fecharChrome();
	}
}
