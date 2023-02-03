package com.caar.compra.neoris.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class PaginaInicioPageObject extends PageObject{

	String home = "//li//a[contains(text(),'Home')]";
	String carritoDeCompras = "//li//a[contains(text(),'Cart')]";
	
	public void irAlHome() {
		WebElement paginaHome = getDriver().findElement(By.xpath(home));
		paginaHome.click();
	}
	
	public void irAlCarritoDeCompras() {
		WebElement paginaCart = getDriver().findElement(By.xpath(carritoDeCompras));
		paginaCart.click();
	}
}
