package br.com.rsinet.HUB_BDD.stepDefinition;

import br.com.rsinet.HUB_BDD.picoContainer.ContextoTeste;
import cucumber.api.java.After;

public class Hooks {
	
	private ContextoTeste contexto;

	public Hooks(ContextoTeste contexto) {
		this.contexto = contexto;
	}
	
	@After
	public void finalizaTestes() {
		contexto.getWebDriverManager().closeDriver();
	}
}
