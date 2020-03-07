package com.chen.Test;
import com.chen.Junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    @Before
    public void init()
    {
        System.out.println("execute before tests");
    }
    @After
    public void close()
    {
        System.out.println("always execute after tests");
    }
    @Test
    public void sumTest()
    {
        Calculator c = new Calculator();
        int res = c.sum(1,2);
        Assert.assertEquals(3, res);
    }
}
