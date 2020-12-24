package br.com.Accenture.ProjetoBDD.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import br.com.Accenture.ProjetoBDD.Utilitarios.ExtraindoDadosExcel;

public class PageCadastroSegundaPagina extends BasePage{

	public PageCadastroSegundaPagina(WebDriver driver) {
		super(driver);
	}
	
	private ExtraindoDadosExcel excel = new ExtraindoDadosExcel();
	
	public void preecherDadosSegundaPagina() throws Exception {
		this.preencherPrimeiroNome()
		   .preencherSobrenome()
		   .preencherDataNascimento()
		   .selecionarGenero()
		   .preencherNomeRua()
		   .selecionarPais()
		   .preencherCEP()
		   .selecionarOcupacao()
		   .selecionarHobbies()
		   .clicarNext2();
	}
	
	private PageCadastroSegundaPagina preencherPrimeiroNome() throws Exception {
		driver.findElement(By.id("firstname")).sendKeys(excel.getName());
		return this;
	}
	
	private PageCadastroSegundaPagina preencherSobrenome() throws Exception {
		driver.findElement(By.id("lastname")).sendKeys(excel.getSobrenome());
		return this;
	}
	
	private PageCadastroSegundaPagina preencherDataNascimento() throws Exception {
		driver.findElement(By.id("birthdate")).sendKeys(excel.getDataNascimento());
		return this;
	}
	
	private PageCadastroSegundaPagina selecionarGenero() {
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")).click();
		return this;
	}
	
	private PageCadastroSegundaPagina preencherNomeRua() {
		driver.findElement(By.id("streetaddress")).sendKeys("Rua Alegria");
		return this;
	}
	
	private PageCadastroSegundaPagina selecionarPais() throws Exception {
		Select se = new Select(driver.findElement(By.id("country")));
		se.selectByValue(excel.getPais());
		return this;
	}
	
	private PageCadastroSegundaPagina preencherCEP() throws Exception {
		driver.findElement(By.id("zipcode")).sendKeys(excel.getCEP());
		return this;
	}
	
	private PageCadastroSegundaPagina selecionarOcupacao() throws Exception {
		Select se = new Select(driver.findElement(By.id("occupation")));
		se.selectByValue(excel.getOccupation());
		return this;
	}
	
	private PageCadastroSegundaPagina selecionarHobbies() {
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span")).click();
		return this;
	}
	
	private void clicarNext2() {
		driver.findElement(By.id("nextenterproductdata")).click();
	}

}
