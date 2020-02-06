package br.com.rsinet.HUB_BDD.picoContainer;

import java.net.MalformedURLException;

import br.com.rsinet.HUB_BDD.manager.PageObjectManager;
import br.com.rsinet.HUB_BDD.manager.WebDriverManager;

public class ContextoTeste {

	private WebDriverManager manager;
	private PageObjectManager pageObjectManager;

	public ContextoTeste() throws MalformedURLException {
		manager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(manager.getDriver());
	}

	public WebDriverManager getWebDriverManager() {
		return manager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
}
