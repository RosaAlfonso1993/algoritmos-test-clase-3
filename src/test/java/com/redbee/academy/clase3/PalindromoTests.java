package com.redbee.academy.clase3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromoTests {

    @Test
    void testPalindromo() {
        Assertions.assertTrue(Palindromo.esPalindromo("anitalavalatina"));
    }

    @Test
    void testPalindromoConEspacios() {
        Assertions.assertTrue(Palindromo.esPalindromo("anita lava la tina"));
    }

    @Test
    void testPalindromoConEspaciosYMayuscula() {
        Assertions.assertTrue(Palindromo.esPalindromo("Anita lava la tina"));
    }

    @Test
    void testPalindromoHola() {
        Assertions.assertFalse(Palindromo.esPalindromo("hola"));
    }
}
