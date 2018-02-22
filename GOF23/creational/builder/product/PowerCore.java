package GOF23.creational.builder.product;

/**
 * User: Fang Lai<br/>
 * Date: 12/14/2017<br/>
 * Time: 3:45 PM<br/>
 */
public class PowerCore {
    int corePower;

    public PowerCore(int corePower){
        this.corePower = corePower;
        System.out.println("Power Core complete: " + corePower);
    }
}
