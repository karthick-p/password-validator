package com.example.kiranp.password_validator;
import org.junit.Test;
import org.junit.Assert;

public class Validator_tester {

    @Test
    public void test1()/*all rules pass*/
    {
        Validator test = new Validator();
        String a = "Km_124567";
        Assert.assertEquals(test.validate(a), 5);
    }
    @Test
    public void test2()/*rule 1 fail*/
    {
        Validator test = new Validator();
        String a = "password";
        Assert.assertEquals(test.validate(a), 1);
    }
    @Test
    public void test3()/*rule 2 fail*/
    {
        Validator test = new Validator();
        String a = "Km_124";
        Assert.assertEquals(test.validate(a), 4);
    }
    @Test
    public void test4()/*rule 3 fail*/
    {
        Validator test = new Validator();
        String a = "Km124567";
        Assert.assertEquals(test.validate(a),3);
    }
    @Test
    public void test5()/*rule 4 fail*/
    {
        Validator test = new Validator();
        String a = "KKKK_m124567";
        Assert.assertEquals(test.validate(a),4);
    }
    @Test
    public void test6()/*rule 5 fail*/
    {
        Validator test = new Validator();
        String a = "Km_Km_Rm";
        Assert.assertEquals(test.validate(a),3);
    }
    @Test
    public void test7()/*all rule fail*/
    {
        Validator test = new Validator();
        String a = "KKKK";
        Assert.assertEquals(test.validate(a),1);
    }

}

