Feature: Monitoreo de una Web registradas.
  Yo como usuario de status checkup
  Quiero rmonitorear una URL en el aplicativo
  Para el revisar de tráfico web que tiene.

  @test
  Scenario: probar un url ya registrada
    Given ingreso al portal de monitoreo con "jorgepazdiaz@gmail.com" y password "P@zdiaz20221"
    When busco la url a monitorear "https://novustechnology.pe/"
    Then puedo ver los datos de la pagina que busco