package DesignPatterns.GOF23.creational.factories.product;

/**
 * User: Fang Lai<br/>
 * Date: 12/14/2017<br/>
 * Time: 3:35 PM<br/>
 */
public class BMW implements Car{
    @Override
    public void run() {
        System.out.println("This is BMW");
    }
}
