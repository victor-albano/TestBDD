package br.com.Accenture.ProjetoBDD.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import br.com.Accenture.ProjetoBDD.Utilitarios.ExtraindoDadosExcel;

public class PageCadastroInicial extends BasePage{

	public PageCadastroInicial(WebDriver driver) {
		super(driver);
	}
	
	private ExtraindoDadosExcel excel = new ExtraindoDadosExcel();
	
	public void preencherDadosPaginaInicial() throws Exception {
	    this.selecionarMarca()
	    .selecionarModelo()
	    .preencherCapacidadeCilindro()
	    .preencherPerformanceMotor()
	    .preencherData()
	    .selecionarNumeroDeAssentos()
	    .selecionarRightHandDrive()
	    .selecionarNumeroDeAssentosMotorCycle()
	    .selecionartipoDeCombustivel()
	    .preencherPayload()
	    .preencherPesoTotal()
	    .preencherlistPrice()
	    .preencherAnnualMileage()
	    .clicarNext1();
	}
	
	private PageCadastroInicial selecionarMarca() throws Exception {
		Select se = new Select(driver.findElement(By.id("make")));
		se.selectByValue(excel.getMarca());
		return this;
	}
	
	private PageCadastroInicial selecionarModelo() throws Exception {
		Select se = new Select(driver.findElement(By.id("model")));
		se.selectByValue(excel.getModel());
		return this;
	}
	
	private PageCadastroInicial preencherCapacidadeCilindro() throws Exception {
		driver.findElement(By.id("cylindercapacity")).sendKeys(excel.getCylinder());
		return this;
	}
	
	private PageCadastroInicial preencherPerformanceMotor() throws Exception {
		driver.findElement(By.id("engineperformance")).sendKeys(excel.getEnginePerformance());
		return this;
	}
	
	private PageCadastroInicial preencherData() throws Exception {
		driver.findElement(By.id("dateofmanufacture")).sendKeys(excel.getDateOfManufacture());
		return this;
	}
	
	private PageCadastroInicial selecionarNumeroDeAssentos() throws Exception {
		Select se = new Select(driver.findElement(By.id("numberofseats")));
		se.selectByValue(excel.getNumberOfSeats());
		return this;
	}
	
	private PageCadastroInicial selecionarRightHandDrive() {
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span")).click();
		return this;
	}
	
	private PageCadastroInicial selecionarNumeroDeAssentosMotorCycle() throws Exception {
		Select se = new Select(driver.findElement(By.id("numberofseatsmotorcycle")));
		se.selectByValue(excel.getNumberOfSeats2());
		return this;
	}
	
	private PageCadastroInicial selecionartipoDeCombustivel() throws Exception {
		Select se = new Select(driver.findElement(By.id("fuel")));
		se.selectByValue(excel.getFuelType());
		return this;
	}
	
	private PageCadastroInicial preencherPayload() throws Exception {
		driver.findElement(By.id("payload")).sendKeys(excel.getPayload());
		return this;
	}
	
	private PageCadastroInicial preencherPesoTotal() throws Exception {
		driver.findElement(By.id("totalweight")).sendKeys(excel.getTotalWeight());
		return this;
	}
	
	private PageCadastroInicial preencherlistPrice() throws Exception {
		driver.findElement(By.id("listprice")).sendKeys(excel.getListPrice());
		return this;
	}
	
	private PageCadastroInicial preencherAnnualMileage() throws Exception {
		driver.findElement(By.id("annualmileage")).sendKeys(excel.getAnnualMileage());
		return this;
	}
	
	private void clicarNext1() {
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}
}
