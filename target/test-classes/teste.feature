#Author: igorbapfernandes@gmail.com

Feature: Pesquisa de Seguro Para Veiculo
  Eu como usuario quero efetuar uma pesquisa no site Vehicle Insurance Application
  
  Background: Acessar o site Vehicle Insurance Application
  Given que eu esteja no "http://sampleapp.tricentis.com/101/app.php"

  Scenario: Simular um seguro para meu veiculo
  When confirmar "Make"
  And clicar em "Audi"
  And selecionar "Scooter"
  And preencher o campo Cylinder Capacity com "300"
  And preencher o campo Engine Performance com "300"
  And colocar a data com "05/04/2023"
  And selecionar quantos assentos
  And escolher entre sim ou nao
  And escolher o numero de assentos
  And escolher o tipo de combustivel
  And preencher o Payload com "1000"
  And preencher o Total Weight com "500"
  And preencher o List Price com "30000"
  And preencher o Annual Mileage com "3000"
  And clicar no botao Next
  And confirmar texto "First Name"
  And preencher com "Igor"
  And preencher "Fernandes"
  And completar com a data de nascimento "05/04/1999"
  And escolher entre male ou female
  And selecionar a opcao "Brazil"
  And escrever o cep "11320160"
  And escolher a opcao "Unemployed"
  And escolher entre uma das opcoes de hobby
  And clicar em Next
  And confirmar o texto "Start Date"
  And preencher Start Date com "08/26/2023"
  And preencher Insurance Sum
  And preencher Merit Rating
  And preencher Damage Insurance
  And escolher entre as opcoes dadas
  And escolher o Courtesy Car
  And clicar no Next
  And validar opcao "Ultimate"
  And escolher opcao Ultimate
  And clicar novamente no botao Next
  And validar "E-Mail"
  And completar com "igorbapfernandes@gmail.com"
  And criar um user "teste123321"
  And criar uma senha "Testeteste1"
  And confirmar sua senha "Testeteste1"
  And clicar no botao ao final da pagina Send
  Then ira aparecer a mensagem "Sending e-mail success!"
  And clicar no botao azul Ok
  
