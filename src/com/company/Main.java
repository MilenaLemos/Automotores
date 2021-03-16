package com.company;

import java.time.LocalDate;
import java.util.Scanner;

/*
La DNRPA (Dirección Nac. Reg. Propiedad del Automotor) necesita un sistema para anotar todos los vehículos registrados en el país.
La DNRPA tiene Registros seccionales.
Cada Registro tiene automotores registrados.

Los automotores pueden ser de uso particular o profesional.
Se registran motos eléctricas, autos eléctricos, motocicletas y automóviles a combustión, colectivos, utilitarios y camiones.

Todos los vehículos tienen un único propietario y autorizados a conducir.
De los propietarios y autorizados se sabe el nombre, DNI y dirección.

Se desea poder listar todos los autos registrados en todas las seccionales.
Se desea poder listar a todos los propietarios (en orden alfabético) de camiones.


Opcionales:
Cada automotor tiene una PATENTE única que se asigna automáticamente al realizar el alta o registro.
Se debe registrar la FECHA en la que se da de alta un automotor.
Los automotores pueden cambiar de propietario.
Se debe registrar la fecha de cambio de propietario.
Se puede consultar si pasó un año o más desde el registro o cambio de titular, para un auto en particular (se consulta por patente).

 */
public class Main {

    public static void main(String[] args) {
        autos.add(new Auto(true, false, "pablo", LocalDate.of(2020, 9, 01), 02551));
        Persona personaNueva = new Persona("Milena Lemos", "40132582", "Bolivar 4184");
        Auto autoMariel = new Auto(true, false, personaNueva, "Lemos Mariel", 0255, 10/01/1997);
        autos.add(new autoMariel();
        Registro registro = new Registro("Mendoza", 022532, autoMariel);

    }
}
