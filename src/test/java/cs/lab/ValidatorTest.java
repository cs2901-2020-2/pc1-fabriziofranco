package cs.lab;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ValidatorTest {

    public void testTime() throws Exception{
        long startTime = System.currentTimeMillis();
        testCase1();
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        Assert.assertTrue(timeElapsed < 500);
    }

    @Test(invocationCount = 100, threadPoolSize = 100)
    public void testCase1() throws Exception {
        Validator validator = new Validator(false);
        validator.nextClass("Good Format","https://utec.zoom.us/rec/share/Try");
    }


    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testIncorrectFormat () throws Exception{
        Validator validator = new Validator(false);
        validator.nextClass("ZZ","url/adas");
    }

    @Test
    public void testCase2() throws IncorrectFormatException{
        Validator validator = new Validator(false);
        validator.nextClass("Good Format","https://utec.zoom.us/rec/share/Try");
    }



}