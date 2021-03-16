package com.company;

import java.time.LocalDate;
import java.util.List;

public class Motocicleta extends Automotor implements VehiculoACombustion{

    public Motocicleta(boolean particular, boolean profesional, Propietario propietario, List<Autorizado> autorizados, Integer patente, LocalDate fechaDeAlta) {
        super(particular, profesional, propietario, autorizados, patente, fechaDeAlta);
    }
}
