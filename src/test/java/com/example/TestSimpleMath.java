package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class TestSimpleMath {

    @Test
    public void testAdd(){
        simpleMath math = new simpleMath();

        int result = math.add(2,4);

        assertEquals(6, result);

    }
}