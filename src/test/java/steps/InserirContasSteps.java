package steps;

import static junit.framework.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import junit.framework.Assert;

public class InserirContasSteps {

	WebDriver driver;

	@Dado("^que estou acessando a aplicacao$")
	public void que_estou_acessando_a_aplicacao() throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com");
	}

	@Quando("^informo o usuario \"([^\"]*)\"$")
	public void informo_o_usuario(String arg1) throws Throwable {
		driver.findElement(By.id("email")).sendKeys("ps.rafael@gmail.com");
	}

	@Quando("^a senha \"([^\"]*)\"$")
	public void a_senha(String arg1) throws Throwable {
		driver.findElement(By.id("senha")).sendKeys("baratao");
	}

	@Quando("^seleciono entrar$")
	public void seleciono_entrar() throws Throwable {
		driver.findElement(By.tagName("button")).click();
	}

	@Entao("^visualizo a pagina inicial$")
	public void visualizo_a_pagina_inicial() throws Throwable {
		String testo = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		assertEquals("Bem vindo, Rafael!", testo);
	}

	@Quando("^seleciono Contas$")
	public void seleciono_Contas() throws Throwable {
		driver.findElement(By.linkText("Contas")).click();
	}

	@Quando("^seleciono Adicionar$")
	public void seleciono_Adicionar() throws Throwable {
		driver.findElement(By.linkText("Adicionar")).click();

	}

	@Quando("^informo a conta \"([^\"]*)\"$")
	public void informo_a_conta(String arg1) throws Throwable {
		driver.findElement(By.id("nome")).sendKeys("Nathalia");
	}

	@Quando("^seleciono Salvar$")
	public void seleciono_Salvar() throws Throwable {
		driver.findElement(By.tagName("button")).click();

	}

	@Entao("^a conta e inserida com sucesso$")
	public void a_conta_e_inserida_com_sucesso() throws Throwable {
		String testo = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals("Conta adicionada com sucesso!", testo);

	}

	@Entao("^sou notificado que o nome da conta e obrigatorio$")
	public void sou_notificar_que_o_nome_da_conta_e_obrigatorio() throws Throwable {
		String testo = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		assertEquals("Informe o nome da conta", testo);

	}

	@Entao("^sou notificado que ja existe uma conta com esse nome$")
	public void sou_notificado_que_ja_existe_uma_conta_com_esse_nome() throws Throwable {
		String testo = driver.findElement(By
				.xpath("//div[@class='alert alert-danger' and contains(text(), 'Já existe uma conta com esse nome!')]"))
				.getText();
		assertEquals("Já existe uma conta com esse nome!", testo);

	}

	@After(order = 1)
	public void screenshot(Scenario canario) {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshot/"+canario.getId()+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@After(order = 0)
	public void fecharBrowser() {
		driver.quit();
	}
}
