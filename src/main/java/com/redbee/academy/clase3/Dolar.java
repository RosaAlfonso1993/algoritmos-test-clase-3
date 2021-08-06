package com.redbee.academy.clase3;

import java.util.ArrayList;
import java.util.List;

public class Dolar {

    /**
     * Un analista financiero lleva un registro del precio del dólar día a día,
     * y desea saber cuál fue la mayor de las alzas en el precio diario a lo largo de ese período.
     *
     * Escriba un programa que analice el histórico del dólar recibido en una lista.
     *
     * El programa debe entregar como salida cuál fue la mayor de las alzas de un día para el otro.
     *
     * Si en ningún día el precio subió, la salida debe ser: 0.
     * Dia 1: 496.96
     * Dia 2: 499.03
     * Dia 3: 496.03
     * Dia 4: 493.27
     * Dia 5: 488.82
     * Dia 6: 492.16
     * Dia 7: 490.32
     * Dia 8: 490.67
     * Dia 9: 490.89
     * Dia 10: 494.10
     * La mayor alza fue de 3.34 pesos
     *
     * @param historicoDolar
     * @return
     */
    public static Float resolver(List<Float> historicoDolar) {
        List<Float> listaDeAlzas = new ArrayList<>();
        float valorAnterior= historicoDolar.get(0);
        for(int i= 1; i<historicoDolar.size();i++){
            if((historicoDolar.get(i) - valorAnterior) > 0){
                listaDeAlzas.add(historicoDolar.get(i) - valorAnterior);
            }
            valorAnterior = historicoDolar.get(i);
        }
        return (float) (Math.round(sacarMaximo(listaDeAlzas)*100.0)/100.0);
    }

    public static Float sacarMaximo(List<Float> lista){
        float max = lista.get(0);
        for (int i = 0; i<lista.size();i++){
            if(max < lista.get(i)){
                max = lista.get(i);
            }
        }
        return max;
    }
}
