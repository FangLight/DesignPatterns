package DesignPatterns.GOF23.creational.factories;

import DesignPatterns.GOF23.creational.factories.product.BMW;
import DesignPatterns.GOF23.creational.factories.product.Car;
import DesignPatterns.GOF23.creational.factories.product.Tesla;

/**
 * User: Fang Lai<br/>
 * Date: 12/14/2017<br/>
 * Time: 3:31 PM<br/>
 *
 * Easy to implement, hard to extend. Doesn't fulfill Open-Close principle
 *
 */
public class SimpleFactory {
    Car produce(String product) throws Exception{
        if(product.equals("Tesla"))
            return new Tesla();
        else if(product.equals("BMW"))
            return new BMW();
        throw new Exception("Invalid input");
    }

    public static void main(String[] args) throws Exception{
        SimpleFactory factory = new SimpleFactory();
        factory.produce("Tesla").run();
        factory.produce("BMW").run();
    }
}
