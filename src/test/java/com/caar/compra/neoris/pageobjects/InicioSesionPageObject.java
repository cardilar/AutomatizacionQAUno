package com.caar.compra.neoris.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import utilities.Aplicativo;

public class InicioSesionPageObject extends PageObject{
	private Aplicativo aplicativo;
	
	String boton_Inicio_Sesion = "//a[@id='login2']";
	
	String usuario_Login = "//input[@id='loginusername']";
	
	String clave_Login = "//input[@id='loginpassword']";
	
	String boton_Login="//button[@type='button' and @onclick='logIn()']";
	
	public void iniciaSesionAplicativo(String usuario, String clave) {
		WebElement botonInicio = getDriver().findElement(By.xpath(boton_Inicio_Sesion));
		botonInicio.click();
		WebElement user = getDriver().findElement(By.xpath(usuario_Login));
		user.sendKeys(usuario);
		WebElement pass= getDriver().findElement(By.xpath(clave_Login));
		pass.sendKeys(clave);
		Serenity.takeScreenshot();
		aplicativo.clickConJS(boton_Login);
		Serenity.takeScreenshot();
	}
	

	


}
