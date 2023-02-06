Feature: Login en la página Status Chekup.
  Yo como usuario de status checkup
  Quiero ingresar a la página status checkup
  Para ingresar a la web de monitoreo.

  @test
  Scenario: Ingreso con cuenta valida.
    Given que estoy en la web de StatusCheckup
    When ingreso correo "jorgepazdiaz@gmail.com"
    And ingreso contraseña "P@zdiaz20221"
    Then puedo ingresar al portal de monitoreo
    And valido el correo de logeo "jorgepazdiaz@gmail.com"

  @test
  Scenario: Ingreso con correo invalida.
    Given que estoy en la web de StatusCheckup
    When ingreso correo invalido "textprueba@gmail.com"
    And ingreso contraseña "P@zdiaz20221"
    Then valido el mensaje de correo errado "that username doesn't exist"

  @test
  Scenario: Ingreso con password invalida.
    Given que estoy en la web de StatusCheckup
    When ingreso correo invalido "jorgepazdiaz@gmail.com"
    And ingreso contraseña "1234566"
    Then valido el mensaje de password errado "incorrect password"