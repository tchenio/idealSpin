package com.example.idealspin;

import com.example.idealspin.roll.*;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    Item i = new Item("a", 0.1);
    Roll r = new Roll();

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

}