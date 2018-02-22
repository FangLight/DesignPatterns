package GOF23.creational.builder;

import GOF23.creational.builder.product.SpaceShip;

/**
 * User: Fang Lai<br/>
 * Date: 12/14/2017<br/>
 * Time: 5:32 PM<br/>
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public SpaceShip buildSpaceShip(int corePower, int enginePower){
        return builder.buildSpaceShip(corePower, enginePower);
    }
}
