package com.caar.compra.neoris.definitions;

import com.caar.compra.neoris.step.ProductosSteps;
import com.caar.compra.neoris.step.ValidacionSteps;
import com.caar.compra.neoris.step.CarritoDeComprasStep;
import com.caar.compra.neoris.step.InicioSesionStep;
import com.caar.compra.neoris.step.PaginaInicioStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CompraDefinitions {
	@Steps
	InicioSesionStep loginStep;
	
	@Steps
	ProductosSteps productosSteps;
	
	@Steps
	PaginaInicioStep mainSteps;
	
	@Steps
	CarritoDeComprasStep carritoDeComprasStep;
	
	@Steps
	ValidacionSteps validacionSteps;

	
	@Given("ingresar a la pagina con {string} y {string}")
	public void ingresar_a_la_pagina_con_y(String usuario, String clave)  {
		loginStep.ingresoALaPagina();
		loginStep.inicioSesion(usuario,clave);
	}

	@When("elegir categoria {string}")
	public void elegir_categoria(String categoria) {
		productosSteps.elegirCategoria(categoria);
	}

	@When("seleccionar producto {string} y agregar al carrito")
	public void seleccionar_producto_y_agregar_al_carrito(String producto) {
		productosSteps.seleccionarProductoYAgregar(producto);
	}

	@When("ir al carrito")
	public void ir_al_carrito() {
		mainSteps.irAlCarritoDeCompras();
	}

	@When("validar producto agregados {string} {string}")
	public void validar_producto_agregados(String producto1, String producto2) {
		carritoDeComprasStep.validarProductos(producto1, producto2);
	}

	@When("diligenciar formulario {string} {string} {string} {string} {string} {string}")
	public void llenar_formulario(String nombreC,String paisC,String ciudadC,String tarjetaCre, String mesC, String yearC) {
	    carritoDeComprasStep.diligenciasFormulario(nombreC, paisC, ciudadC, tarjetaCre, mesC, yearC);
	}

	@Then("validar la compra de productos")
	public void validar_la_compra_de_productos() {
		validacionSteps.validarCompra();
	}

}
