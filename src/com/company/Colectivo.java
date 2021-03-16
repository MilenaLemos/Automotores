package com.company;

import java.time.LocalDate;
import java.util.List;

public class Colectivo extends Automotor implements VehiculoACombustion {
    public Colectivo(boolean particular, boolean profesional, Propietario propietario, List<Autorizado> autorizados, Integer patente, LocalDate fechaDeAlta) {
        super(particular, profesional, propietario, autorizados, patente, fechaDeAlta);
    }
}
