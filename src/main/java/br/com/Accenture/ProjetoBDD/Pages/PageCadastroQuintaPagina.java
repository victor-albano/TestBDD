package br.com.Accenture.ProjetoBDD.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.Accenture.ProjetoBDD.Utilitarios.ExtraindoDadosExcel;

public class PageCadastroQuintaPagina extends BasePage {

	public PageCadastroQuintaPagina(WebDriver driver) {
		super(driver);
	}
	
	private ExtraindoDadosExcel excel = new ExtraindoDadosExcel();
	
	public void preencherDadosQuintaPagina() throws Exception {
		this.preencherEmail()
		.preencherUsername()
		.preencherSenha()
		.preencherConfirmacaoSenha()
		.clicarSend();
	}
	
	public String validarConfirmacao() {
		return driver.findElement(By.xpath("/html/body/div[4]/h2")).getText();
	}
	
	private PageCadastroQuintaPagina preencherEmail() throws Exception {
		driver.findElement(By.id("email")).sendKeys(excel.getEmail());
		return this;
	}
	
	private PageCadastroQuintaPagina preencherUsername() throws Exception {
		driver.findElement(By.id("username")).sendKeys(excel.getUsername());
		return this;
	}
	
	private PageCadastroQuintaPagina preencherSenha() throws Exception {
		driver.findElement(By.id("password")).sendKeys(excel.getPassword());
		return this;
	}
	
	private PageCadastroQuintaPagina preencherConfirmacaoSenha() throws Exception {
		driver.findElement(By.id("confirmpassword")).sendKeys(excel.getPassword());
		return this;
	}
	
	private void clicarSend() {
		driver.findElement(By.id("sendemail")).click();
	}

}
