package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	// Setup do Selenium - Import estrutura do webdriver
	WebDriver driver;

	// Metodo de abrir navegador
	public void abrirNavegador(String appUrl, String descricaoPasso) {
		// setup do browser que utilizaremos - caminho a ser seguido para o driver
		System.setProperty("WebDriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		// setup do driver do Selenium para reconhecer o Chrome
		driver = new ChromeDriver();
		// Digitar um site e entrar no site
		driver.get(appUrl);
	}

	public void fecharNavegador() {

		driver.quit();
	}

	public void maximizar() {

		driver.manage().window().maximize();
	}

	public void click(By elemento) {

		driver.findElement(elemento).click();

	}

	public void submit(By elemento) {

		driver.findElement(elemento).submit();
	}

	public void escrever(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void validarTexto(String textoEsperado, By elemento) {

		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, texto);

	}
}