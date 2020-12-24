package br.com.Accenture.ProjetoBDD.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageCadastroQuartaPagina extends BasePage{

	public PageCadastroQuartaPagina(WebDriver driver) {
		super(driver);
	}
	
	public void preencherDadosQuartaPagina() {
		this.selecionarPlano()
	    .clicarNext4();
	}
	
	private PageCadastroQuartaPagina selecionarPlano() {
		driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span")).click();
		return this;
	}
	
	private void clicarNext4() {
		driver.findElement(By.id("nextsendquote")).click();
	}
}
