package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car bmw = new Car("BMW", "X6", "2017", "4.0 V6");
        Car benz = new Car("Mercedes Benz", "C63 AMG BLACK", "2019", "8.0 V10");
        bmw.equals(benz);
        System.out.println( "Hello World!" );
    }
}
