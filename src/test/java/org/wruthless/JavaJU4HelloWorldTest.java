package org.wruthless;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaJU4HelloWorldTest {

    @Test
    public void getHello() {
        JavaJU4HelloWorld javaJU4HelloWorld = new JavaJU4HelloWorld();
        assertEquals("Hello World", javaJU4HelloWorld.getHello());
    }
}
