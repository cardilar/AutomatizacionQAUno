package com.caar.compra.neoris.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

	@RunWith(CucumberWithSerenity.class)
	@CucumberOptions(
			features = "src/test/resources/features/Compra.feature"
			,tags = "@tag2"
			,glue= {"com.caar.compra.neoris.definitions"})
	public class compraRunner {

	}


