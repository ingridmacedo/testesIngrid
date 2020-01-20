package br.com.ingrid.teste.webdriverJava;

import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastrarUsuarioTest {
	@Test 
	public void testAcessarSistema(){
		int expected = 1;
		int actual = 1;
		assertEquals(expected, actual);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\drivers\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.get("https://h.ibpj.original.com.br/cas/login");
		
	// navegador.findElement(By.linkText("Sua conexão não é particular")).equals(obj)
		
		//Preencher o campo CPF id=loginCpf
		navegador.findElement(By.id("loginCpf")).sendKeys("335.192.818-13");
		
		//Senha
		
		//Procura um elemento que contenha o texto dentro do link, após encontrado o Texto o Robô irá clicar (método Click) dentro do Elemento
		navegador.findElement(By.linkText("0")).click();
		navegador.findElement(By.linkText("0")).click();
		navegador.findElement(By.linkText("1")).click();
		navegador.findElement(By.linkText("1")).click();
		navegador.findElement(By.linkText("2")).click();
		navegador.findElement(By.linkText("2")).click();
		 // clica no botão Buscar
		//  WebElement buttonBuscar = driver.findElement(By.cssSelector("input[type='submit'"));
	//	  buttonBuscar.click();
	//	}
		
		//Preencher 
		
		//pode ser que não seja direcionado para a página de Login, se existir a página de segurança de link https://h.original.com.br/corporate/
		//Clicar no botão Avançado id=details-button e será direcionado para a pagina de Login 
		
	}
}
