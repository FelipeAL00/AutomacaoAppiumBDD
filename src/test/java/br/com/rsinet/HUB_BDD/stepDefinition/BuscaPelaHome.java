package br.com.rsinet.HUB_BDD.stepDefinition;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import br.com.rsinet.HUB_BDD.picoContainer.ContextoTeste;
import br.com.rsinet.HUB_BDD.screenFactory.HomeScreen;
import br.com.rsinet.HUB_BDD.screenFactory.SearchScreen;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BuscaPelaHome {

	private ContextoTeste contexto;
	private HomeScreen homeScreen;
	private SearchScreen searchScreen;
	private AppiumDriver<MobileElement> driver;

	public BuscaPelaHome(ContextoTeste contexto) throws MalformedURLException {
		this.contexto = contexto;
		homeScreen = this.contexto.getPageObjectManager().getHomePage();
		searchScreen = this.contexto.getPageObjectManager().getSearchPage();
		driver = this.contexto.getWebDriverManager().getDriver();
	}

	@Quando("^clico em um produto \"([^\"]*)\"$")
	public void clicoEmUmProduto(String texto) {
		homeScreen.clickProdutosHome(texto.toUpperCase());
	}

	@Quando("^clico em um modelo \"([^\"]*)\"$")
	public void clicoEmUmModelo(String texto) {
		searchScreen.clicandoNoProduto(texto);
	}

	@Entao("^estarei na tela do produto \"([^\"]*)\"$")
	public void estareiNaTelaDoProduto(String texto) {
		assertTrue(driver.getPageSource().contains(texto));
	}

	@Quando("^clico em filtro$")
	public void clicoEmFiltro() {
		searchScreen.clicandoNoFiltro();
	}

	@Quando("^clico em um filtro especifico \"([^\"]*)\"$")
	public void clicoEmUmFiltroEspecifico(String texto) {
		searchScreen.clicandoComponenteFiltro(texto.toUpperCase());
	}
	
	@Quando("^clico em outro  \"([^\"]*)\"$")
	public void clicoEmOutro(String texto) {
		searchScreen.clicandoComponenteFiltro(texto.toUpperCase());
	}
	
	@Quando("^clico na opcao do filtro  \"([^\"]*)\"$")
	public void clicoNaOpcaoDoFiltro(String texto) {
		searchScreen.clicandoComponenteFiltro(texto);
	}
		
	@Quando("^clico na opcao \"([^\"]*)\" atraves de index$")
	public void clicoNaOpcaoAtravesDeIndex(String texto) {
	    searchScreen.clicandoComponenteFiltro(texto);
	    searchScreen.clicandoEmAplicarFiltro();
	}

	@Entao("^terei a seguinte mensagem \"([^\"]*)\"$")
	public void tereiASeguinteMensagem(String texto) {
		assertTrue(driver.getPageSource().contains(texto));
	}
}
