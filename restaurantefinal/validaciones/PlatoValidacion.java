package com.example.restaurantefinal.validaciones;

import org.springframework.stereotype.Component;

@Component
public class PlatoValidacion {

    public boolean validarPrecio(Integer precio){
        if(precio<0){
            return true;
    }else {
        return false;
        }
    }
    public boolean validarSedeObligatoria(Boolean estado){
        if(estado==null){
        return true;
    }else {
        return false;}
    }
}
