package br.com.rsinet.HUB_BDD.stepDefinition;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import br.com.rsinet.HUB_BDD.pageFactory.HomeScreen;
import br.com.rsinet.HUB_BDD.pageFactory.SearchScreen;
import br.com.rsinet.HUB_BDD.picoContainer.ContextoTeste;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BuscaPelaLupa {
	
	
	private ContextoTeste contexto;
	private AppiumDriver<MobileElement> driver;
	private SearchScreen searchScreen;
	private HomeScreen homeScreen;
	
	public BuscaPelaLupa(ContextoTeste contexto) throws MalformedURLException {
		this.contexto = contexto;
		homeScreen = this.contexto.getPageObjectManager().getHomePage();
		searchScreen = this.contexto.getPageObjectManager().getSearchPage();
		driver = this.contexto.getWebDriverManager().getDriver();
	}
	

	@Quando("^pesquiso pelo modelo \"([^\"]*)\"$")
	public void pesquisoPeloModelo(String texto) {
		homeScreen.pesquisarProdutoLupa(texto);
	}

	@Quando("^clico na lupa$")
	public void clicoNaLupa()  {
		homeScreen.clicandoParaPesquisar();
	}

	@Quando("^clico no modelo \"([^\"]*)\"$")
	public void clicoNoModelo(String texto) {
		searchScreen.clicandoComponenteFiltro(texto);
	}

	@Entao("^estarei na tela do modelo \"([^\"]*)\"$")
	public void estareiNaTelaDoModelo(String texto)  {
		assertTrue(driver.getPageSource().contains(texto.toUpperCase()));
	}

	@Entao("^aparecerá uma mensagem de erro \"([^\"]*)\"Dell Supremm\"([^\"]*)\"$")
	public void apareceráUmaMensagemDeErroDellSupremm(String texto) {
		assertTrue(driver.getPageSource().contains(texto));
	}
}
