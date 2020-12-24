package br.com.Accenture.ProjetoBDD.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
         features = "src/main/resources/Gherkin", 
         glue = {"br.com.Accenture.ProjetoBDD.Steps"},
         snippets = SnippetType.CAMELCASE ,
         tags = "@CadastroVeiculo"
         )
	
	public class TestRunner {
		
	}
