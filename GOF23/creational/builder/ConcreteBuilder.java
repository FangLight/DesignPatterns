package DesignPatterns.GOF23.creational.builder;

import DesignPatterns.GOF23.creational.builder.product.Engine;
import DesignPatterns.GOF23.creational.builder.product.PowerCore;
import DesignPatterns.GOF23.creational.builder.product.SpaceShip;

/**
 * User: Fang Lai<br/>
 * Date: 2/21/2018<br/>
 * Time: 3:46 PM<br/>
 */
public class ConcreteBuilder implements Builder {

    public ConcreteBuilder(){
    }

    @Override
    public SpaceShip buildSpaceShip(int corePower, int enginePower) {
        return new SpaceShip(
                    new Engine(enginePower),
                    new PowerCore(corePower)
                );
    }
}
