@CadastroVeiculo
Feature: CadastroVeiculo

Scenario: 
	Given estou na pagina que comeca o cadastro
	When usuario preenche dados do veiculo
	And preenche dados do segurado
	And preenche dados do produto
	And seleciona opcao de preco
	And preenche informacoes de cadastro
	Then valida que email foi enviado