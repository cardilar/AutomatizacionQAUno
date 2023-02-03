#Author: cardilar1234@gmail.com

@tag4
Feature: tienda de mascotas

  @tag3
    Scenario: Agregar nueva mascota a la tienda
    Given agregar mascota al inventario
  	When consultar mascota por ID
  	And modificar nombre y estado de mascota
  	Then consultar mascota por estado