package com.caar.compra.neoris.step;

import com.caar.compra.neoris.pageobjects.CarritoDeComprasPageObject;

import net.thucydides.core.annotations.Steps;

public class CarritoDeComprasStep {
	
	@Steps
	CarritoDeComprasPageObject carritoDeComprasPageObject;

	public void validarProductos(String producto1, String producto2) {
		carritoDeComprasPageObject.verificarProductos(producto1, producto2);
	}
	
	public void diligenciasFormulario(String nombreC,String paisC,String ciudadC,String tarjetaCre, String mesC, String yearC) {
		carritoDeComprasPageObject.diligenciarFormulario(nombreC, paisC, ciudadC, tarjetaCre, mesC, yearC);
	}
}
