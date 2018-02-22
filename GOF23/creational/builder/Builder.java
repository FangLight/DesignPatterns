package DesignPatterns.GOF23.creational.builder;

import DesignPatterns.GOF23.creational.builder.product.SpaceShip;

/**
 * User: Fang Lai<br/>
 * Date: 12/14/2017<br/>
 * Time: 5:32 PM<br/>
 */
public interface Builder {
    SpaceShip buildSpaceShip(int corePower, int enginePower);
}

