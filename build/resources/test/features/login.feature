Feature:  Como usuario , Ingresar 10 veces en la plataforma

@Escenario
Scenario Outline:Ingresar a la plataforma de Evalart como usuario valido
Given Dirigirse a la URL
When el usuario ingresa <usuario> y <contrasena>
Then Usuario da click en el boton Enviar

  Examples:
    |usuario|contrasena|
    |46675|10df2f32286b7120Mi00LTE1NzY2NA==30e0c83e6c29f1c3|