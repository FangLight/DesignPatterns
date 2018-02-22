package DesignPatterns.GOF23.creational.factories;

import DesignPatterns.GOF23.creational.factories.product.BMW;
import DesignPatterns.GOF23.creational.factories.product.Car;
import DesignPatterns.GOF23.creational.factories.product.Tesla;

/**
 * User: Fang Lai<br/>
 * Date: 12/14/2017<br/>
 * Time: 1:32 PM<br/>
 *
 * Follows the design principle of OPC, DIP and LoD
 *
 * However, from the perspective of complexity of structure and code, simple factories is better.
 *
 */
public class FactoryMethod {
    public static void main(String[] args){
        IFactory factory;
        factory = new TeslaFactory();
        factory.produce().run();
        factory = new BMWFactory();
        factory.produce().run();
    }
}

//Abstract Factory
interface IFactory{
    Car produce();
}

//Concrete Factories
class TeslaFactory implements IFactory{
    @Override
    public Car produce() {
        return new Tesla();
    }
}
class BMWFactory implements IFactory {
    @Override
    public Car produce() {
        return new BMW();
    }
}