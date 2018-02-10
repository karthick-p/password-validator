package com.example.kiranp.password_validator;
import org.junit.Test;
import org.junit.Assert;

public class Validator_tester {
    @Test
    public void test1()/*all rules pass*/
    {
        Validator test = new Validator();
        String a = "password1";
        Assert.assertEquals(test.validate(a), 2);
    }
    @Test
    public void test2()/*rule 2 fail*/
    {
        Validator test = new Validator();
        String a = "Km_12456";
        Assert.assertEquals(test.validate(a), 1);
    }
    @Test
    public void test3()/*all fail*/
    {
        Validator test = new Validator();
        String a = "Password";
        Assert.assertEquals(test.validate(a), 0);
    }
}

