package wcruz.test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import wcruz.core.BaseTest;


public class TestesFormulario extends BaseTest {
	
	@Test
	//Teste com objetivo de validar a submiss�o do formul�rio com o preenchimento de todos os campos
	public void DeveSubmeterFormularioSucessoComTodosCampos() throws InterruptedException {
		
		//Tela Pr� Formul�rio
		spage.EsperaInicialPorXpath(10,"//div[@class='sc-kkGfuU isqsrw']//img[@class='stkv-c-attachment__content--centered stkv-o-image']");
		Thread.sleep(500);
		spage.ClicaBotaoXpath("//button[@class='stkv-c-button stkv-us-button-color--background stkv-u-background-color-transition-150 stkv-us-button-color--border stkv-us-button-color stkv-us-button-color--fill stkv-c-button stkv-c-button--raised stkv-c-button--big']");
		Thread.sleep(500);
		
		//In�cio do preenchimento do formul�rio
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "Wander");
		Thread.sleep(500);
		apage.ChecaExibicaoBotao("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]");
		Thread.sleep(500);
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "Aquino");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("//div[@class='stkv-c-block-btn stkv-qa-block-btn is-animated is-visible stkv-u-not-in-flow']//button");
		Thread.sleep(500);
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "teste@hotmail.com");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("//div[@class = 'stkv-c-block-btn stkv-qa-block-btn is-animated is-visible stkv-u-not-in-flow']//button");
		Thread.sleep(500);
		apage.PreencheComboDigitando("Brazil");
		Thread.sleep(500);
		assertTrue(apage.ChecaPaisSelecionado("Brazil"));
		apage.EsperaInicialPorXpath(10, "//div[@class = 'sc-gipzik fYjKAK']");
		apage.ClicaBotaoXpath("//div[@class = 'sc-gipzik fYjKAK']");
		apage.EsperaInicialPorXpath(10, "//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		apage.ClicaBotaoXpath("//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		apage.EsperaInicialPorXpath(10, "//h1[@class = 'sc-bxivhb iYGUAI']");
		
		//Valida��o da �ltima p�gina
		assertTrue(fpage.ValidaTerminoFormulario("Thanks for completing this typeform"));
	}
	
	@Test
	//Teste com objetivo de validar a submiss�o do formul�rio com exce��o do campo sobrenome apenas
	public void DeveSubmeterFormularioSucessoSemSobrenome() throws InterruptedException {
		
		//Tela Pr� Formul�rio
		spage.EsperaInicialPorXpath(10, "//div[@class='sc-kkGfuU isqsrw']//img[@class='stkv-c-attachment__content--centered stkv-o-image']");
		Thread.sleep(500);
		spage.ClicaBotaoXpath("//button[@class='stkv-c-button stkv-us-button-color--background stkv-u-background-color-transition-150 stkv-us-button-color--border stkv-us-button-color stkv-us-button-color--fill stkv-c-button stkv-c-button--raised stkv-c-button--big']");
		Thread.sleep(500);
		
		//In�cio do preenchimento do formul�rio
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "Wander");
		Thread.sleep(500);
		apage.ChecaExibicaoBotao("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]");
		Thread.sleep(500);
		apage.BotaoEnter("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");
		Thread.sleep(500);
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "teste@hotmail.com");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("//div[@class = 'stkv-c-block-btn stkv-qa-block-btn is-animated is-visible stkv-u-not-in-flow']//button");
		Thread.sleep(500);
		apage.PreencheComboDigitando("Brazil");
		Thread.sleep(500);
		assertTrue(apage.ChecaPaisSelecionado("Brazil"));
		apage.EsperaInicialPorXpath(10, "//div[@class = 'sc-gipzik fYjKAK']");
		apage.ClicaBotaoXpath("//div[@class = 'sc-gipzik fYjKAK']");
		apage.EsperaInicialPorXpath(10, "//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		apage.ClicaBotaoXpath("//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		apage.EsperaInicialPorXpath(10, "//h1[@class = 'sc-bxivhb iYGUAI']");
		
		//Valida��o da �ltima p�gina
		assertTrue(fpage.ValidaTerminoFormulario("Thanks for completing this typeform"));
	}
	
	@Test
	//Teste com objetivo de validar a submiss�o do formul�rio com os dados de nome e e-mail apenas (sem o pa�s)
	public void DeveSubmeterFormularioSucessoComNomeEmailSemPais() throws InterruptedException {
		
		spage.EsperaInicialPorXpath(10, "//div[@class='sc-kkGfuU isqsrw']//img[@class='stkv-c-attachment__content--centered stkv-o-image']");
		Thread.sleep(500);
		spage.ClicaBotaoXpath("//button[@class='stkv-c-button stkv-us-button-color--background stkv-u-background-color-transition-150 stkv-us-button-color--border stkv-us-button-color stkv-us-button-color--fill stkv-c-button stkv-c-button--raised stkv-c-button--big']");
		Thread.sleep(500);
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "Wander");
		Thread.sleep(500);
		apage.ChecaExibicaoBotao("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]");
		Thread.sleep(500);
		apage.BotaoEnter("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");
		Thread.sleep(500);
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "teste@hotmail.com");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("//div[@class = 'stkv-c-block-btn stkv-qa-block-btn is-animated is-visible stkv-u-not-in-flow']//button");
		Thread.sleep(500);
		apage.BotaoTab("//input[@class = 'sc-cJSrbW ekUgmD']");
		Thread.sleep(500);
		apage.EsperaInicialPorXpath(10, "//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		apage.ClicaBotaoXpath("//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		apage.EsperaInicialPorXpath(10, "//h1[@class = 'sc-bxivhb iYGUAI']");
		
		assertTrue(fpage.ValidaTerminoFormulario("Thanks for completing this typeform"));
	}
	
	@Test
	//Teste com objetivo de validar a submiss�o do formul�rio com os dados de nome e e-mail apenas (Com o pa�s)
	public void DeveSubmeterFormularioSucessoComNomeEmailComPais() throws InterruptedException {
		
		//P�gina pr� formul�rio
		spage.EsperaInicialPorXpath(10, "//div[@class='sc-kkGfuU isqsrw']//img[@class='stkv-c-attachment__content--centered stkv-o-image']");
		Thread.sleep(500);
		spage.ClicaBotaoXpath("//button[@class='stkv-c-button stkv-us-button-color--background stkv-u-background-color-transition-150 stkv-us-button-color--border stkv-us-button-color stkv-us-button-color--fill stkv-c-button stkv-c-button--raised stkv-c-button--big']");
		Thread.sleep(500);
		
		//Preenchimento do formul�rio
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "Wander");
		Thread.sleep(500);
		apage.ChecaExibicaoBotao("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]");
		Thread.sleep(500);
		apage.BotaoEnter("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");
		Thread.sleep(500);
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "teste@hotmail.com");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("//div[@class = 'stkv-c-block-btn stkv-qa-block-btn is-animated is-visible stkv-u-not-in-flow']//button");
		Thread.sleep(500);
		apage.PreencheComboDigitando("Brazil");
		Thread.sleep(500);
		assertTrue(apage.ChecaPaisSelecionado("Brazil"));
		
		//Conclus�o do formul�rio
		apage.EsperaInicialPorXpath(10, "//div[@class = 'sc-gipzik fYjKAK']");
		apage.ClicaBotaoXpath("//div[@class = 'sc-gipzik fYjKAK']");
		apage.EsperaInicialPorXpath(10, "//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		apage.ClicaBotaoXpath("//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		apage.EsperaInicialPorXpath(10, "//h1[@class = 'sc-bxivhb iYGUAI']");
		
		assertTrue(fpage.ValidaTerminoFormulario("Thanks for completing this typeform"));
	}
	
	@Test
	//Teste com objetivo de validar a mensagem de erro que � exibida ap�s a n�o digita��o do campo nome
	public void NaoDeveSubmeterFormularioSemNome() throws InterruptedException {
		
		spage.EsperaInicialPorXpath(10, "//div[@class='sc-kkGfuU isqsrw']//img[@class='stkv-c-attachment__content--centered stkv-o-image']");
		Thread.sleep(500);
		spage.ClicaBotaoXpath("//button[@class='stkv-c-button stkv-us-button-color--background stkv-u-background-color-transition-150 stkv-us-button-color--border stkv-us-button-color stkv-us-button-color--fill stkv-c-button stkv-c-button--raised stkv-c-button--big']");
		Thread.sleep(500);
		apage.BotaoEnter("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");
		Thread.sleep(500);
		assertTrue(apage.ChecaExibicaoMensagemErro("Please fill this in"));
	}
	
	@Test
	//Teste com objetivo de validar a mensagem de erro que � exibida ap�s a n�o digita��o do campo e-mail.
	public void NaoDeveSubmeterFormularioSemEmail() throws InterruptedException {
		
		//Tela Pr� Formul�rio
		spage.EsperaInicialPorXpath(10,"//div[@class='sc-kkGfuU isqsrw']//img[@class='stkv-c-attachment__content--centered stkv-o-image']");
		Thread.sleep(500);
		spage.ClicaBotaoXpath("//button[@class='stkv-c-button stkv-us-button-color--background stkv-u-background-color-transition-150 stkv-us-button-color--border stkv-us-button-color stkv-us-button-color--fill stkv-c-button stkv-c-button--raised stkv-c-button--big']");
		Thread.sleep(500);
		
		//Preenchimento do formul�rio
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "Wander");
		Thread.sleep(500);
		apage.ChecaExibicaoBotao("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]");
		Thread.sleep(500);
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "Aquino");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("//div[@class='stkv-c-block-btn stkv-qa-block-btn is-animated is-visible stkv-u-not-in-flow']//button");
		Thread.sleep(500);
		apage.BotaoEnter("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");
		Thread.sleep(500);
		assertTrue(apage.ChecaExibicaoMensagemErro("Please fill this in"));
	}
	
	@Test
	//O objetivo desse teste � n�o submeter o formul�rio ap�s o n�o preenchimento de nenhuma informa��o, validando a �ltima mensagem
	public void NaoDeveSubmeterFormularioMensagemFinal() throws InterruptedException {
		
		//Tela Pr� Formul�rio
		spage.EsperaInicialPorXpath(10,"//div[@class='sc-kkGfuU isqsrw']//img[@class='stkv-c-attachment__content--centered stkv-o-image']");
		Thread.sleep(500);
		spage.ClicaBotaoXpath("//button[@class='stkv-c-button stkv-us-button-color--background stkv-u-background-color-transition-150 stkv-us-button-color--border stkv-us-button-color stkv-us-button-color--fill stkv-c-button stkv-c-button--raised stkv-c-button--big']");
		Thread.sleep(500);
		
		//Preenchimento do formul�rio
		apage.BotaoTab("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");
		Thread.sleep(500);
		apage.BotaoTab("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");
		Thread.sleep(500);
		apage.BotaoTab("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");
		Thread.sleep(500);
		apage.BotaoTab("//input[@class = 'sc-cJSrbW ekUgmD']");
		Thread.sleep(500);
		apage.EsperaInicialPorXpath(10, "//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		apage.ClicaBotaoXpath("//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		assertTrue(apage.ChecaExibicaoErroPreenchimentoFinal("2 answers need completing"));
	}
	
	@Test
	//O objetivo desse teste � n�o submeter o formul�rio ap�s o n�o preenchimento do campo nome, validando a �ltima mensagem.
	public void NaoDeveSubmeterFormularioMensagemFinalSemNome() throws InterruptedException {
		
		spage.EsperaInicialPorXpath(10,"//div[@class='sc-kkGfuU isqsrw']//img[@class='stkv-c-attachment__content--centered stkv-o-image']");
		Thread.sleep(500);
		spage.ClicaBotaoXpath("//button[@class='stkv-c-button stkv-us-button-color--background stkv-u-background-color-transition-150 stkv-us-button-color--border stkv-us-button-color stkv-us-button-color--fill stkv-c-button stkv-c-button--raised stkv-c-button--big']");
		Thread.sleep(500);
		apage.BotaoTab("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");
		Thread.sleep(500);
		apage.BotaoTab("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");
		Thread.sleep(500);
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "teste@hotmail.com");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("//div[@class = 'stkv-c-block-btn stkv-qa-block-btn is-animated is-visible stkv-u-not-in-flow']//button");
		Thread.sleep(500);
		apage.BotaoTab("//input[@class = 'sc-cJSrbW ekUgmD']");
		Thread.sleep(500);
		apage.EsperaInicialPorXpath(10, "//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		apage.ClicaBotaoXpath("//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		assertTrue(apage.ChecaExibicaoErroPreenchimentoFinal("1 answer needs completing"));
	}
	
	@Test
	//O objetivo desse teste � submeter o formul�rio ap�s a revis�o do campo nome
	public void DeveSubmeterFormularioAposReviewNome() throws InterruptedException {
		
		//In�cio Padr�o do formul�rio
		spage.EsperaInicialPorXpath(10,"//div[@class='sc-kkGfuU isqsrw']//img[@class='stkv-c-attachment__content--centered stkv-o-image']");
		Thread.sleep(500);
		spage.ClicaBotaoXpath("//button[@class='stkv-c-button stkv-us-button-color--background stkv-u-background-color-transition-150 stkv-us-button-color--border stkv-us-button-color stkv-us-button-color--fill stkv-c-button stkv-c-button--raised stkv-c-button--big']");
		Thread.sleep(500);
		apage.BotaoTab("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");
		Thread.sleep(500);
		apage.BotaoTab("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");
		Thread.sleep(500);
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "teste@hotmail.com");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("//div[@class = 'stkv-c-block-btn stkv-qa-block-btn is-animated is-visible stkv-u-not-in-flow']//button");
		Thread.sleep(500);
		apage.BotaoTab("//input[@class = 'sc-cJSrbW ekUgmD']");
		Thread.sleep(500);
		apage.EsperaInicialPorXpath(10, "//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		apage.ClicaBotaoXpath("//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		assertTrue(apage.ChecaExibicaoErroPreenchimentoFinal("1 answer needs completing"));
		Thread.sleep(500);
		
		//In�cio da revis�o
		apage.ClicaBotaoXpath("//button [@class = 'sc-dVhcbM kESmWB' and @data-qa = 'review-mode-button']");
		Thread.sleep(500);
		assertTrue(apage.ChecaExibicaoMensagemErro("Please fill this in"));
		Thread.sleep(500);
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "Nome de Teste");
		Thread.sleep(500);
		apage.BotaoTab("//input[@class = 'sc-cJSrbW ekUgmD']");
		Thread.sleep(500);
		apage.BotaoTab("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");
		Thread.sleep(500);
		apage.BotaoTab("//input[@class = 'sc-cJSrbW ekUgmD']");
		
		//T�rmino do Formul�rio
		Thread.sleep(500);
		apage.EsperaInicialPorXpath(10, "//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		Thread.sleep(500);
		apage.EsperaInicialPorXpath(10, "//h1[@class = 'sc-bxivhb iYGUAI']");
		Thread.sleep(500);
		assertTrue(fpage.ValidaTerminoFormulario("Thanks for completing this typeform"));
		
	}
	
	@Test
	//O objetivo desse teste � submeter o formul�rio ap�s a revis�o do campo e-mail
	public void DeveSubmeterFormularioAposReviewEmail() throws InterruptedException {
		
		//In�cio Padr�o do formul�rio
		spage.EsperaInicialPorXpath(10,"//div[@class='sc-kkGfuU isqsrw']//img[@class='stkv-c-attachment__content--centered stkv-o-image']");
		Thread.sleep(500);
		spage.ClicaBotaoXpath("//button[@class='stkv-c-button stkv-us-button-color--background stkv-u-background-color-transition-150 stkv-us-button-color--border stkv-us-button-color stkv-us-button-color--fill stkv-c-button stkv-c-button--raised stkv-c-button--big']");
		Thread.sleep(500);
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "Nome de Teste");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("//div[@class = 'stkv-c-block-btn stkv-qa-block-btn is-animated is-visible stkv-u-not-in-flow']//button");
		Thread.sleep(500);
		apage.BotaoTab("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");
		Thread.sleep(500);
		apage.BotaoTab("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");
		Thread.sleep(500);
		apage.BotaoTab("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[4]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]");
		Thread.sleep(500);
		apage.EsperaInicialPorXpath(10, "//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		apage.ClicaBotaoXpath("//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		assertTrue(apage.ChecaExibicaoErroPreenchimentoFinal("1 answer needs completing"));
		Thread.sleep(500);
		
		//In�cio da revis�o
		apage.ClicaBotaoXpath("//button [@class = 'sc-dVhcbM kESmWB' and @data-qa = 'review-mode-button']");
		Thread.sleep(500);
		assertTrue(apage.ChecaExibicaoMensagemErro("Please fill this in"));
		Thread.sleep(500);
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "Teste@hotmail.com");
		Thread.sleep(500);
		apage.BotaoTab("//input[@class = 'sc-cJSrbW ekUgmD']");
		Thread.sleep(500);
		apage.BotaoTab("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");
		Thread.sleep(500);
		apage.BotaoTab("//input[@class = 'sc-cJSrbW ekUgmD']");
		
		//T�rmino do Formul�rio
		Thread.sleep(500);
		apage.EsperaInicialPorXpath(10, "//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("//div[@class='sc-lhVmIH gmkGNJ']//button[@class='sc-dVhcbM qMOQK']");
		Thread.sleep(500);
		apage.EsperaInicialPorXpath(10, "//h1[@class = 'sc-bxivhb iYGUAI']");
		Thread.sleep(500);
		assertTrue(fpage.ValidaTerminoFormulario("Thanks for completing this typeform"));
		
	}
	
	@Test
	public void DeveValidarEmail() throws InterruptedException {
		
		//Tela Pr� Formul�rio
		spage.EsperaInicialPorXpath(10,"//div[@class='sc-kkGfuU isqsrw']//img[@class='stkv-c-attachment__content--centered stkv-o-image']");
		Thread.sleep(500);
		spage.ClicaBotaoXpath("//button[@class='stkv-c-button stkv-us-button-color--background stkv-u-background-color-transition-150 stkv-us-button-color--border stkv-us-button-color stkv-us-button-color--fill stkv-c-button stkv-c-button--raised stkv-c-button--big']");
		Thread.sleep(500);
		
		//In�cio do preenchimento do formul�rio
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "Wander");
		Thread.sleep(500);
		apage.ChecaExibicaoBotao("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]");
		Thread.sleep(500);
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "Aquino");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("//div[@class='stkv-c-block-btn stkv-qa-block-btn is-animated is-visible stkv-u-not-in-flow']//button");
		Thread.sleep(500);
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "TesteTeste");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("//div[@class = 'stkv-c-block-btn stkv-qa-block-btn is-animated is-visible stkv-u-not-in-flow']//button");
		Thread.sleep(500);
		assertTrue(apage.ChecaExibicaoMensagemErroEmailInvalido());
		
		
	}

	@Test
	//Teste com objetivo de validar a submiss�o do formul�rio com o preenchimento de todos os campos
	public void NaoDeveExibirSugestaoPais() throws InterruptedException {
		
		//Tela Pr� Formul�rio
		spage.EsperaInicialPorXpath(10,"//div[@class='sc-kkGfuU isqsrw']//img[@class='stkv-c-attachment__content--centered stkv-o-image']");
		Thread.sleep(500);
		spage.ClicaBotaoXpath("//button[@class='stkv-c-button stkv-us-button-color--background stkv-u-background-color-transition-150 stkv-us-button-color--border stkv-us-button-color stkv-us-button-color--fill stkv-c-button stkv-c-button--raised stkv-c-button--big']");
		Thread.sleep(500);
		
		//In�cio do preenchimento do formul�rio
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "Wander");
		Thread.sleep(500);
		apage.ChecaExibicaoBotao("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]");
		Thread.sleep(500);
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "Aquino");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("//div[@class='stkv-c-block-btn stkv-qa-block-btn is-animated is-visible stkv-u-not-in-flow']//button");
		Thread.sleep(500);
		apage.PreencheTextoXpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/main[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]", "teste@hotmail.com");
		Thread.sleep(500);
		apage.ClicaBotaoXpath("//div[@class = 'stkv-c-block-btn stkv-qa-block-btn is-animated is-visible stkv-u-not-in-flow']//button");
		Thread.sleep(500);
		apage.PreencheComboDigitando("    ");
		Thread.sleep(500);
		assertTrue(apage.ChecaExibicaoMensagemErro("No suggestions found"));

	}
}
