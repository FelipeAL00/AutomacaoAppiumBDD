package br.com.rsinet.HUB_BDD.testeRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features",
		glue = {"br.com.rsinet.HUB_BDD.stepDefinition" }, 
		monochrome = true, 
		snippets = SnippetType.CAMELCASE
)
public class Runner {

}
