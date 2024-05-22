package com.niltech;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
    public AppTest( String testName )
    {
        super( testName );
    }

    @Test
    public void testWithPositive()
    {
    	int a=10;
    	int b=20;
    	int expected=30;
    	App app=new App();
    	int actual=app.sum(a, b);
        assertEquals(expected, actual);
    }
    

    @Test
    public void testWithNegative()
    {
    	int a=-10;
    	int b=-20;
    	int expected=-30;
    	App app=new App();
    	int actual=app.sum(a, b);
        assertEquals(expected, actual);
    }
    

    @Test
    public void testWithMixedValue()
    {
    	int a=10;
    	int b=-20;
    	int expected=-10;
    	App app=new App();
    	int actual=app.sum(a, b);
        assertEquals(expected, actual);
    }
}
