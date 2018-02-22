package GOF23.creational.builder.product;

/**
 * User: Fang Lai<br/>
 * Date: 12/14/2017<br/>
 * Time: 3:45 PM<br/>
 */
public class Engine {
    private int enginePower;

    public Engine(int enginePower){
        this.enginePower = enginePower;
        System.out.println("Engine complete: " + enginePower);
    }
}
