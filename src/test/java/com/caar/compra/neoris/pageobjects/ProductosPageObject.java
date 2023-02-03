package com.caar.compra.neoris.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import utilities.Aplicativo;

public class ProductosPageObject extends PageObject{
	
	private Aplicativo aplicativo;
	
	String categoria = "//div//a[contains(text(),'CATEGORIES')]";
	String tipoCategoria = "//div//a[contains(text(),'CATEGORIA')]";
	
	String tipoProducto ="//div[@id='tbodyid']//div//div//div//h4//a[contains(text(),'PRODUCTO')]";
	String boton_AgregarAlCarrito = "//div//a[contains(text(),'Add to cart') and contains(@onclick,'addToCart')]";
	
	public void elegirCategoria(String categoria) {
		WebElement categoriaElegida = getDriver().findElement(By.xpath(tipoCategoria.replace("CATEGORIA", categoria)));
		aplicativo.clickConJS(tipoCategoria.replace("CATEGORIA", categoria));
		Serenity.takeScreenshot();
	}
	
	public void seleccionarProducto(String producto) {
		WebElement productoElegido = getDriver().findElement(By.xpath(tipoProducto.replace("PRODUCTO", producto)));
		productoElegido.click();
		Serenity.takeScreenshot();
	}
	
	public void agregarAlCarrito() {
		WebElement btnAgregarAlCarrito = getDriver().findElement(By.xpath(boton_AgregarAlCarrito));
		btnAgregarAlCarrito.click();
		Serenity.takeScreenshot();
		aplicativo.aceptarAletar();
	}
	

}
