package com.redbee.academy.clase3;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Palindromo {

    /**
     * Generar un algoritmo que resuelva si una palabra es palindramo.
     *
     * Una palabra es palindromo cuando se lee de izquierda a derecha y de derecha a izquierda.
     * Por ej: neuquen
     *
     * @param palabra
     * @return
     */

    public static List<Character> convertirPalabrasEnLetras(List<Character> lista,String palabra){
        for (int i = 0;i<palabra.length();i++){
            if(palabra.charAt(i) != 32){
                lista.add(Character.toLowerCase(palabra.charAt(i)));
            }
        }
        return lista;
    }

    public static List<Character> voltearLista(List<Character> lista){
        List<Character> newList = new ArrayList<>();
        for (int i = lista.size()-1; i>=0;i--){
            newList.add(lista.get(i));
        }
        return newList;
    }

    public static Boolean esPalindromo(String palabra) {
        List<Character> lista = new ArrayList<>();
        List<Character> listaAux = new ArrayList<>();
        boolean esPalindromo = true;
        convertirPalabrasEnLetras(lista,palabra);
        convertirPalabrasEnLetras(listaAux,palabra);
        listaAux = voltearLista(listaAux);

        for(int i = 0;i < lista.size(); i++ ){
            if(lista.get(i) != listaAux.get(i)){
                esPalindromo = false;
            }
        }

        return esPalindromo;
    }
}
