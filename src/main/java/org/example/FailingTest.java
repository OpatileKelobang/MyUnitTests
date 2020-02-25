package org.example;

public class FailingTest {
    Car toyota = new Car("Toyota", "Hilux", "2017", "2.7i");
    Car cressida = new Car("Toyota", "Cressida", "2004", "2.4i");

    public void comparison()
    {
        toyota.equals(cressida);
    }
}
