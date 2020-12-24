package br.com.Accenture.ProjetoBDD.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import br.com.Accenture.ProjetoBDD.Utilitarios.ExtraindoDadosExcel;

public class PageCadastroTerceiraPagina extends BasePage{

	public PageCadastroTerceiraPagina(WebDriver driver) {
		super(driver);
	}
	
	private ExtraindoDadosExcel excel = new ExtraindoDadosExcel();
	
	public void preencherDadosTerceiraPagina() throws Exception {
		this.preencherStartDate()
	    .selecionarInsuranceSum()
	    .selecionarMeritRating()
	    .selecionarDamageInsurnce()
	    .preencherOptionalProducts()
	    .selecionarCourtesyCar()
	    .clicarNext3();
	}
	
	private PageCadastroTerceiraPagina preencherStartDate() throws Exception {
		driver.findElement(By.id("startdate")).sendKeys(excel.getStartDate());
		return this;
	}

	private PageCadastroTerceiraPagina selecionarInsuranceSum() throws Exception {
		Select se = new Select(driver.findElement(By.id("insurancesum")));
		se.selectByValue(excel.getInsuranceSum());
		return this;
	}
	
	private PageCadastroTerceiraPagina selecionarMeritRating() throws Exception {
		Select se = new Select(driver.findElement(By.id("meritrating")));
		se.selectByValue(excel.getMeritRating());
		return this;
	}
	
	private PageCadastroTerceiraPagina selecionarDamageInsurnce() throws Exception {
		Select se = new Select(driver.findElement(By.id("damageinsurance")));
		se.selectByValue(excel.getDamageInsurance());
		return this;
	}
	
	private PageCadastroTerceiraPagina preencherOptionalProducts() {
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")).click();
		return this;
	}
	
	private PageCadastroTerceiraPagina selecionarCourtesyCar() throws Exception {
		Select se = new Select(driver.findElement(By.id("courtesycar")));
		se.selectByValue(excel.getCourtesyCar());
		return this;
	}
	
	private void clicarNext3() {
		driver.findElement(By.id("nextselectpriceoption")).click();
	}
	
	
}
