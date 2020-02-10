package br.com.rsinet.HUB_BDD.stepDefinition;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import br.com.rsinet.HUB_BDD.picoContainer.ContextoTeste;
import br.com.rsinet.HUB_BDD.screenFactory.HomeScreen;
import br.com.rsinet.HUB_BDD.screenFactory.RegisterScreen;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CadastroUsuario {

	private ContextoTeste contexto;
	private AppiumDriver<MobileElement> driver;
	private HomeScreen homeScreen;
	private RegisterScreen registerScreen;

	public CadastroUsuario(ContextoTeste contexto) throws MalformedURLException {
		this.contexto = contexto;
		registerScreen = this.contexto.getPageObjectManager().getRegisterPage();
		homeScreen = this.contexto.getPageObjectManager().getHomePage();
		driver = this.contexto.getWebDriverManager().getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@Quando("^clico no botao logar$")
	public void clicoNoBotaoLogar() {
		homeScreen.clickMenu();
		homeScreen.clickLogin();
	}

	@Quando("^clico em Criar uma nova conta$")
	public void clicoEmCriarUmaNovaConta() {
		homeScreen.clickCriarConta();
	}

	@Quando("^informo o username \"([^\"]*)\"$")
	public void informoOUsername(String texto) {
		registerScreen.passarNome(texto);
	}

	@Quando("^informo o email \"([^\"]*)\"$")
	public void informoOEmail(String texto) {
		registerScreen.passarEmail(texto);
	}

	@Quando("^informo a senha \"([^\"]*)\"$")
	public void informoASenha(String texto) {
		registerScreen.passarSenha(texto);
	}

	@Quando("^informo a confirmacao da senha \"([^\"]*)\"$")
	public void informoAConfirmacaoDaSenha(String texto) {
		registerScreen.passarConfirmacaoSenha(texto);
	}

	@Quando("^informo o primeiro nome \"([^\"]*)\"$")
	public void informoOPrimeiroNome(String texto) {
		registerScreen.passarPrimeiroNome(texto);
	}

	@Quando("^informo o ultimo nome \"([^\"]*)\"$")
	public void informoOUltimoNome(String texto) {
		registerScreen.passarUltimoNome(texto);
	}

	@Quando("^informo o telefone \"([^\"]*)\"$")
	public void informoOTelefone(String texto) {
		registerScreen.passarNumeroTelefone(texto);
	}

	@Quando("^informo o Pais \"([^\"]*)\"$")
	public void informoOPais(String texto) {
		registerScreen.passarPais(texto);
	}

	@Quando("^informo o estado \"([^\"]*)\"$")
	public void informoOEstado(String texto) {
		registerScreen.passarEstado(texto);
	}

	@Quando("^informo o endereco \"([^\"]*)\"$")
	public void informoOEndereco(String texto) {
		registerScreen.passarEndereco(texto);
	}

	@Quando("^informo a cidade \"([^\"]*)\"$")
	public void informoACidade(String texto) {
		registerScreen.passarCidade(texto);
	}

	@Quando("^informo o CEP \"([^\"]*)\"$")
	public void informoOCEP(String texto) {
		registerScreen.passarCEP(texto);
	}

	@Quando("^clico em não receber ofertas e promocoes$")
	public void clicoEmNãoReceberOfertasEPromocoes() {
		registerScreen.clicarCheckReceberMensagens();
	}

	@Quando("^clico em registrar$")
	public void clicoEmRegistrar() {
		registerScreen.clicarBtnRegistrar();
	}

	@Entao("^o meu usuario aparece conectado como \"([^\"]*)\"$")
	public void oMeuUsuarioApareceConectadoComo(String texto) {
		homeScreen.clickMenu();
		assertTrue(homeScreen.getUserLogado().contains(texto));
	}

	@Entao("^nao consigo me registrar porque as senhas estao diferentes$")
	public void naoConsigoMeRegistrarPorqueAsSenhasEstaoDiferentes() {
		assertTrue(registerScreen.confirmandoSeAsSenhasEstaoErradas("Passwords do not match"));
	}

}
