package com.pe2.test;

import com.pe2.code.Q2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Q2Test {
    Q2 q2;
    @Before
    public void setQ2(){
        q2 = new Q2();
    }

    @Test
    public void checkIsPower(){
        Assert.assertTrue(q2.isPower(64));
        Assert.assertTrue(q2.isPower(16));
        Assert.assertFalse(q2.isPower(15));
        Assert.assertFalse(q2.isPower(0));
    }

}
