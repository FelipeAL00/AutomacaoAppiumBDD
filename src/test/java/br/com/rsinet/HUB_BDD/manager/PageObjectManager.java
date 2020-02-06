package br.com.rsinet.HUB_BDD.manager;

import br.com.rsinet.HUB_BDD.pageFactory.HomeScreen;
import br.com.rsinet.HUB_BDD.pageFactory.RegisterScreen;
import br.com.rsinet.HUB_BDD.pageFactory.SearchScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PageObjectManager {
	private AppiumDriver<MobileElement> driver;

	private HomeScreen homePage;

	private RegisterScreen registerPage;

	private SearchScreen searchPage;

	public PageObjectManager(AppiumDriver<MobileElement> driver) {

		this.driver = driver;

	}

	public HomeScreen getHomePage() {

		return (homePage == null) ? homePage = new HomeScreen(driver) : homePage;

	}

	public RegisterScreen getRegisterPage() {

		return (registerPage == null) ? registerPage = new RegisterScreen(driver) : registerPage;

	}

	public SearchScreen getSearchPage() {

		return (searchPage == null) ? searchPage = new SearchScreen(driver) : searchPage;

	}
}
