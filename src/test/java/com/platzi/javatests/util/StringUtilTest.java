package com.platzi.javatests.util;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilTest {

    @Test
    public void testRepeat() {
        Assert.assertEquals(StringUtil.repeat("hola", 3), "holaholahola");
        Assert.assertEquals(StringUtil.repeat("hola", 1), "hola");
    }

    @Test
    public void isEmptyTrue(){
        boolean result = StringUtil.isEmpty("");
        assertTrue(result);
    }
    @Test
    public void isEmptyFalse(){
        boolean result = StringUtil.isEmpty("Hola");
        assertFalse(result);
    }

}