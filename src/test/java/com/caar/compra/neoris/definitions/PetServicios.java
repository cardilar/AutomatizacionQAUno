package com.caar.compra.neoris.definitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import servicios.PetStoreServicios;

public class PetServicios {
	
	@Steps
	PetStoreServicios petStoreServicios;
	
	@Given("agregar mascota al inventario")
	public void agregarMascotaAlInventario() throws IOException  {
		petStoreServicios.agregarMascota();
	}
	
	@When("consultar mascota por ID")
	public void consultarMascotaPorID() throws IOException {
		petStoreServicios.consultarMascotaPorId();
	}
	
	@When("modificar nombre y estado de mascota")
	public void modificar_nombre_y_estado_de_mascota() throws IOException {
		petStoreServicios.modificarMascota();
	}
	
	@Then("consultar mascota por estado")
	public void consultar_mascota_por_estado() throws IOException {
	    petStoreServicios.consultarMascotaPorStatus();
	}

}
