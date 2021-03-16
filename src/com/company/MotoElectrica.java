package com.company;

import java.time.LocalDate;
import java.util.List;

public class MotoElectrica extends Automotor implements VehiculoElectrico{

    public MotoElectrica(boolean particular, boolean profesional, Propietario propietario, List<Autorizado> autorizados, Integer patente, LocalDate fechaDeAlta) {
        super(particular, profesional, propietario, autorizados, patente, fechaDeAlta);
    }
}
