package wcruz.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wcruz.core.DriverFactory;

public class AnswerPage {
	
	public void EsperaInicialPorXpath(int tempo, String xpath) {
		WebDriverWait espera = new WebDriverWait(DriverFactory.getDriver(), tempo);
		espera.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	public void PreencheTextoXpath(String xpath, String nome) {
		DriverFactory.getDriver().findElement(By.xpath(xpath)).sendKeys(nome);
	}
	
	public void ChecaExibicaoBotao(String xpath) {
		DriverFactory.getDriver().findElement(By.xpath(xpath));
	}
	
	public void ClicaBotaoXpath(String xpath) {
		DriverFactory.getDriver().findElement(By.xpath(xpath)).click();
	}
	public String GetTextoBoxXpath(String xpath) {
		String nome = DriverFactory.getDriver().findElement(By.xpath(xpath)).getText();
		return nome;
	}
	
	public boolean ChecaNomeMensagemXpath(String nome) {
		boolean achou;
		
		if(DriverFactory.getDriver().findElement(By.xpath("//div[@class = 'sc-gZMcBi eJygDw']//label[contains(text(),'" + nome + "')]")) != null) 
		{
		achou = true;
		}
		else achou = false;
		
		return achou;
	}
	
	public boolean ChecaEmailMensagemXpath(String nome) {
		boolean achou;
		
		if (DriverFactory.getDriver().findElement(By.xpath("//label[@class='stkv-qa-block_title' and @for = 'stkv-text-507a9a573d66af81' and contains(text(),'"+ nome + "')]")) != null) {
		achou = true;
		}
		else achou = false;
		
		return achou;
	}
	
	public void PreencheComboDigitando(String pais) {
		DriverFactory.getDriver().findElement(By.xpath("//input[@class = 'sc-cJSrbW ekUgmD']")).sendKeys(pais);
	}
	
	public void PreencheComboSelecionando(String pais) {
		DriverFactory.getDriver().findElement(By.xpath("//div[ @class = 'sc-gZMcBi czFVPp' and contains( text() ,'" + pais + "')]")).click();
		
	}
	
	public boolean ChecaPaisSelecionado(String pais) {
		boolean achou;
		
		if (DriverFactory.getDriver().findElement(By.xpath("//input[@class = 'sc-cJSrbW ekUgmD' and @value = '"+ pais + "']")) != null) {
		achou = true;
		}
		else achou = false;
		
		return achou;
	}
	
	public void BotaoEnter(String xpath) {
		DriverFactory.getDriver().findElement(By.xpath(xpath)).sendKeys(Keys.RETURN);
	}
	
	public void BotaoTab (String xpath) {
		DriverFactory.getDriver().findElement(By.xpath(xpath)).sendKeys(Keys.TAB);
	}
	
	public boolean ChecaExibicaoMensagemErro(String mensagem) {
		boolean achou;
		if(DriverFactory.getDriver().findElement(By.xpath("//div[@class = 'sc-gZMcBi sQZbo' and contains(text(),'" + mensagem +"') and @data-qa = 'error-message-visible']")) != null) {
			achou = true;
			
		}
		else achou = false;
		return achou;
		
	}
	
	
	public boolean ChecaExibicaoMensagemErroEmailInvalido() {
		boolean achou;
		if(DriverFactory.getDriver().findElement(By.xpath("//div[@class = 'sc-gZMcBi sQZbo' and @data-qa = 'error-message-visible' and contains (text(), \"Hmm…that email doesn't look valid\")]")) != null) {
			achou = true;
			
		}
		else achou = false;
		return achou;
		
	}
	
	
	public boolean ChecaExibicaoErroPreenchimentoFinal(String mensagem) {
		boolean achou;
		if(DriverFactory.getDriver().findElement(By.xpath("//div[@class = 'stkv-o-one-column__padded  stkv-u-default-font' and contains (text(),\""+ mensagem +"\")]")) != null) {
			achou = true;
			
		}
		else achou = false;
		return achou;
		
	}
}
