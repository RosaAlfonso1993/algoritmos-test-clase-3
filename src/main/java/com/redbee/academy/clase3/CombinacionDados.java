package com.redbee.academy.clase3;

public class CombinacionDados {

    /**
     * Cuando tiramos 2 dados y sumamos los valores es posible generar un resultado comprendido entre 2 al 12.
     *
     * Generar un algoritmo que diga con cuantas combinaciones posibles se puede generar un valor dado.
     *
     * Por ej:
     * Para sacar 4 hay 3 combinaciones posibles: 1+3, 2+2 y 3+1
     * Para sacar 3 hay 2 combinaciones posibles: 1+2 y 2+1
     *Para sacar 4 con 3 dados hay: 1+1+2, 2+1+1, 1+2+1
     * @param valor
     * @return
     */
    public static Integer resolverCombinacionesPosiblesCon2Dados(Integer valor) {
        Integer combinacionesPosibles = 0;
        for(int i = 1; i < valor;i++){
            for(int j = 1; j < valor;j++){
                if(i+j == valor){
                    combinacionesPosibles++;
                }
            }
        }
        return combinacionesPosibles;
    }


    /**
     * Lo mismo pero con 3 dados
     *
     * @param valor
     * @return
     */
    public static Integer resolverCombinacionesPosiblesCon3Dados(Integer valor) {
        Integer combinacionesPosibles = 0;
        for(int i = 1; i < valor;i++){
            for(int j = 1; j < valor;j++){
                if(i+j < valor){
                    for(int k = 1; k < valor;k++){
                        if(i+j+k == valor){
                            combinacionesPosibles++;
                        }
                    }
                }
            }
        }
        return combinacionesPosibles;
    }
}
