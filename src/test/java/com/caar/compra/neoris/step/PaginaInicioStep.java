package com.caar.compra.neoris.step;

import com.caar.compra.neoris.pageobjects.PaginaInicioPageObject;

import net.thucydides.core.annotations.Steps;

public class PaginaInicioStep {
	
	@Steps
	PaginaInicioPageObject mainPageObject;
	
	public void irAlCarritoDeCompras() {
		mainPageObject.irAlCarritoDeCompras();
	}

}
