#Author: cardilar1234@gmail.com

@tag
Feature: Realizar compra

  @tag2
  Scenario Outline: realizar compra de dos productos
    Given ingresar a la pagina con "<usuario>" y "<clave>"
    When elegir categoria "<Categoria1>" 
    And seleccionar producto "<Producto1>" y agregar al carrito
    And elegir categoria "<Categoria2>" 
    And seleccionar producto "<Producto2>" y agregar al carrito
    And ir al carrito
    And validar producto agregados "<Producto1>" "<Producto2>"
    And diligenciar formulario "<nombre>" "<pais>" "<ciudad>" "<tarjeta>" "<mes>" "<year>"
    Then validar la compra de productos
    

    Examples: 
    |usuario| clave    | Categoria1  |Producto1|Categoria2 |Producto2|nombre|pais  |ciudad |tarjeta|mes|year     | 
    | admin | admin |Phones       | Samsung galaxy s6  |Laptops |Sony vaio i5  | Cesar|Colombia|Armenia|32139201|Julio   |2023|