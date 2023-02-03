package com.caar.compra.neoris.step;

import com.caar.compra.neoris.pageobjects.CarritoDeComprasPageObject;

import net.thucydides.core.annotations.Steps;

public class ValidacionSteps {

	@Steps
	CarritoDeComprasPageObject carritoDeComprasPageObject;
	
	public void validarCompra() {
		carritoDeComprasPageObject.validarCompra();
	}
}
