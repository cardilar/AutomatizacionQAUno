package com.caar.compra.neoris.step;


import com.caar.compra.neoris.pageobjects.InicioSesionPageObject;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import utilities.Aplicativo;

public class InicioSesionStep {
	
	private Aplicativo aplicativo;
	
	@Steps
	InicioSesionPageObject loginPageObject;

	
	@Step
	public void ingresoALaPagina() {
		aplicativo.abrirPagina();
	}
	
	public void inicioSesion(String usuario, String clave) {
		loginPageObject.iniciaSesionAplicativo(usuario, clave);
	}

	

}
