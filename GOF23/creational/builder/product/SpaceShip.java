package DesignPatterns.GOF23.creational.builder.product;

/**
 * User: Fang Lai<br/>
 * Date: 12/14/2017<br/>
 * Time: 3:45 PM<br/>
 */
public class SpaceShip {
    PowerCore core;
    Engine engine;

    public SpaceShip(Engine engine, PowerCore core){
        System.out.println("Assemble space ship");
        this.engine = engine;
        this.core = core;
        System.out.println("complete!");
    }
}
