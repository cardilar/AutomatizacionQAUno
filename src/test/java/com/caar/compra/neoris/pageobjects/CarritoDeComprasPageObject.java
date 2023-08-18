package com.caar.compra.neoris.pageobjects;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import utilities.Aplicativo;

public class CarritoDeComprasPageObject extends PageObject{
	Aplicativo aplicativo;
	
	String productos = "//tr//td[contains(text(),'productos')]";
	
	String boton_place_Order = "//button[contains(text(),'Place Order')]";
	String name = "//input[@id='name']";
	String country = "country";
	String city = "//input[@id='city']";
	String tarjetaC = "//input[@id='card']";
	String month = "month";
	String year = "year";
	String boton_purchase = "//button[contains(text(),'Purchase')]";
	String mensajeCompra = "//h2[contains(text(),'Thank ')]";
	
	public void verificarProductos(String producto1, String producto2) {
		String esperaProducto = productos.replace("productos", producto1);
		aplicativo.esperarElementoVisible(esperaProducto);
		WebElement primerProducto = getDriver().findElement(By.xpath(esperaProducto));
		aplicativo.bordearConJS(primerProducto);
		WebElement segundoProducto = getDriver().findElement(By.xpath(productos.replace("productos", producto2)));
		aplicativo.bordearConJS(segundoProducto);	
	}
	
	public void diligenciarFormulario(String nombreC,String paisC,String ciudadC,String tarjetaCre, String mesC, String yearC) {
		WebElement btnOrdernar = getDriver().findElement(By.xpath(boton_place_Order));
		btnOrdernar.click();
		WebElement nombre = getDriver().findElement(By.xpath(name));
		nombre.sendKeys(nombreC);
		WebElement pais = getDriver().findElement(By.id(country));
		pais.sendKeys(paisC);
		WebElement ciudad = getDriver().findElement(By.xpath(city));
		ciudad.sendKeys(ciudadC);
		WebElement tarjeta = getDriver().findElement(By.xpath(tarjetaC));
		tarjeta.sendKeys(tarjetaCre);
		WebElement mes = getDriver().findElement(By.id(month));
		mes.sendKeys(mesC);
		WebElement years = getDriver().findElement(By.id(year));
		years.sendKeys(yearC);
		aplicativo.clickConJS(boton_purchase);
	}

	public void validarCompra() {
		WebElement mensaje = getDriver().findElement(By.xpath(mensajeCompra));
		assertTrue("Thank you for your purchase!", containsText(mensaje.getText()));
	}

	public void validarCompra2() {
		WebElement mensaje = getDriver().findElement(By.xpath(mensajeCompra));
		assertTrue("Thank you for your purchase!", containsText(mensaje.getText()));
	}
}
