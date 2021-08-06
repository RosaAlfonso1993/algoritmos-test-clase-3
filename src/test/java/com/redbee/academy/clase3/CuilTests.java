package com.redbee.academy.clase3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CuilTests {


    @Test
    void testCuil() {
        Assertions.assertEquals(6, Cuil.calcular(20, 12345678));
    }

    @Test
    void testDNI() {
        Assertions.assertEquals(Arrays.asList(2,3,4,5,6,7,8), Cuil.convertirDigitosEnLista(2345678));
    }
}
