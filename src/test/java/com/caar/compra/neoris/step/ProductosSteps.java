package com.caar.compra.neoris.step;

import com.caar.compra.neoris.pageobjects.PaginaInicioPageObject;
import com.caar.compra.neoris.pageobjects.ProductosPageObject;

import net.thucydides.core.annotations.Steps;

public class ProductosSteps {

	@Steps
	ProductosPageObject productsPageObject;
	@Steps
	PaginaInicioPageObject mainPageObject;
	
	
	public void elegirCategoria(String usuario) {
		productsPageObject.elegirCategoria(usuario);
	}
	
	public void seleccionarProductoYAgregar(String producto) {
		productsPageObject.seleccionarProducto(producto);
		productsPageObject.agregarAlCarrito();
		mainPageObject.irAlHome();
	}
	
	
}
