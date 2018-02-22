package GOF23.structural.Decorator;

/**
 * User: Fang Lai<br/>
 */
public class Client {
    public static void main(String[] args){
        //create a person who can fly and swim
        Immortal superman = new FlyMan(
                new WaterMan(
                        new Mortal()
                )
        );

        System.out.println("This person can:");
        superman.move();
    }
}

interface Person {
    void move();
}

class Mortal implements Person {

    @Override
    public void move() {
        System.out.println("walk");
    }
}

//Decorator
abstract class Immortal implements Person {
    protected Person person;
}

//Concrete Decorator
class FlyMan extends Immortal{

    public FlyMan(Person person){
        this.person = person;
    }

    @Override
    public void move() {
        System.out.println("fly");
        person.move();
    }
}

//Concrete Decorator
class WaterMan extends Immortal{

    public WaterMan(Person person){
        this.person = person;
    }

    @Override
    public void move() {
        System.out.println("swim");
        person.move();
    }
}

