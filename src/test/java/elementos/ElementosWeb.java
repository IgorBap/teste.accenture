package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	// Botoes

	private By botaoNext = By.cssSelector("#nextenterinsurantdata");
	private By botaoNext2 = By.cssSelector("#nextenterproductdata");
	private By botaoNext3 = By.cssSelector("#nextselectpriceoption");
	private By botaoNext4 = By.id("nextsendquote");
	private By botaoSend = By.cssSelector("#sendemail");
	private By botaoOk = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button");

	// Selecionaveis

	private By selectMake = By.id("make");
	private By audi = By.cssSelector("#make > option:nth-child(2)");
	private By selectModel = By.id("model");
	private By scooter = By.cssSelector("#model > option:nth-child(2)");
	private By numberSeats = By.cssSelector("#numberofseats");
	private By numberSFour = By.cssSelector("#numberofseats > option:nth-child(5)");
	private By rightHandYes = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span");
	private By rightHandNo = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(2) > span");
	private By numberSeats2 = By.cssSelector("#numberofseatsmotorcycle");
	private By numberSThree = By.cssSelector("#numberofseatsmotorcycle > option:nth-child(4)");
	private By fuelType = By.cssSelector("#fuel");
	private By diesel = By.cssSelector("#fuel > option:nth-child(3)");
	private By genderMale = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");
	private By genderFemale = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2) > span");
	private By country = By.cssSelector("#country");
	private By brazil = By.cssSelector("#country > option:nth-child(32)");
	private By occupation = By.cssSelector("#occupation");
	private By unemployed = By.cssSelector("#occupation > option:nth-child(5)");
	private By speeding = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
	private By bungee = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span");
	private By cliffDiving = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(3) > span");
	private By skydiving = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(4) > span");
	private By other = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(5) > span");
	private By insuranceSum = By.cssSelector("#insurancesum");
	private By valorSeteK = By.cssSelector("#insurancesum > option:nth-child(4)");
	private By meritRating = By.cssSelector("#meritrating");
	private By superBonus = By.cssSelector("#meritrating > option:nth-child(2)");
	private By damageInsu = By.cssSelector("#damageinsurance");
	private By fullCover = By.cssSelector("#damageinsurance > option:nth-child(4)");
	private By optProducts = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
	private By optProducts2 = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");	
	private By courtesyCar = By.cssSelector("#courtesycar");
	private By courtesyCarYes = By.cssSelector("#courtesycar > option:nth-child(3)");
	private By courtesyCarNo = By.cssSelector("#courtesycar > option:nth-child(2)");
	private By ultimate = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4) > span");
	
	// Escrever

	private By cylinderCap = By.cssSelector("#cylindercapacity");
	private By enginePerfo = By.name("[kW]");
	private By dateManu = By.cssSelector("#dateofmanufacture");
	private By payload = By.name("Payload");
	private By totalWeight = By.name("Total Weight");
	private By listPrice = By.name("List Price");
	private By annualMil = By.name("Annual Mileage");
	private By name = By.id("firstname");
	private By lastName = By.name("Last Name");
	private By dateBirth = By.cssSelector("#birthdate");
	private By zipCode = By.cssSelector("#zipcode");
	private By startDate = By.cssSelector("#startdate");
	private By email = By.cssSelector("#email");
	private By user = By.cssSelector("#username");
	private By password = By.cssSelector("#password");
	private By confirmPass = By.cssSelector("#confirmpassword");
	

	// Validacoes

	private By negativaPrice = By.cssSelector("#xLoaderPrice > p");
	private By make = By.cssSelector("#insurance-form > div > section:nth-child(1) > div.field.idealforms-field.idealforms-field-select-one.invalid > label");
	private By firstName = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(1) > label");
	private By startDateValid = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-text > label");
	private By opcaoUltimate = By.cssSelector("#priceTable > thead > tr > th:nth-child(5)");
	private By emailValid = By.cssSelector("#sendQuoteForm > div.field.idealforms-field.idealforms-field-email > label");
	private By confirmacaoEmail = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");
	
	// Getters
	
	public By getBotaoNext() {
		return botaoNext;
	}

	public By getBotaoNext2() {
		return botaoNext2;
	}

	public By getBotaoNext3() {
		return botaoNext3;
	}

	public By getSelectMake() {
		return selectMake;
	}

	public By getAudi() {
		return audi;
	}

	public By getSelectModel() {
		return selectModel;
	}

	public By getScooter() {
		return scooter;
	}

	public By getNumberSeats() {
		return numberSeats;
	}

	public By getNumberSFour() {
		return numberSFour;
	}

	public By getRightHandYes() {
		return rightHandYes;
	}

	public By getRightHandNo() {
		return rightHandNo;
	}

	public By getNumberSeats2() {
		return numberSeats2;
	}

	public By getNumberSThree() {
		return numberSThree;
	}

	public By getFuelType() {
		return fuelType;
	}

	public By getDiesel() {
		return diesel;
	}

	public By getCylinderCap() {
		return cylinderCap;
	}

	public By getEnginePerfo() {
		return enginePerfo;
	}

	public By getDateManu() {
		return dateManu;
	}

	public By getPayload() {
		return payload;
	}

	public By getTotalWeight() {
		return totalWeight;
	}

	public By getListPrice() {
		return listPrice;
	}

	public By getAnnualMil() {
		return annualMil;
	}

	public By getNegativaPrice() {
		return negativaPrice;
	}

	public By getMake() {
		return make;
	}
	public By getGenderMale() {
		return genderMale;
	}

	public By getGenderFemale() {
		return genderFemale;
	}

	public By getCountry() {
		return country;
	}

	public By getBrazil() {
		return brazil;
	}

	public By getOccupation() {
		return occupation;
	}

	public By getUnemployed() {
		return unemployed;
	}

	public By getSpeeding() {
		return speeding;
	}

	public By getBungee() {
		return bungee;
	}

	public By getCliffDiving() {
		return cliffDiving;
	}

	public By getSkydiving() {
		return skydiving;
	}

	public By getOther() {
		return other;
	}

	public By getName() {
		return name;
	}

	public By getLastName() {
		return lastName;
	}

	public By getDateBirth() {
		return dateBirth;
	}

	public By getZipCode() {
		return zipCode;
	}

	public By getFirstName() {
		return firstName;
	}
	
	public By getInsuranceSum() {
		return insuranceSum;
	}

	public By getValorSeteK() {
		return valorSeteK;
	}

	public By getMeritRating() {
		return meritRating;
	}

	public By getSuperBonus() {
		return superBonus;
	}

	public By getDamageInsu() {
		return damageInsu;
	}

	public By getFullCover() {
		return fullCover;
	}

	public By getOptProducts() {
		return optProducts;
	}

	public By getOptProducts2() {
		return optProducts2;
	}

	public By getCourtesyCar() {
		return courtesyCar;
	}

	public By getCourtesyCarYes() {
		return courtesyCarYes;
	}

	public By getCourtesyCarNo() {
		return courtesyCarNo;
	}

	public By getStartDate() {
		return startDate;
	}

	public By getStartDateValid() {
		return startDateValid;
	}
	

	public By getBotaoNext4() {
		return botaoNext4;
	}

	public By getUltimate() {
		return ultimate;
	}

	public By getOpcaoUltimate() {
		return opcaoUltimate;
	}

	public By getBotaoSend() {
		return botaoSend;
	}

	public By getEmail() {
		return email;
	}

	public By getUser() {
		return user;
	}

	public By getPassword() {
		return password;
	}

	public By getConfirmPass() {
		return confirmPass;
	}

	public By getEmailValid() {
		return emailValid;
	}
	public By getBotaoOk() {
		return botaoOk;
	}

	public By getConfirmacaoEmail() {
		return confirmacaoEmail;
	}
}

