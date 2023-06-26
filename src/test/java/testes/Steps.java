package testes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;
import elementos.ElementosWeb;

public class Steps {

	Metodos me = new Metodos();
	ElementosWeb ew = new ElementosWeb();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String appUrl) {
		me.abrirNavegador(appUrl, "Abrindo navegador");
		me.maximizar();
	}

	@When("confirmar {string}")
	public void confirmar(String textoResultado) {
		me.validarTexto(textoResultado, ew.getMake());
	}

	@When("clicar em {string}")
	public void clicar_em(String string) {
		me.click(ew.getSelectMake());
		me.click(ew.getAudi());
	}

	@When("selecionar {string}")
	public void selecionar(String string) {
		me.click(ew.getSelectModel());
		me.click(ew.getScooter());
	}

	@When("preencher o campo Cylinder Capacity com {string}")
	public void preencher_o_campo_cylinder_capacity_com(String string) {
		me.escrever(string, ew.getCylinderCap());
	}

	@When("preencher o campo Engine Performance com {string}")
	public void preencher_o_campo_engine_performance_com(String string) {
		me.escrever(string, ew.getEnginePerfo());
	}

	@When("colocar a data com {string}")
	public void colocar_a_data_com(String string) {
		me.escrever(string, ew.getDateManu());
	}

	@When("selecionar quantos assentos")
	public void selecionar_quantos_assentos() {
		me.click(ew.getNumberSeats());
		me.click(ew.getNumberSFour());
	}

	@When("escolher entre sim ou nao")
	public void escolher_entre_sim_ou_nao() {
		me.click(ew.getRightHandYes());
	}

	@When("escolher o numero de assentos")
	public void escolher_o_numero_de_assentos() {
		me.click(ew.getNumberSeats2());
		me.click(ew.getNumberSThree());
	}

	@When("escolher o tipo de combustivel")
	public void escolher_o_tipo_de_combustivel() {
		me.click(ew.getFuelType());
		me.click(ew.getDiesel());
	}

	@When("preencher o Payload com {string}")
	public void preencher_o_payload_com(String string) {
		me.escrever(string, ew.getPayload());
	}

	@When("preencher o Total Weight com {string}")
	public void preencher_o_total_weight_com(String string) {
		me.escrever(string, ew.getTotalWeight());
	}

	@When("preencher o List Price com {string}")
	public void preencher_o_list_price_com(String string) {
		me.escrever(string, ew.getListPrice());
	}

	@When("preencher o Annual Mileage com {string}")
	public void preencher_o_annual_mileage_com(String string) {
		me.escrever(string, ew.getAnnualMil());

	}

	@When("clicar no botao Next")
	public void clicar_no_botao_next() {
		me.click(ew.getBotaoNext());
	}

	@When("confirmar texto {string}")
	public void confirmar_texto(String textoEsperado) {
		me.validarTexto(textoEsperado, ew.getFirstName());
	}

	@When("preencher com {string}")
	public void preencher_com(String string) {
		me.escrever(string, ew.getName());
	}

	@When("preencher {string}")
	public void preencher(String string) {
		me.escrever(string, ew.getLastName());
	}

	@When("completar com a data de nascimento {string}")
	public void completar_com_a_data_de_nascimento(String string) {
		me.escrever(string, ew.getDateBirth());
	}

	@When("escolher entre male ou female")
	public void escolher_entre_male_ou_female() {
		me.click(ew.getGenderMale());

	}

	@When("selecionar a opcao {string}")
	public void selecionar_a_opcao(String string) {
		me.click(ew.getCountry());
		me.click(ew.getBrazil());
	}

	@When("escrever o cep {string}")
	public void escrever_o_cep(String string) {
		me.escrever(string, ew.getZipCode());
	}

	@When("escolher a opcao {string}")
	public void escolher_a_opcao(String string) {
		me.click(ew.getOccupation());
		me.click(ew.getUnemployed());
	}

	@When("escolher entre uma das opcoes de hobby")
	public void escolher_entre_uma_das_opcoes_de_hobby() {
		me.click(ew.getSkydiving());
	}

	@When("clicar em Next")
	public void clicar_em_next() {
		me.click(ew.getBotaoNext2());
	}

	@When("confirmar o texto {string}")
	public void confirmar_o_texto(String string) {
		me.validarTexto(string, ew.getStartDateValid());
	}

	@When("preencher Start Date com {string}")
	public void preencher_start_date_com(String string) {
		me.escrever(string, ew.getStartDate());
	}

	@When("preencher Insurance Sum")
	public void preencher_insurance_sum() {
		me.click(ew.getInsuranceSum());
		me.click(ew.getValorSeteK());
	}

	@When("preencher Merit Rating")
	public void preencher_merit_rating() {
		me.click(ew.getMeritRating());
		me.click(ew.getSuperBonus());
	}

	@When("preencher Damage Insurance")
	public void preencher_damage_insurance() {
		me.click(ew.getDamageInsu());
		me.click(ew.getFullCover());
	}

	@When("escolher entre as opcoes dadas")
	public void escolher_entre_as_opcoes_dadas() {
		me.click(ew.getOptProducts2());
	}

	@When("escolher o Courtesy Car")
	public void escolher_o_courtesy_car() {
		me.click(ew.getCourtesyCar());
		me.click(ew.getCourtesyCarYes());
	}

	@When("clicar no Next")
	public void clicar_no_next() {
		me.click(ew.getBotaoNext3());
	}

	@When("validar opcao {string}")
	public void validar_opcao(String string) {
		me.validarTexto(string, ew.getOpcaoUltimate());
	}

	@When("escolher opcao Ultimate")
	public void escolher_opcao_ultimate() throws InterruptedException {
		me.click(ew.getUltimate());
		Thread.sleep(2000);
	}

	@When("clicar novamente no botao Next")
	public void clicar_novamente_no_botao_next() {
		me.click(ew.getBotaoNext4());
	}

	@When("validar {string}")
	public void validar(String string) {
		me.validarTexto(string, ew.getEmailValid());
	}

	@When("completar com {string}")
	public void completar_com(String string) {
		me.escrever(string, ew.getEmail());
	}

	@When("criar um user {string}")
	public void criar_um_user(String string) {
		me.escrever(string, ew.getUser());
	}

	@When("criar uma senha {string}")
	public void criar_uma_senha(String string) {
		me.escrever(string, ew.getPassword());
	}

	@When("confirmar sua senha {string}")
	public void confirmar_sua_senha(String string) {
		me.escrever(string, ew.getConfirmPass());
	}

	@When("clicar no botao ao final da pagina Send")
	public void clicar_no_botao_ao_final_da_pagina_send() throws InterruptedException {
		me.click(ew.getBotaoSend());
		Thread.sleep(15000);
	}

	@Then("ira aparecer a mensagem {string}")
	public void ira_aparecer_a_mensagem(String string) {
		me.validarTexto(string, ew.getConfirmacaoEmail());
	}

	@Then("clicar no botao azul Ok")
	public void clicar_no_botao_azul_ok() {
		me.click(ew.getBotaoOk());
		me.fecharNavegador();
	}
}