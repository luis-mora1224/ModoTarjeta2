# ModoTarjeta2
Micro servicio creado para mostrar la sugerencia de tarjetas de crédito de acuerdo a un rango salarial, las preferencias y la edad.

¿Que este micro servicio?

La función es retornar una lista de tarjetas de crédito, estas se catalogan de acuerdo a datos recibidos del cliente.
Los datos que se usan son:

  -Preferencias (Shopping,Travels,Help,My business,Sports,My style)
  -Rango de edad (18 años hasta 75 de acuerdo a la tabla del ejercicio)
  -Rango salarial (7000.00 pesos hasta 1000000.00 que fue lo que considere, para algunas tarjetas que sugerian un rango sin acotamiento, 
   las que si sugerian si tienen rango especifico)
   
De acuerdo a estos datos y en base a la tabla del ejercicio, se retornar cual o cuales son las tarjetas que convienen a ese cliente.


End points usados

  -http://localhost:8080/api/v1/filtro
  -http://localhost:8080/h2-console
  
Una vez iniciado el sistema se debe de ingresar al gestor de h2 desde el end point 

  -http://localhost:8080/h2-console
  
en donde se ingresara con los datos mostrados

![Captura de pantalla de 2021-10-15 17-34-43](https://user-images.githubusercontent.com/83669962/137561396-e869e706-4ef3-4b6e-893c-dc6f8bd5b677.png)

Cuando se este dentro del gestor de h2 se procedera a copiar todo el codigo de Schema.sql, que se encuenra en la carpeta de recursos del proyecto(si es que la configuracion automatica no se cargara)

![Captura de pantalla de 2021-10-15 17-41-26](https://user-images.githubusercontent.com/83669962/137561743-7a28e14e-e422-4349-b328-2b82d9b0f613.png)

Listo para realizar las pruebas se utilizo el software de postman, ingresamos al end point http://localhost:8080/api/v1/filtro y seleccionamos el metodo "GET",
tambien procedemos a crear el archivo JSON de prueba, damos click en enviar.

Ya podemos ver como las sugerencias aparecen de acuerdo a los datos ingresados y de acuerdo a la tabla del ejercicio.

![Captura de pantalla de 2021-10-15 17-46-12](https://user-images.githubusercontent.com/83669962/137562021-fc63bdb0-58b1-4ac9-8856-82e4d49658cf.png)

![Captura de pantalla de 2021-10-15 17-46-52](https://user-images.githubusercontent.com/83669962/137562072-719d086d-6a01-4d65-8ac8-c47123acae06.png)

de igual forma podemos verificar que los datos en la consola de h2 coinciden con los del microservicio

![Captura de pantalla de 2021-10-15 17-48-41](https://user-images.githubusercontent.com/83669962/137562197-3cd2dc03-b139-41a4-8eee-c7c930ff0b2a.png)

Esta este es el funcionamiento de este micro servicio.
