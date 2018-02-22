package DesignPatterns.GOF23.creational.builder;

/**
 * User: Fang Lai<br/>
 * Date: 12/14/2017<br/>
 * Time: 4:45 PM<br/>
 *
 * Builder separates the creation steps and assembling steps of an object's sub-units. Therefore, it achieves the decoupling of creation and assembling.
 *
 * Usually only be used in large project with complex components
 *
 * Client only needs the knowledge about director and space ship.
 */
public class Client {

    public static void main(String[] args){
        Director director = new Director(new ConcreteBuilder());
        director.buildSpaceShip(100, 100);
    }

}
