package GOF23.creational.factories;

/**
 * User: Fang Lai<br/>
 * Date: 12/14/2017<br/>
 * Time: 3:32 PM<br/>
 *
 * Factory of factories
 *
 * To create classes implementing multiple interfaces, simple factories and factories method are no longer suitable.
 */
public class AbstractFactory {
    public static void main(String args[]){
        IAbstractFactory bigfactory = new FirstFactory();
        IAbstractFactory smallfactory = new SecondFactory();
        bigfactory.producePhone().run();
        bigfactory.produceHeadset().play();
        smallfactory.producePhone().run();
        smallfactory.produceHeadset().play();
    }
}
//Abstract Product
interface Headset{
    void play();
}
//Abstract Product
interface Phone {
    void run();
}
//Concrete Product
class IPhone implements Phone {
    @Override
    public void run() {
        System.out.println("This is iPhone");
    }
}
class Samsung implements Phone {
    @Override
    public void run() {
        System.out.println("This is Samsung");
    }
}
class Beats implements Headset{
    @Override
    public void play() {
        System.out.println("This is Beats");
    }
}
class sennheiser implements Headset{
    @Override
    public void play() {
        System.out.println("This is Sennheiser");
    }
}
//Abstract Factory
interface IAbstractFactory {
    Phone producePhone();
    Headset produceHeadset();
}
//Concrete Factory
class FirstFactory implements IAbstractFactory {
    @Override
    public Phone producePhone() {
        return new IPhone();
    }
    @Override
    public Headset produceHeadset() {
        return new sennheiser();
    }
}
//Concrete Factory
class SecondFactory implements IAbstractFactory {
    @Override
    public Phone producePhone() {
        return new Samsung();
    }
    @Override
    public Headset produceHeadset() {
        return new Beats();
    }
}

