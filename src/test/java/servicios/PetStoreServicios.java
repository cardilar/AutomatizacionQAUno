package servicios;

import java.io.IOException;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

public class PetStoreServicios {
	
	public String consultarMascotaPorId() throws IOException{
		Response response = SerenityRest.given().header("Content-Type", "application/json")
				.when().get("https://petstore.swagger.io/v2/pet/113");
		String respuesta = response.asString();
		return respuesta;
		
	}
	
	public String agregarMascota() throws IOException{
		Response response = SerenityRest.given().header("Content-Type", "application/json")
				.body("{\r\n  \"id\": 113,\r\n  \"category\": {\r\n    \"id\": 12398,\r\n    \"name\": \"pincher\"\r\n  },\r\n  \"name\": \"peque\",\r\n  \"photoUrls\": [\r\n    \"string\"\r\n  ],\r\n  \"tags\": [\r\n    {\r\n      \"id\": 1113,\r\n      \"name\": \"paco\"\r\n    }\r\n  ],\r\n  \"status\": \"available\"\r\n}")
				.when().post("https://petstore.swagger.io/v2/pet");
		String respuesta = response.asString();
		return respuesta;
		
	}
	
	public String modificarMascota() throws IOException{
		Response response = SerenityRest.given().header("Content-Type", "application/json")
				.body("{\r\n  \"id\": 113,\r\n  \"category\": {\r\n    \"id\": 12398,\r\n    \"name\": \"pincher\"\r\n  },\r\n  \"name\": \"pecas\",\r\n  \"photoUrls\": [\r\n    \"string\"\r\n  ],\r\n  \"tags\": [\r\n    {\r\n      \"id\": 1113,\r\n      \"name\": \"carlos\"\r\n    }\r\n  ],\r\n  \"status\": \"sold\"\r\n}")
				.when().put("https://petstore.swagger.io/v2/pet");
		String respuesta = response.asString();
		return respuesta;
		
	}
	
	public String consultarMascotaPorStatus() throws IOException{
		Response response = SerenityRest.given().header("Content-Type", "application/json")
				.param("status", "sold")
				.when().get("https://petstore.swagger.io/v2/pet/findByStatus");
		String respuesta = response.asString();
		return respuesta;
		
	}
	
}
