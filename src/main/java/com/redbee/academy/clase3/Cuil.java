package com.redbee.academy.clase3;

import java.util.ArrayList;
import java.util.List;

public class Cuil {

    /**
     * Un CUIL es un número que consta de 11 dígitos y está conformado de la siguiente manera:
     *
     * XX-12345678-Y
     *
     * Donde XX es el tipo de persona física o jurídica y pueden ser los siguientes:
     * 27 es para mujeres
     * 20 es para hombres
     * 23 puede ser ambos (se usa cuando hay otro número igual)
     * 30 empresas
     *
     * Generar un algoritmo para poder calcular el valor de Y que se hace de la siguiente forma:
     * A cada uno de los 10 dígitos que conocemos, se multiplica por: 5, 4, 3, 2, 7, 6, 5, 4, 3, 2 respectivamente
     *
     *
     * Se suman los valores obtenidos, el resultado se divide por 11, y del resultado  se toma el primer decimal.
     * Ese primer decimal se resta a 11 y el resultado es el numero verificador.
     *
     *
     * EJEMPLO
     * DNI 12.345.678 Masculino
     *
     * 2 0 1 2 3 4 5 6 7 8
     * x
     * 5 4 3 2 7 6 5 4 3 2
     * ————————————————————
     * 10+0+3+4+21+24+25+24+21+16= 148
     *
     *
     * 148 dividido 11 = 5 ( porque 148/11= 13,454 –; .454 se redondea a 5).
     * 11-5 = 6
     *
     * Entonces, el CUIL es 20-12345678-6
     *
     * @param tipoPersona
     * @param num
     * @return
     */

    public static List<Integer> convertirDigitosEnLista(Integer num){
        List<Integer> listaDigitos = new ArrayList<>();
        Integer digitosAConvertir = num;

        while (digitosAConvertir > 0){
            listaDigitos.add( digitosAConvertir % 10 );
            digitosAConvertir = digitosAConvertir / 10;
        }
        List<Integer> newListaDigitos = new ArrayList<>();
        Integer contador = listaDigitos.size()-1;
        while (contador >= 0){
            newListaDigitos.add(listaDigitos.get(contador));
            contador--;
        }
        return newListaDigitos;

    }
    public static Integer modificacionDeDoubleAInteger(double valorY){
        Integer valorRespuesta = 0;
        valorY = valorY / 11;
        valorY = valorY - (int)valorY;
        valorY = Math.round(valorY*100.0)/100.0;
        valorY *=10;
        valorRespuesta = (int)valorY;
        if(valorY - (int)valorY > 0){
            valorRespuesta += 1;
        }

        valorRespuesta = 11 - valorRespuesta;
        return valorRespuesta;
    }

    public static Integer calcular(Integer tipoPersona, Integer dni) {
        List<Integer> listaNumeros = new ArrayList<>();
        List<Integer> digitosCuil = new ArrayList<>();
        double valorY = 0;
        Integer valorRespuesta = 0;

        listaNumeros.add(5);
        listaNumeros.add(4);
        listaNumeros.add(3);
        listaNumeros.add(2);
        listaNumeros.add(7);
        listaNumeros.add(6);
        listaNumeros.add(5);
        listaNumeros.add(4);
        listaNumeros.add(3);
        listaNumeros.add(2);

        digitosCuil.addAll(convertirDigitosEnLista(tipoPersona));
        digitosCuil.addAll(convertirDigitosEnLista(dni));

        for(int i = 0; i < digitosCuil.size(); i++){
            valorY += digitosCuil.get(i) * listaNumeros.get(i);
        }

        valorRespuesta = modificacionDeDoubleAInteger(valorY);
        return valorRespuesta;
    }
}
