package com.pe2.test;

import com.pe2.code.Q1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Q1Test {
    private Q1 q1;
    @Before
    public void setQ1(){
        q1 = new Q1();
    }

    @Test
    public void checkGetReverse(){
        Assert.assertEquals("abc",q1.getReverse("cba"));
        Assert.assertEquals("!qw",q1.getReverse("wq!"));
        Assert.assertEquals("aba",q1.getReverse("aba"));
    }

    @Test
    public void checkIsPalindrome(){
        Assert.assertTrue(q1.isPalindrome("aba"));
        Assert.assertFalse(q1.isPalindrome("abc"));
    }
}
