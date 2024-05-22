package com.niltech;

/**
 * Hello world!
 *
 */
public class App 
{
	public int sum(int a,int b) {
		return a+b;
	}
    public static void main( String[] args )
    {
    	App app=new App();
    	System.out.println("Sum is::"+app.sum(100, 20));
    }
}
