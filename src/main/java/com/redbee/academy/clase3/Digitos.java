package com.redbee.academy.clase3;

public class Digitos {


    /**
     * Escriba un programa que determine la cantidad de dígitos en un número
     *
     * @return
     */
    public static Integer resolver(Long numero) {
        Integer cantDigitos = 1;
        long digitosAConvertir = numero;
        if(numero > 0){
            cantDigitos = 0;
            while (digitosAConvertir > 0){
                digitosAConvertir = digitosAConvertir / 10;
                cantDigitos++;
            }
        }
        return cantDigitos;
    }
}
